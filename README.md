

## Import data to mysql

```shell
cd mysql
wget -P ./mysql/airport-db https://downloads.mysql.com/docs/airport-db.zip
unzip airport-db.zip
```

```shell
docker-compose up -d
docker-compose exec mysql sh
```

```shell
# inside mysql container sh
cd var
mysqlsh

mysqlsh/JS > util.loadDump("airport-db", {threads: 8, createInvisiblePKs:false, deferTableIndexes: "all", ignoreVersion: true})
```