'''
Created on 2011-10-9

@author: sundl
'''

import os
import re

if __name__ == '__main__':
    print 'Current Working Directory:',os.getcwd()
    
    print re.findall(r'\bf[a-z]*', 'which foot or hand fell fastest')
    
    file = open('test.txt', 'r+');
    for line in file:
        print line,
    
#    file.write('test2');