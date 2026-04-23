```bash 
http POST :9001/books author="Lyra Silverstar" \
title="Northern Lights" isbn="1234567891" price=9.90
```

```bash
http :9001/books/1234567891
```

```bash
http POST :9001/books author="Jon Snow" title="" isbn="123ABC456Z" price="9.90"
```

```bash
docker run -d \
  --name polar-postgres\
  --net catalog-network\
  -e POSTGRES_USER=user\
  -e POSTGRES_PASSWORD=password\
  -e POSTGRES_DB=polardb_catalog\
  -p 5432:5432\
  postgres:14.4
```

```bash
docker run -d \
--name catalog-service \
--net catalog-network \
-p 9001:9001 \
-e SPRING_DATASOURCE_URL=jdbc:postgresql://polar-postgres:5432/polardb_catalog \
-e SPRING_PROFILES_ACTIVE=testdata \
catalog-service
```

```bash
./gradlew bootBuildImage \
--imageName ghcr.io/nightletter-cnsia/catalog-service \
--publishImage \
-PregistryUrl=ghcr.io \
-PregistryUsername=nightletter \
-PregistryToken=
```

```bash
./gradlew bootBuildImage --builder ghcr.io/thomasvitale/java-builder-arm64
```

```bash
tilt up
```

```bash
kubeconform -strict -summary [디렉터리]
```