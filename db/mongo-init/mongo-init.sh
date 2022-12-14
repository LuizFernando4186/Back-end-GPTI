mongo --  "$MONGODB_DATABASE" <<EOF
    var rootUser = '$MONGO_INITDB_ROOT_USERNAME';
    var rootPassword = '$MONGO_INITDB_ROOT_PASSWORD';
    var admin = db.getSiblingDB('admin');
    admin.auth(rootUser, rootPassword);

    var user = '$MONGODB_USERNAME';
    var passwd = '$MONGODB_PASSWORD';
    db.createUser({user: user, pwd: passwd, roles :  [{role: "readWrite", db: "$MONGODB_DATABASE"}]});
EOF