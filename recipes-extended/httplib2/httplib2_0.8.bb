DESCRIPTION = "httplib2 support"
LICENSE = "Httplib2 Software License"
SECTION = "console/tools"
PR = "r2"

LIC_FILES_CHKSUM="file://README;beginline=98;md5=120ce862d2d29067fab9559797dd3674"

SRC_URI="https://httplib2.googlecode.com/files/${P}.tar.gz"
SRC_URI[md5sum]="a143657998f6752be998e2ec740e7dec"
SRC_URI[sha256sum]="af689bc3cb10a95721eb0d0cf806202a699e7799dacd3497f63b48b2ba429c3f"

DEPENDS = "python"
RDEPENDS_httplib2 = "python"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

do_install_append() {
  rm -f ${D}${libdir}/python*/site-packages/site.py*
}
