SUMMARY = "The libfreefare project provides a convenient API for MIFARE card manipulations."
HOMEPAGE = "http://nfc-tools.org/index.php?title=Libfreefare"
SECTION = "libs"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=9827bc32c2b36ae4121d6583b582c9c0"

DEPENDS = "libusb-compat libnfc"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "48c9383ce1d33ba35463b27ecd1f20cf856e1568"
SRC_URI = "git://github.com/nfc-tools/libfreefare.git"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

