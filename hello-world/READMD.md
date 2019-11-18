##Users CRUD API
####To Create Users
```
curl -H'Content-Type:application/json' -XPOST localhost:8080/users -d '{"firstName":"John", "lastName":"Smith"}'
```

####To Get Users
```
curl -H'Content-Type:application/json' localhost:8080/users/<give the ID returned from create API>
```
