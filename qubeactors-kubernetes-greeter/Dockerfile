FROM openjdk:12.0.2
EXPOSE 8080
EXPOSE 9999
ADD ./build/distributions/*.tar /
ADD ./*.pl /
ENTRYPOINT ["bash", "/qubeactors-kubernetes-greeter-1.0/bin/qubeactors-kubernetes-greeter"]