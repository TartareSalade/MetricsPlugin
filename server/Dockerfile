FROM eclipse-temurin:21-jre

LABEL org.opencontainers.image.authors="sany.bakir@epita.fr"

WORKDIR /server

RUN apt-get update && apt-get install -y curl
ENV PAPER_VERSION=1.21
ENV PAPER_BUILD=130
RUN curl -o paper.jar https://api.papermc.io/v2/projects/paper/versions/${PAPER_VERSION}/builds/${PAPER_BUILD}/downloads/paper-${PAPER_VERSION}-${PAPER_BUILD}.jar

RUN echo "eula=true" > eula.txt

CMD ["java", "-Xms1G", "-Xmx2G", "-jar", "paper.jar", "--nogui"]