FROM openjdk:12.0.2
EXPOSE 8080
ADD ./build/distributions/*.tar /
ADD ./*.pl /
RUN ls /qubeactors-sandbox-1.0/bin
ENTRYPOINT ["bash", "/qubeactors-sandbox-1.0/bin/qubeactors-sandbox"]