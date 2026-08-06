package io.intercom.android.sdk.survey.block;

import android.net.Uri;
import com.intercom.twig.BuildConfig;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.ci4;
import defpackage.f50;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.jt1;
import defpackage.oh4;
import defpackage.ov0;
import defpackage.ox6;
import defpackage.xj5;
import defpackage.xj8;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.survey.block.ImageBlockKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ImageBlockKt {
    /* JADX WARN: Code duplicated, block: B:100:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0136  */
    /* JADX WARN: Code duplicated, block: B:112:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x013e  */
    /* JADX WARN: Code duplicated, block: B:114:0x014a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0150  */
    /* JADX WARN: Code duplicated, block: B:120:0x0169  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:96:0x0101  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    /* JADX INFO: renamed from: ImageBlock-V-9fs2A, reason: not valid java name */
    public static final void m439ImageBlockV9fs2A(final Block block, ox6 ox6Var, oh4<? super Block, g2b> oh4Var, boolean z, ImageRenderType imageRenderType, long j, jt1 jt1Var, final int i, final int i2) {
        Block block2;
        int i3;
        ox6 ox6Var2;
        int i4;
        oh4<? super Block, g2b> oh4Var2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        ImageRenderType imageRenderType2;
        int i9;
        long jM757getBubbleBackground0d7_KjU;
        final ox6 ox6Var3;
        oh4<? super Block, g2b> oh4Var3;
        oh4<? super Block, g2b> oh4Var4;
        boolean z3;
        String url;
        Uri localUri;
        Object objF;
        final boolean z4;
        final long j2;
        final oh4<? super Block, g2b> oh4Var5;
        String previewUrl;
        final ImageRenderType imageRenderType3;
        xj8 xj8VarW;
        block.getClass();
        bj4 bj4VarO = jt1Var.o(1837674486);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            block2 = block;
        } else {
            block2 = block;
            if ((i & 6) == 0) {
                i3 = (bj4VarO.j(block2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        z2 = z;
                        if (bj4VarO.c(z2)) {
                            i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            imageRenderType2 = imageRenderType;
                            if (bj4VarO.J(imageRenderType2)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                jM757getBubbleBackground0d7_KjU = j;
                                int i11 = bj4VarO.i(jM757getBubbleBackground0d7_KjU) ? 131072 : 65536;
                                i3 |= i11;
                            } else {
                                jM757getBubbleBackground0d7_KjU = j;
                            }
                            i3 |= i11;
                        } else {
                            jM757getBubbleBackground0d7_KjU = j;
                        }
                        if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                            bj4VarO.v0();
                            if ((i & 1) != 0 || bj4VarO.c0()) {
                                if (i10 != 0) {
                                    ox6Var3 = ox6.a.t;
                                } else {
                                    ox6Var3 = ox6Var2;
                                }
                                if (i4 != 0) {
                                    oh4Var3 = null;
                                } else {
                                    oh4Var3 = oh4Var2;
                                }
                                if (i6 != 0) {
                                    z2 = false;
                                }
                                if (i8 != 0) {
                                    imageRenderType2 = ImageRenderType.CROPPED;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    oh4Var4 = oh4Var3;
                                    jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                                } else {
                                    oh4Var4 = oh4Var3;
                                }
                            } else {
                                bj4VarO.u();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                ox6Var3 = ox6Var2;
                                oh4Var4 = oh4Var2;
                            }
                            bj4VarO.V();
                            if (!getHasUri(block2) || !z2 || (previewUrl = block2.getPreviewUrl()) == null || previewUrl.length() == 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (getHasUri(block2)) {
                                localUri = block2.getLocalUri();
                            } else if (z3) {
                                String previewUrl2 = block2.getPreviewUrl();
                                previewUrl2.getClass();
                                localUri = Uri.parse(previewUrl2);
                            } else {
                                url = block2.getUrl();
                                if (url == null) {
                                    url = BuildConfig.FLAVOR;
                                }
                                localUri = Uri.parse(url);
                            }
                            long j3 = jM757getBubbleBackground0d7_KjU;
                            String path = localUri.getPath();
                            bj4VarO.K(2072025254);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = bl7.i(f50.a.C0085a.a);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path, localUri, j3, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                            z4 = z2;
                            j2 = j3;
                            oh4Var5 = oh4Var4;
                        } else {
                            bj4VarO.u();
                            ox6Var3 = ox6Var2;
                            oh4Var5 = oh4Var2;
                            z4 = z2;
                            j2 = jM757getBubbleBackground0d7_KjU;
                        }
                        imageRenderType3 = imageRenderType2;
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: n75
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i3 |= 24576;
                    imageRenderType2 = imageRenderType;
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            jM757getBubbleBackground0d7_KjU = j;
                            if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                            }
                            i3 |= i11;
                        } else {
                            jM757getBubbleBackground0d7_KjU = j;
                        }
                        i3 |= i11;
                    } else {
                        jM757getBubbleBackground0d7_KjU = j;
                    }
                    if ((74899 & i3) == 74898) {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        } else {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        }
                        bj4VarO.V();
                        if (getHasUri(block2)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (getHasUri(block2)) {
                            localUri = block2.getLocalUri();
                        } else if (z3) {
                            String previewUrl3 = block2.getPreviewUrl();
                            previewUrl3.getClass();
                            localUri = Uri.parse(previewUrl3);
                        } else {
                            url = block2.getUrl();
                            if (url == null) {
                                url = BuildConfig.FLAVOR;
                            }
                            localUri = Uri.parse(url);
                        }
                        long j4 = jM757getBubbleBackground0d7_KjU;
                        String path2 = localUri.getPath();
                        bj4VarO.K(2072025254);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = bl7.i(f50.a.C0085a.a);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path2, localUri, j4, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                        z4 = z2;
                        j2 = j4;
                        oh4Var5 = oh4Var4;
                    } else {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        } else {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        }
                        bj4VarO.V();
                        if (getHasUri(block2)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (getHasUri(block2)) {
                            localUri = block2.getLocalUri();
                        } else if (z3) {
                            String previewUrl4 = block2.getPreviewUrl();
                            previewUrl4.getClass();
                            localUri = Uri.parse(previewUrl4);
                        } else {
                            url = block2.getUrl();
                            if (url == null) {
                                url = BuildConfig.FLAVOR;
                            }
                            localUri = Uri.parse(url);
                        }
                        long j5 = jM757getBubbleBackground0d7_KjU;
                        String path3 = localUri.getPath();
                        bj4VarO.K(2072025254);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = bl7.i(f50.a.C0085a.a);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path3, localUri, j5, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                        z4 = z2;
                        j2 = j5;
                        oh4Var5 = oh4Var4;
                    }
                    imageRenderType3 = imageRenderType2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: n75
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 3072;
                z2 = z;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        imageRenderType2 = imageRenderType;
                        if (bj4VarO.J(imageRenderType2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            jM757getBubbleBackground0d7_KjU = j;
                            if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                            }
                            i3 |= i11;
                        } else {
                            jM757getBubbleBackground0d7_KjU = j;
                        }
                        i3 |= i11;
                    } else {
                        jM757getBubbleBackground0d7_KjU = j;
                    }
                    if ((74899 & i3) == 74898) {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        } else {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        }
                        bj4VarO.V();
                        if (getHasUri(block2)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (getHasUri(block2)) {
                            localUri = block2.getLocalUri();
                        } else if (z3) {
                            String previewUrl5 = block2.getPreviewUrl();
                            previewUrl5.getClass();
                            localUri = Uri.parse(previewUrl5);
                        } else {
                            url = block2.getUrl();
                            if (url == null) {
                                url = BuildConfig.FLAVOR;
                            }
                            localUri = Uri.parse(url);
                        }
                        long j6 = jM757getBubbleBackground0d7_KjU;
                        String path4 = localUri.getPath();
                        bj4VarO.K(2072025254);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = bl7.i(f50.a.C0085a.a);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path4, localUri, j6, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                        z4 = z2;
                        j2 = j6;
                        oh4Var5 = oh4Var4;
                    } else {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        } else {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        }
                        bj4VarO.V();
                        if (getHasUri(block2)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (getHasUri(block2)) {
                            localUri = block2.getLocalUri();
                        } else if (z3) {
                            String previewUrl6 = block2.getPreviewUrl();
                            previewUrl6.getClass();
                            localUri = Uri.parse(previewUrl6);
                        } else {
                            url = block2.getUrl();
                            if (url == null) {
                                url = BuildConfig.FLAVOR;
                            }
                            localUri = Uri.parse(url);
                        }
                        long j7 = jM757getBubbleBackground0d7_KjU;
                        String path5 = localUri.getPath();
                        bj4VarO.K(2072025254);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = bl7.i(f50.a.C0085a.a);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path5, localUri, j7, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                        z4 = z2;
                        j2 = j7;
                        oh4Var5 = oh4Var4;
                    }
                    imageRenderType3 = imageRenderType2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: n75
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                imageRenderType2 = imageRenderType;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        jM757getBubbleBackground0d7_KjU = j;
                        if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                        }
                        i3 |= i11;
                    } else {
                        jM757getBubbleBackground0d7_KjU = j;
                    }
                    i3 |= i11;
                } else {
                    jM757getBubbleBackground0d7_KjU = j;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    }
                    bj4VarO.V();
                    if (getHasUri(block2)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (getHasUri(block2)) {
                        localUri = block2.getLocalUri();
                    } else if (z3) {
                        String previewUrl7 = block2.getPreviewUrl();
                        previewUrl7.getClass();
                        localUri = Uri.parse(previewUrl7);
                    } else {
                        url = block2.getUrl();
                        if (url == null) {
                            url = BuildConfig.FLAVOR;
                        }
                        localUri = Uri.parse(url);
                    }
                    long j8 = jM757getBubbleBackground0d7_KjU;
                    String path6 = localUri.getPath();
                    bj4VarO.K(2072025254);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = bl7.i(f50.a.C0085a.a);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path6, localUri, j8, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                    z4 = z2;
                    j2 = j8;
                    oh4Var5 = oh4Var4;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    }
                    bj4VarO.V();
                    if (getHasUri(block2)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (getHasUri(block2)) {
                        localUri = block2.getLocalUri();
                    } else if (z3) {
                        String previewUrl8 = block2.getPreviewUrl();
                        previewUrl8.getClass();
                        localUri = Uri.parse(previewUrl8);
                    } else {
                        url = block2.getUrl();
                        if (url == null) {
                            url = BuildConfig.FLAVOR;
                        }
                        localUri = Uri.parse(url);
                    }
                    long j9 = jM757getBubbleBackground0d7_KjU;
                    String path7 = localUri.getPath();
                    bj4VarO.K(2072025254);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = bl7.i(f50.a.C0085a.a);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path7, localUri, j9, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                    z4 = z2;
                    j2 = j9;
                    oh4Var5 = oh4Var4;
                }
                imageRenderType3 = imageRenderType2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: n75
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            oh4Var2 = oh4Var;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        imageRenderType2 = imageRenderType;
                        if (bj4VarO.J(imageRenderType2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            jM757getBubbleBackground0d7_KjU = j;
                            if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                            }
                            i3 |= i11;
                        } else {
                            jM757getBubbleBackground0d7_KjU = j;
                        }
                        i3 |= i11;
                    } else {
                        jM757getBubbleBackground0d7_KjU = j;
                    }
                    if ((74899 & i3) == 74898) {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        } else {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        }
                        bj4VarO.V();
                        if (getHasUri(block2)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (getHasUri(block2)) {
                            localUri = block2.getLocalUri();
                        } else if (z3) {
                            String previewUrl9 = block2.getPreviewUrl();
                            previewUrl9.getClass();
                            localUri = Uri.parse(previewUrl9);
                        } else {
                            url = block2.getUrl();
                            if (url == null) {
                                url = BuildConfig.FLAVOR;
                            }
                            localUri = Uri.parse(url);
                        }
                        long j10 = jM757getBubbleBackground0d7_KjU;
                        String path8 = localUri.getPath();
                        bj4VarO.K(2072025254);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = bl7.i(f50.a.C0085a.a);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path8, localUri, j10, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                        z4 = z2;
                        j2 = j10;
                        oh4Var5 = oh4Var4;
                    } else {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        } else {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        }
                        bj4VarO.V();
                        if (getHasUri(block2)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (getHasUri(block2)) {
                            localUri = block2.getLocalUri();
                        } else if (z3) {
                            String previewUrl10 = block2.getPreviewUrl();
                            previewUrl10.getClass();
                            localUri = Uri.parse(previewUrl10);
                        } else {
                            url = block2.getUrl();
                            if (url == null) {
                                url = BuildConfig.FLAVOR;
                            }
                            localUri = Uri.parse(url);
                        }
                        long j11 = jM757getBubbleBackground0d7_KjU;
                        String path9 = localUri.getPath();
                        bj4VarO.K(2072025254);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = bl7.i(f50.a.C0085a.a);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path9, localUri, j11, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                        z4 = z2;
                        j2 = j11;
                        oh4Var5 = oh4Var4;
                    }
                    imageRenderType3 = imageRenderType2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: n75
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                imageRenderType2 = imageRenderType;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        jM757getBubbleBackground0d7_KjU = j;
                        if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                        }
                        i3 |= i11;
                    } else {
                        jM757getBubbleBackground0d7_KjU = j;
                    }
                    i3 |= i11;
                } else {
                    jM757getBubbleBackground0d7_KjU = j;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    }
                    bj4VarO.V();
                    if (getHasUri(block2)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (getHasUri(block2)) {
                        localUri = block2.getLocalUri();
                    } else if (z3) {
                        String previewUrl11 = block2.getPreviewUrl();
                        previewUrl11.getClass();
                        localUri = Uri.parse(previewUrl11);
                    } else {
                        url = block2.getUrl();
                        if (url == null) {
                            url = BuildConfig.FLAVOR;
                        }
                        localUri = Uri.parse(url);
                    }
                    long j12 = jM757getBubbleBackground0d7_KjU;
                    String path10 = localUri.getPath();
                    bj4VarO.K(2072025254);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = bl7.i(f50.a.C0085a.a);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path10, localUri, j12, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                    z4 = z2;
                    j2 = j12;
                    oh4Var5 = oh4Var4;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    }
                    bj4VarO.V();
                    if (getHasUri(block2)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (getHasUri(block2)) {
                        localUri = block2.getLocalUri();
                    } else if (z3) {
                        String previewUrl12 = block2.getPreviewUrl();
                        previewUrl12.getClass();
                        localUri = Uri.parse(previewUrl12);
                    } else {
                        url = block2.getUrl();
                        if (url == null) {
                            url = BuildConfig.FLAVOR;
                        }
                        localUri = Uri.parse(url);
                    }
                    long j13 = jM757getBubbleBackground0d7_KjU;
                    String path11 = localUri.getPath();
                    bj4VarO.K(2072025254);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = bl7.i(f50.a.C0085a.a);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path11, localUri, j13, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                    z4 = z2;
                    j2 = j13;
                    oh4Var5 = oh4Var4;
                }
                imageRenderType3 = imageRenderType2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: n75
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            z2 = z;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    imageRenderType2 = imageRenderType;
                    if (bj4VarO.J(imageRenderType2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        jM757getBubbleBackground0d7_KjU = j;
                        if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                        }
                        i3 |= i11;
                    } else {
                        jM757getBubbleBackground0d7_KjU = j;
                    }
                    i3 |= i11;
                } else {
                    jM757getBubbleBackground0d7_KjU = j;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    }
                    bj4VarO.V();
                    if (getHasUri(block2)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (getHasUri(block2)) {
                        localUri = block2.getLocalUri();
                    } else if (z3) {
                        String previewUrl13 = block2.getPreviewUrl();
                        previewUrl13.getClass();
                        localUri = Uri.parse(previewUrl13);
                    } else {
                        url = block2.getUrl();
                        if (url == null) {
                            url = BuildConfig.FLAVOR;
                        }
                        localUri = Uri.parse(url);
                    }
                    long j14 = jM757getBubbleBackground0d7_KjU;
                    String path12 = localUri.getPath();
                    bj4VarO.K(2072025254);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = bl7.i(f50.a.C0085a.a);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path12, localUri, j14, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                    z4 = z2;
                    j2 = j14;
                    oh4Var5 = oh4Var4;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    }
                    bj4VarO.V();
                    if (getHasUri(block2)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (getHasUri(block2)) {
                        localUri = block2.getLocalUri();
                    } else if (z3) {
                        String previewUrl14 = block2.getPreviewUrl();
                        previewUrl14.getClass();
                        localUri = Uri.parse(previewUrl14);
                    } else {
                        url = block2.getUrl();
                        if (url == null) {
                            url = BuildConfig.FLAVOR;
                        }
                        localUri = Uri.parse(url);
                    }
                    long j15 = jM757getBubbleBackground0d7_KjU;
                    String path13 = localUri.getPath();
                    bj4VarO.K(2072025254);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = bl7.i(f50.a.C0085a.a);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path13, localUri, j15, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                    z4 = z2;
                    j2 = j15;
                    oh4Var5 = oh4Var4;
                }
                imageRenderType3 = imageRenderType2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: n75
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            imageRenderType2 = imageRenderType;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    jM757getBubbleBackground0d7_KjU = j;
                    if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                    }
                    i3 |= i11;
                } else {
                    jM757getBubbleBackground0d7_KjU = j;
                }
                i3 |= i11;
            } else {
                jM757getBubbleBackground0d7_KjU = j;
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                }
                bj4VarO.V();
                if (getHasUri(block2)) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (getHasUri(block2)) {
                    localUri = block2.getLocalUri();
                } else if (z3) {
                    String previewUrl15 = block2.getPreviewUrl();
                    previewUrl15.getClass();
                    localUri = Uri.parse(previewUrl15);
                } else {
                    url = block2.getUrl();
                    if (url == null) {
                        url = BuildConfig.FLAVOR;
                    }
                    localUri = Uri.parse(url);
                }
                long j16 = jM757getBubbleBackground0d7_KjU;
                String path14 = localUri.getPath();
                bj4VarO.K(2072025254);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = bl7.i(f50.a.C0085a.a);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path14, localUri, j16, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                z4 = z2;
                j2 = j16;
                oh4Var5 = oh4Var4;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                }
                bj4VarO.V();
                if (getHasUri(block2)) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (getHasUri(block2)) {
                    localUri = block2.getLocalUri();
                } else if (z3) {
                    String previewUrl16 = block2.getPreviewUrl();
                    previewUrl16.getClass();
                    localUri = Uri.parse(previewUrl16);
                } else {
                    url = block2.getUrl();
                    if (url == null) {
                        url = BuildConfig.FLAVOR;
                    }
                    localUri = Uri.parse(url);
                }
                long j17 = jM757getBubbleBackground0d7_KjU;
                String path15 = localUri.getPath();
                bj4VarO.K(2072025254);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = bl7.i(f50.a.C0085a.a);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path15, localUri, j17, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                z4 = z2;
                j2 = j17;
                oh4Var5 = oh4Var4;
            }
            imageRenderType3 = imageRenderType2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: n75
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                oh4Var2 = oh4Var;
                if (bj4VarO.j(oh4Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        imageRenderType2 = imageRenderType;
                        if (bj4VarO.J(imageRenderType2)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            jM757getBubbleBackground0d7_KjU = j;
                            if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                            }
                            i3 |= i11;
                        } else {
                            jM757getBubbleBackground0d7_KjU = j;
                        }
                        i3 |= i11;
                    } else {
                        jM757getBubbleBackground0d7_KjU = j;
                    }
                    if ((74899 & i3) == 74898) {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        } else {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        }
                        bj4VarO.V();
                        if (getHasUri(block2)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (getHasUri(block2)) {
                            localUri = block2.getLocalUri();
                        } else if (z3) {
                            String previewUrl17 = block2.getPreviewUrl();
                            previewUrl17.getClass();
                            localUri = Uri.parse(previewUrl17);
                        } else {
                            url = block2.getUrl();
                            if (url == null) {
                                url = BuildConfig.FLAVOR;
                            }
                            localUri = Uri.parse(url);
                        }
                        long j18 = jM757getBubbleBackground0d7_KjU;
                        String path16 = localUri.getPath();
                        bj4VarO.K(2072025254);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = bl7.i(f50.a.C0085a.a);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path16, localUri, j18, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                        z4 = z2;
                        j2 = j18;
                        oh4Var5 = oh4Var4;
                    } else {
                        bj4VarO.v0();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        } else {
                            if (i10 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i6 != 0) {
                                z2 = false;
                            }
                            if (i8 != 0) {
                                imageRenderType2 = ImageRenderType.CROPPED;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                oh4Var4 = oh4Var3;
                                jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                            } else {
                                oh4Var4 = oh4Var3;
                            }
                        }
                        bj4VarO.V();
                        if (getHasUri(block2)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (getHasUri(block2)) {
                            localUri = block2.getLocalUri();
                        } else if (z3) {
                            String previewUrl18 = block2.getPreviewUrl();
                            previewUrl18.getClass();
                            localUri = Uri.parse(previewUrl18);
                        } else {
                            url = block2.getUrl();
                            if (url == null) {
                                url = BuildConfig.FLAVOR;
                            }
                            localUri = Uri.parse(url);
                        }
                        long j19 = jM757getBubbleBackground0d7_KjU;
                        String path17 = localUri.getPath();
                        bj4VarO.K(2072025254);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = bl7.i(f50.a.C0085a.a);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path17, localUri, j19, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                        z4 = z2;
                        j2 = j19;
                        oh4Var5 = oh4Var4;
                    }
                    imageRenderType3 = imageRenderType2;
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: n75
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                imageRenderType2 = imageRenderType;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        jM757getBubbleBackground0d7_KjU = j;
                        if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                        }
                        i3 |= i11;
                    } else {
                        jM757getBubbleBackground0d7_KjU = j;
                    }
                    i3 |= i11;
                } else {
                    jM757getBubbleBackground0d7_KjU = j;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    }
                    bj4VarO.V();
                    if (getHasUri(block2)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (getHasUri(block2)) {
                        localUri = block2.getLocalUri();
                    } else if (z3) {
                        String previewUrl19 = block2.getPreviewUrl();
                        previewUrl19.getClass();
                        localUri = Uri.parse(previewUrl19);
                    } else {
                        url = block2.getUrl();
                        if (url == null) {
                            url = BuildConfig.FLAVOR;
                        }
                        localUri = Uri.parse(url);
                    }
                    long j110 = jM757getBubbleBackground0d7_KjU;
                    String path18 = localUri.getPath();
                    bj4VarO.K(2072025254);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = bl7.i(f50.a.C0085a.a);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path18, localUri, j110, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                    z4 = z2;
                    j2 = j110;
                    oh4Var5 = oh4Var4;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    }
                    bj4VarO.V();
                    if (getHasUri(block2)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (getHasUri(block2)) {
                        localUri = block2.getLocalUri();
                    } else if (z3) {
                        String previewUrl110 = block2.getPreviewUrl();
                        previewUrl110.getClass();
                        localUri = Uri.parse(previewUrl110);
                    } else {
                        url = block2.getUrl();
                        if (url == null) {
                            url = BuildConfig.FLAVOR;
                        }
                        localUri = Uri.parse(url);
                    }
                    long j111 = jM757getBubbleBackground0d7_KjU;
                    String path19 = localUri.getPath();
                    bj4VarO.K(2072025254);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = bl7.i(f50.a.C0085a.a);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path19, localUri, j111, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                    z4 = z2;
                    j2 = j111;
                    oh4Var5 = oh4Var4;
                }
                imageRenderType3 = imageRenderType2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: n75
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            z2 = z;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    imageRenderType2 = imageRenderType;
                    if (bj4VarO.J(imageRenderType2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        jM757getBubbleBackground0d7_KjU = j;
                        if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                        }
                        i3 |= i11;
                    } else {
                        jM757getBubbleBackground0d7_KjU = j;
                    }
                    i3 |= i11;
                } else {
                    jM757getBubbleBackground0d7_KjU = j;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    }
                    bj4VarO.V();
                    if (getHasUri(block2)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (getHasUri(block2)) {
                        localUri = block2.getLocalUri();
                    } else if (z3) {
                        String previewUrl111 = block2.getPreviewUrl();
                        previewUrl111.getClass();
                        localUri = Uri.parse(previewUrl111);
                    } else {
                        url = block2.getUrl();
                        if (url == null) {
                            url = BuildConfig.FLAVOR;
                        }
                        localUri = Uri.parse(url);
                    }
                    long j112 = jM757getBubbleBackground0d7_KjU;
                    String path110 = localUri.getPath();
                    bj4VarO.K(2072025254);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = bl7.i(f50.a.C0085a.a);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path110, localUri, j112, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                    z4 = z2;
                    j2 = j112;
                    oh4Var5 = oh4Var4;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    }
                    bj4VarO.V();
                    if (getHasUri(block2)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (getHasUri(block2)) {
                        localUri = block2.getLocalUri();
                    } else if (z3) {
                        String previewUrl112 = block2.getPreviewUrl();
                        previewUrl112.getClass();
                        localUri = Uri.parse(previewUrl112);
                    } else {
                        url = block2.getUrl();
                        if (url == null) {
                            url = BuildConfig.FLAVOR;
                        }
                        localUri = Uri.parse(url);
                    }
                    long j113 = jM757getBubbleBackground0d7_KjU;
                    String path111 = localUri.getPath();
                    bj4VarO.K(2072025254);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = bl7.i(f50.a.C0085a.a);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path111, localUri, j113, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                    z4 = z2;
                    j2 = j113;
                    oh4Var5 = oh4Var4;
                }
                imageRenderType3 = imageRenderType2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: n75
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            imageRenderType2 = imageRenderType;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    jM757getBubbleBackground0d7_KjU = j;
                    if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                    }
                    i3 |= i11;
                } else {
                    jM757getBubbleBackground0d7_KjU = j;
                }
                i3 |= i11;
            } else {
                jM757getBubbleBackground0d7_KjU = j;
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                }
                bj4VarO.V();
                if (getHasUri(block2)) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (getHasUri(block2)) {
                    localUri = block2.getLocalUri();
                } else if (z3) {
                    String previewUrl113 = block2.getPreviewUrl();
                    previewUrl113.getClass();
                    localUri = Uri.parse(previewUrl113);
                } else {
                    url = block2.getUrl();
                    if (url == null) {
                        url = BuildConfig.FLAVOR;
                    }
                    localUri = Uri.parse(url);
                }
                long j114 = jM757getBubbleBackground0d7_KjU;
                String path112 = localUri.getPath();
                bj4VarO.K(2072025254);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = bl7.i(f50.a.C0085a.a);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path112, localUri, j114, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                z4 = z2;
                j2 = j114;
                oh4Var5 = oh4Var4;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                }
                bj4VarO.V();
                if (getHasUri(block2)) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (getHasUri(block2)) {
                    localUri = block2.getLocalUri();
                } else if (z3) {
                    String previewUrl114 = block2.getPreviewUrl();
                    previewUrl114.getClass();
                    localUri = Uri.parse(previewUrl114);
                } else {
                    url = block2.getUrl();
                    if (url == null) {
                        url = BuildConfig.FLAVOR;
                    }
                    localUri = Uri.parse(url);
                }
                long j115 = jM757getBubbleBackground0d7_KjU;
                String path113 = localUri.getPath();
                bj4VarO.K(2072025254);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = bl7.i(f50.a.C0085a.a);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path113, localUri, j115, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                z4 = z2;
                j2 = j115;
                oh4Var5 = oh4Var4;
            }
            imageRenderType3 = imageRenderType2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: n75
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        oh4Var2 = oh4Var;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (bj4VarO.c(z2)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    imageRenderType2 = imageRenderType;
                    if (bj4VarO.J(imageRenderType2)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        jM757getBubbleBackground0d7_KjU = j;
                        if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                        }
                        i3 |= i11;
                    } else {
                        jM757getBubbleBackground0d7_KjU = j;
                    }
                    i3 |= i11;
                } else {
                    jM757getBubbleBackground0d7_KjU = j;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    }
                    bj4VarO.V();
                    if (getHasUri(block2)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (getHasUri(block2)) {
                        localUri = block2.getLocalUri();
                    } else if (z3) {
                        String previewUrl115 = block2.getPreviewUrl();
                        previewUrl115.getClass();
                        localUri = Uri.parse(previewUrl115);
                    } else {
                        url = block2.getUrl();
                        if (url == null) {
                            url = BuildConfig.FLAVOR;
                        }
                        localUri = Uri.parse(url);
                    }
                    long j116 = jM757getBubbleBackground0d7_KjU;
                    String path114 = localUri.getPath();
                    bj4VarO.K(2072025254);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = bl7.i(f50.a.C0085a.a);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path114, localUri, j116, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                    z4 = z2;
                    j2 = j116;
                    oh4Var5 = oh4Var4;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    } else {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i8 != 0) {
                            imageRenderType2 = ImageRenderType.CROPPED;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            oh4Var4 = oh4Var3;
                            jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                    }
                    bj4VarO.V();
                    if (getHasUri(block2)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (getHasUri(block2)) {
                        localUri = block2.getLocalUri();
                    } else if (z3) {
                        String previewUrl116 = block2.getPreviewUrl();
                        previewUrl116.getClass();
                        localUri = Uri.parse(previewUrl116);
                    } else {
                        url = block2.getUrl();
                        if (url == null) {
                            url = BuildConfig.FLAVOR;
                        }
                        localUri = Uri.parse(url);
                    }
                    long j117 = jM757getBubbleBackground0d7_KjU;
                    String path115 = localUri.getPath();
                    bj4VarO.K(2072025254);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = bl7.i(f50.a.C0085a.a);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path115, localUri, j117, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                    z4 = z2;
                    j2 = j117;
                    oh4Var5 = oh4Var4;
                }
                imageRenderType3 = imageRenderType2;
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: n75
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            imageRenderType2 = imageRenderType;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    jM757getBubbleBackground0d7_KjU = j;
                    if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                    }
                    i3 |= i11;
                } else {
                    jM757getBubbleBackground0d7_KjU = j;
                }
                i3 |= i11;
            } else {
                jM757getBubbleBackground0d7_KjU = j;
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                }
                bj4VarO.V();
                if (getHasUri(block2)) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (getHasUri(block2)) {
                    localUri = block2.getLocalUri();
                } else if (z3) {
                    String previewUrl117 = block2.getPreviewUrl();
                    previewUrl117.getClass();
                    localUri = Uri.parse(previewUrl117);
                } else {
                    url = block2.getUrl();
                    if (url == null) {
                        url = BuildConfig.FLAVOR;
                    }
                    localUri = Uri.parse(url);
                }
                long j118 = jM757getBubbleBackground0d7_KjU;
                String path116 = localUri.getPath();
                bj4VarO.K(2072025254);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = bl7.i(f50.a.C0085a.a);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path116, localUri, j118, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                z4 = z2;
                j2 = j118;
                oh4Var5 = oh4Var4;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                }
                bj4VarO.V();
                if (getHasUri(block2)) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (getHasUri(block2)) {
                    localUri = block2.getLocalUri();
                } else if (z3) {
                    String previewUrl118 = block2.getPreviewUrl();
                    previewUrl118.getClass();
                    localUri = Uri.parse(previewUrl118);
                } else {
                    url = block2.getUrl();
                    if (url == null) {
                        url = BuildConfig.FLAVOR;
                    }
                    localUri = Uri.parse(url);
                }
                long j119 = jM757getBubbleBackground0d7_KjU;
                String path117 = localUri.getPath();
                bj4VarO.K(2072025254);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = bl7.i(f50.a.C0085a.a);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path117, localUri, j119, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                z4 = z2;
                j2 = j119;
                oh4Var5 = oh4Var4;
            }
            imageRenderType3 = imageRenderType2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: n75
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        z2 = z;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                imageRenderType2 = imageRenderType;
                if (bj4VarO.J(imageRenderType2)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    jM757getBubbleBackground0d7_KjU = j;
                    if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                    }
                    i3 |= i11;
                } else {
                    jM757getBubbleBackground0d7_KjU = j;
                }
                i3 |= i11;
            } else {
                jM757getBubbleBackground0d7_KjU = j;
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                }
                bj4VarO.V();
                if (getHasUri(block2)) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (getHasUri(block2)) {
                    localUri = block2.getLocalUri();
                } else if (z3) {
                    String previewUrl119 = block2.getPreviewUrl();
                    previewUrl119.getClass();
                    localUri = Uri.parse(previewUrl119);
                } else {
                    url = block2.getUrl();
                    if (url == null) {
                        url = BuildConfig.FLAVOR;
                    }
                    localUri = Uri.parse(url);
                }
                long j1110 = jM757getBubbleBackground0d7_KjU;
                String path118 = localUri.getPath();
                bj4VarO.K(2072025254);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = bl7.i(f50.a.C0085a.a);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path118, localUri, j1110, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                z4 = z2;
                j2 = j1110;
                oh4Var5 = oh4Var4;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i8 != 0) {
                        imageRenderType2 = ImageRenderType.CROPPED;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        oh4Var4 = oh4Var3;
                        jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                    } else {
                        oh4Var4 = oh4Var3;
                    }
                }
                bj4VarO.V();
                if (getHasUri(block2)) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (getHasUri(block2)) {
                    localUri = block2.getLocalUri();
                } else if (z3) {
                    String previewUrl1110 = block2.getPreviewUrl();
                    previewUrl1110.getClass();
                    localUri = Uri.parse(previewUrl1110);
                } else {
                    url = block2.getUrl();
                    if (url == null) {
                        url = BuildConfig.FLAVOR;
                    }
                    localUri = Uri.parse(url);
                }
                long j1111 = jM757getBubbleBackground0d7_KjU;
                String path119 = localUri.getPath();
                bj4VarO.K(2072025254);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = bl7.i(f50.a.C0085a.a);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path119, localUri, j1111, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
                z4 = z2;
                j2 = j1111;
                oh4Var5 = oh4Var4;
            }
            imageRenderType3 = imageRenderType2;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: n75
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        imageRenderType2 = imageRenderType;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                jM757getBubbleBackground0d7_KjU = j;
                if (bj4VarO.i(jM757getBubbleBackground0d7_KjU)) {
                }
                i3 |= i11;
            } else {
                jM757getBubbleBackground0d7_KjU = j;
            }
            i3 |= i11;
        } else {
            jM757getBubbleBackground0d7_KjU = j;
        }
        if ((74899 & i3) == 74898) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    oh4Var3 = null;
                } else {
                    oh4Var3 = oh4Var2;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                if (i8 != 0) {
                    imageRenderType2 = ImageRenderType.CROPPED;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    oh4Var4 = oh4Var3;
                    jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                } else {
                    oh4Var4 = oh4Var3;
                }
            } else {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    oh4Var3 = null;
                } else {
                    oh4Var3 = oh4Var2;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                if (i8 != 0) {
                    imageRenderType2 = ImageRenderType.CROPPED;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    oh4Var4 = oh4Var3;
                    jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                } else {
                    oh4Var4 = oh4Var3;
                }
            }
            bj4VarO.V();
            if (getHasUri(block2)) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (getHasUri(block2)) {
                localUri = block2.getLocalUri();
            } else if (z3) {
                String previewUrl1111 = block2.getPreviewUrl();
                previewUrl1111.getClass();
                localUri = Uri.parse(previewUrl1111);
            } else {
                url = block2.getUrl();
                if (url == null) {
                    url = BuildConfig.FLAVOR;
                }
                localUri = Uri.parse(url);
            }
            long j1112 = jM757getBubbleBackground0d7_KjU;
            String path1110 = localUri.getPath();
            bj4VarO.K(2072025254);
            objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = bl7.i(f50.a.C0085a.a);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path1110, localUri, j1112, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
            z4 = z2;
            j2 = j1112;
            oh4Var5 = oh4Var4;
        } else {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    oh4Var3 = null;
                } else {
                    oh4Var3 = oh4Var2;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                if (i8 != 0) {
                    imageRenderType2 = ImageRenderType.CROPPED;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    oh4Var4 = oh4Var3;
                    jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                } else {
                    oh4Var4 = oh4Var3;
                }
            } else {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    oh4Var3 = null;
                } else {
                    oh4Var3 = oh4Var2;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                if (i8 != 0) {
                    imageRenderType2 = ImageRenderType.CROPPED;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    oh4Var4 = oh4Var3;
                    jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
                } else {
                    oh4Var4 = oh4Var3;
                }
            }
            bj4VarO.V();
            if (getHasUri(block2)) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (getHasUri(block2)) {
                localUri = block2.getLocalUri();
            } else if (z3) {
                String previewUrl1112 = block2.getPreviewUrl();
                previewUrl1112.getClass();
                localUri = Uri.parse(previewUrl1112);
            } else {
                url = block2.getUrl();
                if (url == null) {
                    url = BuildConfig.FLAVOR;
                }
                localUri = Uri.parse(url);
            }
            long j1113 = jM757getBubbleBackground0d7_KjU;
            String path1111 = localUri.getPath();
            bj4VarO.K(2072025254);
            objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = bl7.i(f50.a.C0085a.a);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ov0.a(ox6Var3, null, false, gr1.b(491541600, new ImageBlockKt$ImageBlock$1(block2, imageRenderType2, path1111, localUri, j1113, oh4Var4, (h37) objF), bj4VarO), bj4VarO, ((i3 >> 3) & 14) | 3072, 6);
            z4 = z2;
            j2 = j1113;
            oh4Var5 = oh4Var4;
        }
        imageRenderType3 = imageRenderType2;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: n75
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ImageBlockKt.ImageBlock_V_9fs2A$lambda$3(block, ox6Var3, oh4Var5, z4, imageRenderType3, j2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f50.a ImageBlock_V_9fs2A$lambda$1(h37<f50.a> h37Var) {
        return h37Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ImageBlock_V_9fs2A$lambda$3(Block block, ox6 ox6Var, oh4 oh4Var, boolean z, ImageRenderType imageRenderType, long j, int i, int i2, jt1 jt1Var, int i3) {
        m439ImageBlockV9fs2A(block, ox6Var, oh4Var, z, imageRenderType, j, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasUri(Block block) {
        return (block.getLocalUri() == null || xj5.a(block.getLocalUri(), Uri.EMPTY)) ? false : true;
    }
}
