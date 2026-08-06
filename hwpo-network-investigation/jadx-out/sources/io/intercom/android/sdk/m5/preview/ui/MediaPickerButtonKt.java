package io.intercom.android.sdk.m5.preview.ui;

import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c33;
import defpackage.ci4;
import defpackage.cu1;
import defpackage.di;
import defpackage.dv0;
import defpackage.eh6;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.h27;
import defpackage.i27;
import defpackage.ia;
import defpackage.it1;
import defpackage.jt1;
import defpackage.km5;
import defpackage.kw7;
import defpackage.m78;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oy0;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.t72;
import defpackage.u30;
import defpackage.va5;
import defpackage.wd3;
import defpackage.we1;
import defpackage.wx7;
import defpackage.xa5;
import defpackage.xj8;
import defpackage.ze;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.preview.ui.MediaPickerButtonKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaPickerButtonKt {
    private static final Set<String> defaultTrustedAudioExtensions;
    private static final Set<String> defaultTrustedDocumentExtensions;
    private static final Set<String> defaultTrustedFileExtensions;
    private static final Set<String> defaultTrustedImageExtensions;
    private static final Set<String> defaultTrustedVideoExtensions;

    static {
        Set<String> setF = u30.F(new String[]{"gif", "jpeg", "jpg", "png", "heic", "dng"});
        defaultTrustedImageExtensions = setF;
        Set<String> setF2 = u30.F(new String[]{"mp4", "mov"});
        defaultTrustedVideoExtensions = setF2;
        Set<String> setF3 = u30.F(new String[]{"pdf", "txt"});
        defaultTrustedDocumentExtensions = setF3;
        Set<String> setF4 = u30.F(new String[]{"oga", "ogg"});
        defaultTrustedAudioExtensions = setF4;
        defaultTrustedFileExtensions = wx7.b(wx7.b(wx7.b(setF, setF2), setF3), setF4);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x013a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0143  */
    /* JADX WARN: Code duplicated, block: B:119:0x0166  */
    /* JADX WARN: Code duplicated, block: B:121:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x017a  */
    /* JADX WARN: Code duplicated, block: B:124:0x017e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0181  */
    /* JADX WARN: Code duplicated, block: B:128:0x0187  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0190  */
    /* JADX WARN: Code duplicated, block: B:134:0x019c  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:151:0x0217  */
    /* JADX WARN: Code duplicated, block: B:152:0x0219  */
    /* JADX WARN: Code duplicated, block: B:155:0x022e  */
    /* JADX WARN: Code duplicated, block: B:161:0x023b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0242  */
    /* JADX WARN: Code duplicated, block: B:165:0x0244  */
    /* JADX WARN: Code duplicated, block: B:168:0x024c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x024e  */
    /* JADX WARN: Code duplicated, block: B:174:0x027a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0296  */
    /* JADX WARN: Code duplicated, block: B:178:0x0298  */
    /* JADX WARN: Code duplicated, block: B:181:0x02a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:185:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:187:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:188:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:192:0x0328  */
    /* JADX WARN: Code duplicated, block: B:194:0x0338  */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    public static final void MediaPickerButton(final int i, va5 va5Var, MediaType mediaType, Set<String> set, final oh4<? super List<? extends Uri>, g2b> oh4Var, final MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, boolean z, mh4<g2b> mh4Var, final ci4<? super jt1, ? super Integer, g2b> ci4Var, jt1 jt1Var, final int i2, final int i3) {
        int i4;
        va5 va5Var2;
        MediaType mediaType2;
        Set<String> set2;
        int i5;
        boolean zJ;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        jt1.a.C0187a c0187a;
        int i16;
        MediaType mediaType3;
        mh4<g2b> mh4Var2;
        Set<String> set3;
        MediaType mediaType4;
        Object objF;
        Object objF2;
        final t72 t72Var;
        int i17;
        boolean z3;
        Object objF3;
        final eh6 eh6VarF;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objF4;
        final boolean z8;
        int i18;
        eh6 eh6VarF2;
        Object objF5;
        boolean z9;
        boolean zJ2;
        Object objF6;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar;
        final boolean z10;
        final MediaType mediaType5;
        final Set<String> set4;
        final mh4<g2b> mh4Var3;
        final va5 va5Var3;
        xj8 xj8VarW;
        oh4Var.getClass();
        mediaPickerButtonCTAStyle.getClass();
        ci4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-476316130);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (bj4VarO.h(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                va5Var2 = va5Var;
                int i19 = bj4VarO.J(va5Var2) ? 32 : 16;
                i4 |= i19;
            } else {
                va5Var2 = va5Var;
            }
            i4 |= i19;
        } else {
            va5Var2 = va5Var;
        }
        int i20 = i3 & 4;
        if (i20 == 0) {
            if ((i2 & 384) == 0) {
                mediaType2 = mediaType;
                i4 |= bj4VarO.J(mediaType2) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    set2 = set;
                    int i21 = bj4VarO.j(set2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
                    i4 |= i21;
                } else {
                    set2 = set;
                }
                i4 |= i21;
            } else {
                set2 = set;
            }
            if ((i3 & 16) != 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                if (bj4VarO.j(oh4Var)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i4 |= i5;
            }
            if ((i3 & 32) != 0) {
                i4 |= 196608;
            } else if ((i2 & 196608) == 0) {
                if ((i2 & 262144) == 0) {
                    zJ = bj4VarO.J(mediaPickerButtonCTAStyle);
                } else {
                    zJ = bj4VarO.j(mediaPickerButtonCTAStyle);
                }
                if (zJ) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                i4 |= 1572864;
                z2 = z;
            } else {
                z2 = z;
                if ((i2 & 1572864) == 0) {
                    if (bj4VarO.c(z2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            i11 = i4;
            if ((i3 & 256) != 0) {
                i12 = i11 | 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (bj4VarO.j(ci4Var)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i12 = i11 | i13;
            } else {
                i12 = i11;
            }
            i14 = i12;
            if ((i14 & 38347923) == 38347922 || !bj4VarO.r()) {
                bj4VarO.v0();
                i15 = i2 & 1;
                c0187a = jt1.a.a;
                if (i15 != 0 || bj4VarO.c0()) {
                    if ((i3 & 2) != 0) {
                        va5Var2 = (va5) bj4VarO.F(xa5.a);
                        i16 = i14 & (-113);
                    } else {
                        i16 = i14;
                    }
                    if (i20 != 0) {
                        mediaType3 = MediaType.All;
                    } else {
                        mediaType3 = mediaType;
                    }
                    if ((i3 & 8) != 0) {
                        set2 = defaultTrustedFileExtensions;
                        i16 &= -7169;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if (i9 != 0) {
                        bj4VarO.K(-1247397916);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new km5(2);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        mh4Var2 = (mh4) objF;
                    } else {
                        mh4Var2 = mh4Var;
                    }
                    set3 = set2;
                    mediaType4 = mediaType3;
                } else {
                    bj4VarO.u();
                    int i22 = (i3 & 2) != 0 ? i14 & (-113) : i14;
                    if ((i3 & 8) != 0) {
                        i22 &= -7169;
                    }
                    mh4Var2 = mh4Var;
                    i16 = i22;
                    va5Var2 = va5Var2;
                    set3 = set2;
                    mediaType4 = mediaType;
                }
                bj4VarO.V();
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    c33 c33Var = wd3.a;
                    objF2 = m78.a(bj4VarO.x(), bj4VarO);
                }
                t72Var = (t72) objF2;
                PreviewMediaContract previewMediaContract = new PreviewMediaContract();
                bj4VarO.K(-1247391194);
                i17 = i16 & 57344;
                if (i17 == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objF3 = bj4VarO.f();
                if (z3 || objF3 == c0187a) {
                    objF3 = new ze(oh4Var, 1);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                eh6VarF = ia.f(previewMediaContract, (oh4) objF3, bj4VarO);
                IntercomMediaPicker intercomMediaPicker = new IntercomMediaPicker(mediaType4, set3, i);
                bj4VarO.K(-1247383605);
                if ((i16 & 3670016) == 1048576) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean zJ3 = z4 | bj4VarO.j(t72Var) | bj4VarO.j(eh6VarF);
                if ((i16 & 458752) != 131072 || ((i16 & 262144) != 0 && bj4VarO.j(mediaPickerButtonCTAStyle))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z11 = zJ3 | z5;
                if (i17 == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z11 | z6;
                objF4 = bj4VarO.f();
                if (!z7 || objF4 == c0187a) {
                    z8 = z2;
                    i18 = 8388608;
                    oh4 oh4Var2 = new oh4() { // from class: yp6
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return MediaPickerButtonKt.MediaPickerButton$lambda$5$lambda$4(z8, t72Var, oh4Var, eh6VarF, mediaPickerButtonCTAStyle, (List) obj);
                        }
                    };
                    bj4VarO.C(oh4Var2);
                    objF4 = oh4Var2;
                } else {
                    z8 = z2;
                    i18 = 8388608;
                }
                bj4VarO.U(false);
                eh6VarF2 = ia.f(intercomMediaPicker, (oh4) objF4, bj4VarO);
                bj4VarO.K(-1247354103);
                objF5 = bj4VarO.f();
                if (objF5 == c0187a) {
                    objF5 = new i27();
                    bj4VarO.C(objF5);
                }
                h27 h27Var = (h27) objF5;
                bj4VarO.U(false);
                bj4VarO.K(-1247350984);
                if ((i16 & 29360128) == i18) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zJ2 = z9 | bj4VarO.j(eh6VarF2);
                objF6 = bj4VarO.f();
                if (zJ2 || objF6 == c0187a) {
                    objF6 = new cu1(1, mh4Var2, eh6VarF2);
                    bj4VarO.C(objF6);
                }
                bj4VarO.U(false);
                ox6 ox6VarB = we1.b(ox6.a.t, h27Var, va5Var2, false, null, (mh4) objF6, 28);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarB);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ci4Var.invoke(bj4VarO, Integer.valueOf((i16 >> 24) & 14));
                bj4VarO.U(true);
                z10 = z8;
                mediaType5 = mediaType4;
                set4 = set3;
                mh4Var3 = mh4Var2;
                va5Var3 = va5Var2;
            } else {
                bj4VarO.u();
                va5Var3 = va5Var2;
                mediaType5 = mediaType2;
                set4 = set2;
                z10 = z2;
                mh4Var3 = mh4Var;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: zp6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MediaPickerButtonKt.MediaPickerButton$lambda$10(i, va5Var3, mediaType5, set4, oh4Var, mediaPickerButtonCTAStyle, z10, mh4Var3, ci4Var, i2, i3, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i4 |= 384;
        mediaType2 = mediaType;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                set2 = set;
                if (bj4VarO.j(set2)) {
                }
                i4 |= i21;
            } else {
                set2 = set;
            }
            i4 |= i21;
        } else {
            set2 = set;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (bj4VarO.j(oh4Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i4 |= i5;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            if ((i2 & 262144) == 0) {
                zJ = bj4VarO.J(mediaPickerButtonCTAStyle);
            } else {
                zJ = bj4VarO.j(mediaPickerButtonCTAStyle);
            }
            if (zJ) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i4 |= i6;
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
            z2 = z;
        } else {
            z2 = z;
            if ((i2 & 1572864) == 0) {
                if (bj4VarO.c(z2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
        }
        i9 = i3 & 128;
        if (i9 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (bj4VarO.j(mh4Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        i11 = i4;
        if ((i3 & 256) != 0) {
            i12 = i11 | 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (bj4VarO.j(ci4Var)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i12 = i11 | i13;
        } else {
            i12 = i11;
        }
        i14 = i12;
        if ((i14 & 38347923) == 38347922) {
            bj4VarO.v0();
            i15 = i2 & 1;
            c0187a = jt1.a.a;
            if (i15 != 0) {
                if ((i3 & 2) != 0) {
                    va5Var2 = (va5) bj4VarO.F(xa5.a);
                    i16 = i14 & (-113);
                } else {
                    i16 = i14;
                }
                if (i20 != 0) {
                    mediaType3 = MediaType.All;
                } else {
                    mediaType3 = mediaType;
                }
                if ((i3 & 8) != 0) {
                    set2 = defaultTrustedFileExtensions;
                    i16 &= -7169;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    bj4VarO.K(-1247397916);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new km5(2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    mh4Var2 = (mh4) objF;
                } else {
                    mh4Var2 = mh4Var;
                }
                set3 = set2;
                mediaType4 = mediaType3;
            } else {
                if ((i3 & 2) != 0) {
                    va5Var2 = (va5) bj4VarO.F(xa5.a);
                    i16 = i14 & (-113);
                } else {
                    i16 = i14;
                }
                if (i20 != 0) {
                    mediaType3 = MediaType.All;
                } else {
                    mediaType3 = mediaType;
                }
                if ((i3 & 8) != 0) {
                    set2 = defaultTrustedFileExtensions;
                    i16 &= -7169;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    bj4VarO.K(-1247397916);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new km5(2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    mh4Var2 = (mh4) objF;
                } else {
                    mh4Var2 = mh4Var;
                }
                set3 = set2;
                mediaType4 = mediaType3;
            }
            bj4VarO.V();
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                c33 c33Var2 = wd3.a;
                objF2 = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72Var = (t72) objF2;
            PreviewMediaContract previewMediaContract2 = new PreviewMediaContract();
            bj4VarO.K(-1247391194);
            i17 = i16 & 57344;
            if (i17 == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            objF3 = bj4VarO.f();
            if (z3) {
                objF3 = new ze(oh4Var, 1);
                bj4VarO.C(objF3);
            } else {
                objF3 = new ze(oh4Var, 1);
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            eh6VarF = ia.f(previewMediaContract2, (oh4) objF3, bj4VarO);
            IntercomMediaPicker intercomMediaPicker2 = new IntercomMediaPicker(mediaType4, set3, i);
            bj4VarO.K(-1247383605);
            if ((i16 & 3670016) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean zJ4 = z4 | bj4VarO.j(t72Var) | bj4VarO.j(eh6VarF);
            if ((i16 & 458752) != 131072) {
                z5 = true;
            } else {
                z5 = true;
            }
            boolean z12 = zJ4 | z5;
            if (i17 == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z12 | z6;
            objF4 = bj4VarO.f();
            if (z7) {
                z8 = z2;
                i18 = 8388608;
                oh4 oh4Var3 = new oh4() { // from class: yp6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$5$lambda$4(z8, t72Var, oh4Var, eh6VarF, mediaPickerButtonCTAStyle, (List) obj);
                    }
                };
                bj4VarO.C(oh4Var3);
                objF4 = oh4Var3;
            } else {
                z8 = z2;
                i18 = 8388608;
                oh4 oh4Var4 = new oh4() { // from class: yp6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$5$lambda$4(z8, t72Var, oh4Var, eh6VarF, mediaPickerButtonCTAStyle, (List) obj);
                    }
                };
                bj4VarO.C(oh4Var4);
                objF4 = oh4Var4;
            }
            bj4VarO.U(false);
            eh6VarF2 = ia.f(intercomMediaPicker2, (oh4) objF4, bj4VarO);
            bj4VarO.K(-1247354103);
            objF5 = bj4VarO.f();
            if (objF5 == c0187a) {
                objF5 = new i27();
                bj4VarO.C(objF5);
            }
            h27 h27Var2 = (h27) objF5;
            bj4VarO.U(false);
            bj4VarO.K(-1247350984);
            if ((i16 & 29360128) == i18) {
                z9 = true;
            } else {
                z9 = false;
            }
            zJ2 = z9 | bj4VarO.j(eh6VarF2);
            objF6 = bj4VarO.f();
            if (zJ2) {
                objF6 = new cu1(1, mh4Var2, eh6VarF2);
                bj4VarO.C(objF6);
            } else {
                objF6 = new cu1(1, mh4Var2, eh6VarF2);
                bj4VarO.C(objF6);
            }
            bj4VarO.U(false);
            ox6 ox6VarB2 = we1.b(ox6.a.t, h27Var2, va5Var2, false, null, (mh4) objF6, 28);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarB2);
            bt1.c.getClass();
            aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ci4Var.invoke(bj4VarO, Integer.valueOf((i16 >> 24) & 14));
            bj4VarO.U(true);
            z10 = z8;
            mediaType5 = mediaType4;
            set4 = set3;
            mh4Var3 = mh4Var2;
            va5Var3 = va5Var2;
        } else {
            bj4VarO.v0();
            i15 = i2 & 1;
            c0187a = jt1.a.a;
            if (i15 != 0) {
                if ((i3 & 2) != 0) {
                    va5Var2 = (va5) bj4VarO.F(xa5.a);
                    i16 = i14 & (-113);
                } else {
                    i16 = i14;
                }
                if (i20 != 0) {
                    mediaType3 = MediaType.All;
                } else {
                    mediaType3 = mediaType;
                }
                if ((i3 & 8) != 0) {
                    set2 = defaultTrustedFileExtensions;
                    i16 &= -7169;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    bj4VarO.K(-1247397916);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new km5(2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    mh4Var2 = (mh4) objF;
                } else {
                    mh4Var2 = mh4Var;
                }
                set3 = set2;
                mediaType4 = mediaType3;
            } else {
                if ((i3 & 2) != 0) {
                    va5Var2 = (va5) bj4VarO.F(xa5.a);
                    i16 = i14 & (-113);
                } else {
                    i16 = i14;
                }
                if (i20 != 0) {
                    mediaType3 = MediaType.All;
                } else {
                    mediaType3 = mediaType;
                }
                if ((i3 & 8) != 0) {
                    set2 = defaultTrustedFileExtensions;
                    i16 &= -7169;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if (i9 != 0) {
                    bj4VarO.K(-1247397916);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new km5(2);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    mh4Var2 = (mh4) objF;
                } else {
                    mh4Var2 = mh4Var;
                }
                set3 = set2;
                mediaType4 = mediaType3;
            }
            bj4VarO.V();
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                c33 c33Var3 = wd3.a;
                objF2 = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72Var = (t72) objF2;
            PreviewMediaContract previewMediaContract3 = new PreviewMediaContract();
            bj4VarO.K(-1247391194);
            i17 = i16 & 57344;
            if (i17 == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            objF3 = bj4VarO.f();
            if (z3) {
                objF3 = new ze(oh4Var, 1);
                bj4VarO.C(objF3);
            } else {
                objF3 = new ze(oh4Var, 1);
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            eh6VarF = ia.f(previewMediaContract3, (oh4) objF3, bj4VarO);
            IntercomMediaPicker intercomMediaPicker3 = new IntercomMediaPicker(mediaType4, set3, i);
            bj4VarO.K(-1247383605);
            if ((i16 & 3670016) == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean zJ5 = z4 | bj4VarO.j(t72Var) | bj4VarO.j(eh6VarF);
            if ((i16 & 458752) != 131072) {
                z5 = true;
            } else {
                z5 = true;
            }
            boolean z13 = zJ5 | z5;
            if (i17 == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z13 | z6;
            objF4 = bj4VarO.f();
            if (z7) {
                z8 = z2;
                i18 = 8388608;
                oh4 oh4Var5 = new oh4() { // from class: yp6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$5$lambda$4(z8, t72Var, oh4Var, eh6VarF, mediaPickerButtonCTAStyle, (List) obj);
                    }
                };
                bj4VarO.C(oh4Var5);
                objF4 = oh4Var5;
            } else {
                z8 = z2;
                i18 = 8388608;
                oh4 oh4Var6 = new oh4() { // from class: yp6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return MediaPickerButtonKt.MediaPickerButton$lambda$5$lambda$4(z8, t72Var, oh4Var, eh6VarF, mediaPickerButtonCTAStyle, (List) obj);
                    }
                };
                bj4VarO.C(oh4Var6);
                objF4 = oh4Var6;
            }
            bj4VarO.U(false);
            eh6VarF2 = ia.f(intercomMediaPicker3, (oh4) objF4, bj4VarO);
            bj4VarO.K(-1247354103);
            objF5 = bj4VarO.f();
            if (objF5 == c0187a) {
                objF5 = new i27();
                bj4VarO.C(objF5);
            }
            h27 h27Var3 = (h27) objF5;
            bj4VarO.U(false);
            bj4VarO.K(-1247350984);
            if ((i16 & 29360128) == i18) {
                z9 = true;
            } else {
                z9 = false;
            }
            zJ2 = z9 | bj4VarO.j(eh6VarF2);
            objF6 = bj4VarO.f();
            if (zJ2) {
                objF6 = new cu1(1, mh4Var2, eh6VarF2);
                bj4VarO.C(objF6);
            } else {
                objF6 = new cu1(1, mh4Var2, eh6VarF2);
                bj4VarO.C(objF6);
            }
            bj4VarO.U(false);
            ox6 ox6VarB3 = we1.b(ox6.a.t, h27Var3, va5Var2, false, null, (mh4) objF6, 28);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarB3);
            bt1.c.getClass();
            aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ci4Var.invoke(bj4VarO, Integer.valueOf((i16 >> 24) & 14));
            bj4VarO.U(true);
            z10 = z8;
            mediaType5 = mediaType4;
            set4 = set3;
            mh4Var3 = mh4Var2;
            va5Var3 = va5Var2;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: zp6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaPickerButtonKt.MediaPickerButton$lambda$10(i, va5Var3, mediaType5, set4, oh4Var, mediaPickerButtonCTAStyle, z10, mh4Var3, ci4Var, i2, i3, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaPickerButton$lambda$10(int i, va5 va5Var, MediaType mediaType, Set set, oh4 oh4Var, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, boolean z, mh4 mh4Var, ci4 ci4Var, int i2, int i3, jt1 jt1Var, int i4) {
        MediaPickerButton(i, va5Var, mediaType, set, oh4Var, mediaPickerButtonCTAStyle, z, mh4Var, ci4Var, jt1Var, gz3.s(i2 | 1), i3);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaPickerButton$lambda$3$lambda$2(oh4 oh4Var, List list) {
        list.getClass();
        oh4Var.invoke(list);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaPickerButton$lambda$5$lambda$4(boolean z, t72 t72Var, oh4 oh4Var, eh6 eh6Var, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, List list) {
        list.getClass();
        if (list.isEmpty() || !z) {
            oh4Var.invoke(list);
        } else {
            oy0.d(t72Var, null, null, new MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1$1(eh6Var, list, mediaPickerButtonCTAStyle, null), 3);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaPickerButton$lambda$8$lambda$7(mh4 mh4Var, eh6 eh6Var) {
        mh4Var.invoke();
        eh6Var.a("*/*");
        return g2b.a;
    }

    private static final void MediaPickerButtonPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-875600568);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m384getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: aq6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaPickerButtonKt.MediaPickerButtonPreview$lambda$11(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaPickerButtonPreview$lambda$11(int i, jt1 jt1Var, int i2) {
        MediaPickerButtonPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final Set<String> getDefaultTrustedFileExtensions() {
        return defaultTrustedFileExtensions;
    }

    public static final boolean isPhotoPickerAvailable() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }
}
