FROM openjdk:12.0.2
EXPOSE 8080
ADD ./build/distributions/*.tar /
ADD ./*.pl /
ENTRYPOINT ["bash", "/qubeactors-sandbox-1.0/bin/qubeactors-sandbox"]