
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

# Member Domain Design
### Member Domain Relation
<img width="709" alt="스크린샷 2023-06-02 오전 6 37 43" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/e859c8a6-f1d6-4771-98fe-0a54a5d5cf5e">

### Member Class Diagram
<img width="573" alt="스크린샷 2023-06-02 오전 6 37 47" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/ee3dd129-9125-4133-ba52-1ee204f2b4c4">

### Member Object Diagram
<img width="651" alt="스크린샷 2023-06-02 오전 6 37 53" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/3b23d15e-5dac-4fb4-a4fe-571862311132">

# Order Domain Design
### Total
<img width="785" alt="스크린샷 2023-06-02 오후 5 33 06" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/3b142b36-742c-46de-bda3-4b1ffd699f21">

# Total Logic
<img width="777" alt="스크린샷 2023-06-04 오전 7 25 06" src="https://github.com/gimminjae/Spring-RoadMap/assets/97084128/e620c035-8f76-44e0-a5e9-6de23719dec6">
