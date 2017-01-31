#Hi-color on unexpanded QL (dithvide)

(C) Omega 2006 (omega.webnode.com)


Inventor of the "dithvide" name and method is Zilog - well known programmer and hardware developer, author of divIDE interface for ZX Spectrum.

Basically, two images are altering (interlacing) each frame interrupt (50Hz), thus color of one pixel is in fact average color of two different pixels. Let's imagine that we flicker with black and white - average color is Grey. Similar applies to all other combinations. On the QL we can also play with resolutions, thus we have following options:

    Low res dithvide - two 8 color 256x256 images interlaced
    High res dithvide - two 4 color 512x256 images interlaced
    Mixed res dithvide - 8 color and 4 color images interlaced

First two modes are pretty easy and straighforward to display - simply change every frame int displayed videopage, Mixed mode is a bit harder and you need precise timing to display each scan line in different resolution. It is very similar to "multicolor" method on ZX Spectrum.

#Command synopsis, from call in SuperBASIC
r 0 - sets low resolution mode

r 4 - sets high resolution mode

r 8 - sets mixed resolution mode

#Graphics files
Name files as "1_dvd", and "2_dvd"
In case of mixed mode, mode-4 picture is "1_dvd", mode-8 is "2_dvd"

