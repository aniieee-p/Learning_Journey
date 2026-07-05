select tweet_id
from Tweets
where CHAR_LENGTH(content) > 15;

# CHAR_LENGTH TELLS IN CHAR
# LENGTH() IN BYTES

-- # Write your MySQL query statement below
-- select tweet_id
-- from Tweets
-- where tweet_id = 2;