docker run -d --rm --name rockepll-local \
  -e MYSQL_ROOT_PASSWORD=1234 \
  -e MYSQL_ROOT_HOST='%' \
  -e MYSQL_DATABASE=rockpell \
  -e TZ=Asia/Seoul \
  -p 3306:3306 mysql:8.0 --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci --sql_mode=""