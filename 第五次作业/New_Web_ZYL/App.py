# -*- coding: utf-8 -*-
from flask import Flask, request, render_template

app = Flask(__name__)

@app.route('/', methods=['GET', 'POST'])
#def home():
#    return render_template('ch14_03.html')
def home():
    return render_template('home.html')

@app.route('/signin', methods=['GET'])
def signin_form():
    return render_template('form.html')

@app.route('/signin', methods=['POST'])
def signin():
    username = request.form['username']
    password = request.form['password']
    if username=='admin' and password=='password':
        return render_template('signin-ok.html', username=username)
    return render_template('form.html', message='Bad username or password', username=username)
@app.route('/ch', methods=['GET'])
def ch():
    return render_template('ch14_03.html')

if __name__ == '__main__':
    app.run()
