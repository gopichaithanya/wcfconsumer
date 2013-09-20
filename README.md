WCF Consumer example
====================

This simple example shows how to consume WCF (dotnet) SOAP web
services from mule. Receives an order requests from a HTML form through HTTP 
and depending on the quantity, send it to a file on the filesystem, or invokes a 
WCF SOAP web service. 

To run it, open src/test/visualstudio2012-project/wcfmule.sln with
Visual Studio Express 2012 and hit Debug->Start new instance, to
start the WCF Service. Double check the port that the service binds to
on the system tray and update the http-endpoint near the end of the
mule flow changing the default value of "49676" (wcfconsumer.mflow on
MuleStudio)

Start the mule flow on MuleStudio and next, open
src/main/resources/form.html on your favorite browser, fill in some
values on the form and hit submit. Check the output on the MuleStudio
console. Wholesale orders (with quantity greter than 100) are stored
on "src/test/resources" and retail orders (with quantity lesser than 100)
are submitted to the WCF service.

Questions or comments are welcome at <jesus.deoliveira (at) mulesoft.com>
