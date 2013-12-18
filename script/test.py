__author__ = 'seven_blue_sea'

from boto.s3.connection import S3Connection
from boto.s3.key import Key

AWS_KEY_ID = "AKIAJWXZVKUZORPH3JNA"
AWS_SECRET_KEY = "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"
BUCKET_NAME = "tmp-travis"

def main():
    conn = S3Connection(AWS_KEY_ID, AWS_SECRET_KEY, host='s3-ap-northeast-1.amazonaws.com')
    bucket = conn.get_bucket(BUCKET_NAME)
    key = Key(bucket)
    key.key = ""
    key.set_contents_from_filename("test.png")
    print "test python"

if __name__ == '__main__':
    main()
