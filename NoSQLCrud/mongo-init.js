db.createUser(
        {
            user: "crudAdmin",
            pwd: "crudAdmin",
            roles: [
                {
                    role: "readWrite",
                    db: "MongoCrud"
                }
            ]
        }
);