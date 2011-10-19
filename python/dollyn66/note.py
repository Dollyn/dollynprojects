'''
Created on 2011-10-19

@author: sundl
'''

from google.appengine.api import users
from google.appengine.ext import db, webapp
from google.appengine.ext.webapp import template
from google.appengine.ext.webapp.util import run_wsgi_app

import cgi
import datetime
import os
import urllib
import wsgiref.handlers


class Category(db.Model):
    author = db.UserProperty()
    date = db.DateTimeProperty(auto_now_add=True)
    description = db.StringProperty()

class Note(db.Model):
    author = db.UserProperty()
    content = db.StringProperty(multiline=True)
    date = db.DateTimeProperty(auto_now_add=True)
    
class MainPage(webapp.RequestHandler):
    def get(self):
        self.response.out.write('<html><body>')
        notes_query = Note.all().order('-date');
        notes = notes_query.fetch(10)

        if users.get_current_user():
            url = users.create_logout_url(self.request.uri)
            url_linktext = 'Logout'
        else:
            url = users.create_login_url(self.request.uri)
            url_linktext = 'Login'

        template_values = {
            'notes': notes,
            'url': url,
            'url_linktext': url_linktext,
        }
        
        path = os.path.join(os.path.dirname(__file__), 'index.html')
        self.response.out.write(template.render(path, template_values))
        
    
    def post(self):
        note = Note()

        if users.get_current_user():
            note.author = users.get_current_user()

        note.content = self.request.get('content')
        note.put()
        self.redirect('/notes/')

application = webapp.WSGIApplication([
  ('/notes/', MainPage),
  ('/notes/post', MainPage)
], debug=True)

def main():
    run_wsgi_app(application)

if __name__ == '__main__':
    main()
