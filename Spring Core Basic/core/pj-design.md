
# Business Requirements And Architecture(Design)
### Member
- join and select
- Roles of member are normal and VIP
- DB is decided yet.
### Order And Discount Policy
- Member can order item.
- Discount Policy is applied according to member grade.
- Discount Policy: All VIP can get a fixed discount of 1,000 won.
- Discount Policy can be changed at a high probability.
### Advise
We can't wait for the Member Data and Discount Policy to be decided.
We will design to change Implement Object at any time.