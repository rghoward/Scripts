package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.a30;
import defpackage.ac4;
import defpackage.aj1;
import defpackage.al8;
import defpackage.ay8;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.rx3;
import defpackage.uma;
import defpackage.w2a;
import defpackage.we1;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.zx8;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FileRowKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FileRowKt {
    /* JADX WARN: Code duplicated, block: B:101:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:105:0x02da  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x0139  */
    /* JADX WARN: Code duplicated, block: B:78:0x0140  */
    /* JADX WARN: Code duplicated, block: B:79:0x0144  */
    /* JADX WARN: Code duplicated, block: B:82:0x0194  */
    /* JADX WARN: Code duplicated, block: B:84:0x019d  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:92:0x0244  */
    /* JADX WARN: Code duplicated, block: B:94:0x024b  */
    /* JADX WARN: Code duplicated, block: B:95:0x024f  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c0  */
    public static final void FileRow(final MediaData.Media.Other other, final zx8 zx8Var, ox6 ox6Var, mh4<g2b> mh4Var, ei4<? super FileStyle, ? super jt1, ? super Integer, g2b> ei4Var, jt1 jt1Var, final int i, final int i2) {
        MediaData.Media.Other other2;
        int i3;
        ox6 ox6Var2;
        int i4;
        mh4<g2b> mh4Var2;
        int i5;
        int i6;
        ei4<? super FileStyle, ? super jt1, ? super Integer, g2b> ei4Var2;
        int i7;
        ox6.a aVar;
        mh4<g2b> mh4Var3;
        FileStyle fileStyle;
        IntercomTheme intercomTheme;
        int i8;
        ox6 ox6Var3;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        int i9;
        fl6 fl6VarD;
        mh4<g2b> mh4Var4;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        qr5.a aVar3;
        FileStyle fileStyle2;
        ei4<? super FileStyle, ? super jt1, ? super Integer, g2b> ei4Var3;
        bt1.a.c cVar2;
        bt1.a.d dVar2;
        int i10;
        Throwable th;
        aj1 aj1VarA;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        final mh4<g2b> mh4Var5;
        final ei4<? super FileStyle, ? super jt1, ? super Integer, g2b> ei4Var4;
        final ox6 ox6Var4;
        Object objF;
        xj8 xj8VarW;
        other.getClass();
        zx8Var.getClass();
        bj4 bj4VarO = jt1Var.o(-787364961);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            other2 = other;
        } else if ((i & 6) == 0) {
            other2 = other;
            i3 = (bj4VarO.j(other2) ? 4 : 2) | i;
        } else {
            other2 = other;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(zx8Var) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    mh4Var2 = mh4Var;
                    if (bj4VarO.j(mh4Var2)) {
                        i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        ei4Var2 = ei4Var;
                        if (bj4VarO.j(ei4Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                        aVar = ox6.a.t;
                        if (i11 != 0) {
                            ox6Var2 = aVar;
                        }
                        if (i4 != 0) {
                            bj4VarO.K(1879378485);
                            objF = bj4VarO.f();
                            if (objF == jt1.a.a) {
                                objF = new rx3();
                                bj4VarO.C(objF);
                            }
                            mh4Var3 = (mh4) objF;
                            bj4VarO.U(false);
                        } else {
                            mh4Var3 = mh4Var2;
                        }
                        if (i6 != 0) {
                            ei4Var2 = null;
                        }
                        fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
                        ox6 ox6VarA = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i8 = IntercomTheme.$stable;
                        ox6Var3 = ox6Var2;
                        ox6 ox6VarL = eo7.l(we1.c(gi0.c(ox6VarA, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
                        ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarL);
                        bt1.c.getClass();
                        aVar2 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        cVar = bt1.a.f;
                        rd7.d(bj4VarO, cVar, ny8VarA);
                        eVar = bt1.a.e;
                        rd7.d(bj4VarO, eVar, kw7VarP);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        bVar = bt1.a.g;
                        rd7.d(bj4VarO, bVar, numValueOf);
                        c0034a = bt1.a.h;
                        rd7.c(bj4VarO, c0034a);
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        i9 = i3;
                        ox6 ox6VarC4 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
                        fl6VarD = dv0.d(di.a.e, false);
                        mh4Var4 = mh4Var3;
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarC4);
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, fl6VarD);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        if (ei4Var2 == null) {
                            bj4VarO.K(1527632066);
                            fileStyle2 = fileStyle;
                            cVar2 = cVar;
                            dVar2 = dVar;
                            i10 = i8;
                            th = null;
                            ei4Var3 = ei4Var2;
                            aVar3 = aVar2;
                            m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                            bj4VarO.U(false);
                        } else {
                            aVar3 = aVar2;
                            fileStyle2 = fileStyle;
                            ei4Var3 = ei4Var2;
                            cVar2 = cVar;
                            dVar2 = dVar;
                            i10 = i8;
                            th = null;
                            bj4VarO.K(1527900309);
                            ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                            bj4VarO.U(false);
                        }
                        bj4VarO.U(true);
                        b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                        aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
                        iHashCode3 = Long.hashCode(bj4VarO.T);
                        kw7VarP3 = bj4VarO.P();
                        ox6VarC3 = it1.c(bj4VarO, aVar);
                        if (j1bVar == null) {
                            ml5.c();
                            throw th;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar3);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar2, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP3);
                        l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar2, ox6VarC3);
                        int i12 = i10;
                        mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i12), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i12).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
                        mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i12), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i12).getType04(), bj4VarO, 0, 24960, 110586);
                        bj4VarO = bj4VarO;
                        bj4VarO.U(true);
                        bj4VarO.U(true);
                        mh4Var5 = mh4Var4;
                        ei4Var4 = ei4Var3;
                        ox6Var4 = ox6Var3;
                    } else {
                        bj4VarO.u();
                        ox6Var4 = ox6Var2;
                        mh4Var5 = mh4Var2;
                        ei4Var4 = ei4Var2;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: sx3
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return FileRowKt.FileRow$lambda$5(other, zx8Var, ox6Var4, mh4Var5, ei4Var4, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                ei4Var2 = ei4Var;
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(1879378485);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new rx3();
                            bj4VarO.C(objF);
                        }
                        mh4Var3 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i6 != 0) {
                        ei4Var2 = null;
                    }
                    fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
                    ox6 ox6VarA2 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i8 = IntercomTheme.$stable;
                    ox6Var3 = ox6Var2;
                    ox6 ox6VarL2 = eo7.l(we1.c(gi0.c(ox6VarA2, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarL2);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf2 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf2);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    i9 = i3;
                    ox6 ox6VarC5 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
                    fl6VarD = dv0.d(di.a.e, false);
                    mh4Var4 = mh4Var3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC5);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (ei4Var2 == null) {
                        bj4VarO.K(1527632066);
                        fileStyle2 = fileStyle;
                        cVar2 = cVar;
                        dVar2 = dVar;
                        i10 = i8;
                        th = null;
                        ei4Var3 = ei4Var2;
                        aVar3 = aVar2;
                        m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                        bj4VarO.U(false);
                    } else {
                        aVar3 = aVar2;
                        fileStyle2 = fileStyle;
                        ei4Var3 = ei4Var2;
                        cVar2 = cVar;
                        dVar2 = dVar;
                        i10 = i8;
                        th = null;
                        bj4VarO.K(1527900309);
                        ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(true);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw th;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar2, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar2, ox6VarC3);
                    int i13 = i10;
                    mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i13), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i13).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
                    mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i13), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i13).getType04(), bj4VarO, 0, 24960, 110586);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    mh4Var5 = mh4Var4;
                    ei4Var4 = ei4Var3;
                    ox6Var4 = ox6Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(1879378485);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new rx3();
                            bj4VarO.C(objF);
                        }
                        mh4Var3 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i6 != 0) {
                        ei4Var2 = null;
                    }
                    fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
                    ox6 ox6VarA3 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i8 = IntercomTheme.$stable;
                    ox6Var3 = ox6Var2;
                    ox6 ox6VarL3 = eo7.l(we1.c(gi0.c(ox6VarA3, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarL3);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf3 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf3);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    i9 = i3;
                    ox6 ox6VarC6 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
                    fl6VarD = dv0.d(di.a.e, false);
                    mh4Var4 = mh4Var3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC6);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (ei4Var2 == null) {
                        bj4VarO.K(1527632066);
                        fileStyle2 = fileStyle;
                        cVar2 = cVar;
                        dVar2 = dVar;
                        i10 = i8;
                        th = null;
                        ei4Var3 = ei4Var2;
                        aVar3 = aVar2;
                        m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                        bj4VarO.U(false);
                    } else {
                        aVar3 = aVar2;
                        fileStyle2 = fileStyle;
                        ei4Var3 = ei4Var2;
                        cVar2 = cVar;
                        dVar2 = dVar;
                        i10 = i8;
                        th = null;
                        bj4VarO.K(1527900309);
                        ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(true);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw th;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar2, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar2, ox6VarC3);
                    int i14 = i10;
                    mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i14), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i14).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
                    mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i14), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i14).getType04(), bj4VarO, 0, 24960, 110586);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    mh4Var5 = mh4Var4;
                    ei4Var4 = ei4Var3;
                    ox6Var4 = ox6Var3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: sx3
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return FileRowKt.FileRow$lambda$5(other, zx8Var, ox6Var4, mh4Var5, ei4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            mh4Var2 = mh4Var;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    ei4Var2 = ei4Var;
                    if (bj4VarO.j(ei4Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(1879378485);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new rx3();
                            bj4VarO.C(objF);
                        }
                        mh4Var3 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i6 != 0) {
                        ei4Var2 = null;
                    }
                    fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
                    ox6 ox6VarA4 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i8 = IntercomTheme.$stable;
                    ox6Var3 = ox6Var2;
                    ox6 ox6VarL4 = eo7.l(we1.c(gi0.c(ox6VarA4, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarL4);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf4 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf4);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    i9 = i3;
                    ox6 ox6VarC7 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
                    fl6VarD = dv0.d(di.a.e, false);
                    mh4Var4 = mh4Var3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC7);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (ei4Var2 == null) {
                        bj4VarO.K(1527632066);
                        fileStyle2 = fileStyle;
                        cVar2 = cVar;
                        dVar2 = dVar;
                        i10 = i8;
                        th = null;
                        ei4Var3 = ei4Var2;
                        aVar3 = aVar2;
                        m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                        bj4VarO.U(false);
                    } else {
                        aVar3 = aVar2;
                        fileStyle2 = fileStyle;
                        ei4Var3 = ei4Var2;
                        cVar2 = cVar;
                        dVar2 = dVar;
                        i10 = i8;
                        th = null;
                        bj4VarO.K(1527900309);
                        ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(true);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw th;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar2, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar2, ox6VarC3);
                    int i15 = i10;
                    mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i15), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
                    mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i15), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i15).getType04(), bj4VarO, 0, 24960, 110586);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    mh4Var5 = mh4Var4;
                    ei4Var4 = ei4Var3;
                    ox6Var4 = ox6Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(1879378485);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new rx3();
                            bj4VarO.C(objF);
                        }
                        mh4Var3 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i6 != 0) {
                        ei4Var2 = null;
                    }
                    fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
                    ox6 ox6VarA5 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i8 = IntercomTheme.$stable;
                    ox6Var3 = ox6Var2;
                    ox6 ox6VarL5 = eo7.l(we1.c(gi0.c(ox6VarA5, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarL5);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf5 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf5);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    i9 = i3;
                    ox6 ox6VarC8 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
                    fl6VarD = dv0.d(di.a.e, false);
                    mh4Var4 = mh4Var3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC8);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (ei4Var2 == null) {
                        bj4VarO.K(1527632066);
                        fileStyle2 = fileStyle;
                        cVar2 = cVar;
                        dVar2 = dVar;
                        i10 = i8;
                        th = null;
                        ei4Var3 = ei4Var2;
                        aVar3 = aVar2;
                        m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                        bj4VarO.U(false);
                    } else {
                        aVar3 = aVar2;
                        fileStyle2 = fileStyle;
                        ei4Var3 = ei4Var2;
                        cVar2 = cVar;
                        dVar2 = dVar;
                        i10 = i8;
                        th = null;
                        bj4VarO.K(1527900309);
                        ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(true);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw th;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar2, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar2, ox6VarC3);
                    int i16 = i10;
                    mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i16), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i16).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
                    mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i16), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i16).getType04(), bj4VarO, 0, 24960, 110586);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    mh4Var5 = mh4Var4;
                    ei4Var4 = ei4Var3;
                    ox6Var4 = ox6Var3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: sx3
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return FileRowKt.FileRow$lambda$5(other, zx8Var, ox6Var4, mh4Var5, ei4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            ei4Var2 = ei4Var;
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    bj4VarO.K(1879378485);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new rx3();
                        bj4VarO.C(objF);
                    }
                    mh4Var3 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i6 != 0) {
                    ei4Var2 = null;
                }
                fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
                ox6 ox6VarA6 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
                intercomTheme = IntercomTheme.INSTANCE;
                i8 = IntercomTheme.$stable;
                ox6Var3 = ox6Var2;
                ox6 ox6VarL6 = eo7.l(we1.c(gi0.c(ox6VarA6, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarL6);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf6 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf6);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                i9 = i3;
                ox6 ox6VarC9 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
                fl6VarD = dv0.d(di.a.e, false);
                mh4Var4 = mh4Var3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC9);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (ei4Var2 == null) {
                    bj4VarO.K(1527632066);
                    fileStyle2 = fileStyle;
                    cVar2 = cVar;
                    dVar2 = dVar;
                    i10 = i8;
                    th = null;
                    ei4Var3 = ei4Var2;
                    aVar3 = aVar2;
                    m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                    bj4VarO.U(false);
                } else {
                    aVar3 = aVar2;
                    fileStyle2 = fileStyle;
                    ei4Var3 = ei4Var2;
                    cVar2 = cVar;
                    dVar2 = dVar;
                    i10 = i8;
                    th = null;
                    bj4VarO.K(1527900309);
                    ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                    bj4VarO.U(false);
                }
                bj4VarO.U(true);
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw th;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar2, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar2, ox6VarC3);
                int i17 = i10;
                mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i17), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i17).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
                mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i17), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i17).getType04(), bj4VarO, 0, 24960, 110586);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(true);
                mh4Var5 = mh4Var4;
                ei4Var4 = ei4Var3;
                ox6Var4 = ox6Var3;
            } else {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    bj4VarO.K(1879378485);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new rx3();
                        bj4VarO.C(objF);
                    }
                    mh4Var3 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i6 != 0) {
                    ei4Var2 = null;
                }
                fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
                ox6 ox6VarA7 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
                intercomTheme = IntercomTheme.INSTANCE;
                i8 = IntercomTheme.$stable;
                ox6Var3 = ox6Var2;
                ox6 ox6VarL7 = eo7.l(we1.c(gi0.c(ox6VarA7, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarL7);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf7 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf7);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                i9 = i3;
                ox6 ox6VarC10 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
                fl6VarD = dv0.d(di.a.e, false);
                mh4Var4 = mh4Var3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC10);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (ei4Var2 == null) {
                    bj4VarO.K(1527632066);
                    fileStyle2 = fileStyle;
                    cVar2 = cVar;
                    dVar2 = dVar;
                    i10 = i8;
                    th = null;
                    ei4Var3 = ei4Var2;
                    aVar3 = aVar2;
                    m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                    bj4VarO.U(false);
                } else {
                    aVar3 = aVar2;
                    fileStyle2 = fileStyle;
                    ei4Var3 = ei4Var2;
                    cVar2 = cVar;
                    dVar2 = dVar;
                    i10 = i8;
                    th = null;
                    bj4VarO.K(1527900309);
                    ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                    bj4VarO.U(false);
                }
                bj4VarO.U(true);
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw th;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar2, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar2, ox6VarC3);
                int i18 = i10;
                mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i18), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i18).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
                mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i18), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i18).getType04(), bj4VarO, 0, 24960, 110586);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(true);
                mh4Var5 = mh4Var4;
                ei4Var4 = ei4Var3;
                ox6Var4 = ox6Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: sx3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return FileRowKt.FileRow$lambda$5(other, zx8Var, ox6Var4, mh4Var5, ei4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                mh4Var2 = mh4Var;
                if (bj4VarO.j(mh4Var2)) {
                    i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    ei4Var2 = ei4Var;
                    if (bj4VarO.j(ei4Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(1879378485);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new rx3();
                            bj4VarO.C(objF);
                        }
                        mh4Var3 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i6 != 0) {
                        ei4Var2 = null;
                    }
                    fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
                    ox6 ox6VarA8 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i8 = IntercomTheme.$stable;
                    ox6Var3 = ox6Var2;
                    ox6 ox6VarL8 = eo7.l(we1.c(gi0.c(ox6VarA8, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarL8);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf8 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf8);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    i9 = i3;
                    ox6 ox6VarC11 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
                    fl6VarD = dv0.d(di.a.e, false);
                    mh4Var4 = mh4Var3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC11);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (ei4Var2 == null) {
                        bj4VarO.K(1527632066);
                        fileStyle2 = fileStyle;
                        cVar2 = cVar;
                        dVar2 = dVar;
                        i10 = i8;
                        th = null;
                        ei4Var3 = ei4Var2;
                        aVar3 = aVar2;
                        m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                        bj4VarO.U(false);
                    } else {
                        aVar3 = aVar2;
                        fileStyle2 = fileStyle;
                        ei4Var3 = ei4Var2;
                        cVar2 = cVar;
                        dVar2 = dVar;
                        i10 = i8;
                        th = null;
                        bj4VarO.K(1527900309);
                        ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(true);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw th;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar2, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar2, ox6VarC3);
                    int i19 = i10;
                    mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i19), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
                    mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i19), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i19).getType04(), bj4VarO, 0, 24960, 110586);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    mh4Var5 = mh4Var4;
                    ei4Var4 = ei4Var3;
                    ox6Var4 = ox6Var3;
                } else {
                    aVar = ox6.a.t;
                    if (i11 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(1879378485);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new rx3();
                            bj4VarO.C(objF);
                        }
                        mh4Var3 = (mh4) objF;
                        bj4VarO.U(false);
                    } else {
                        mh4Var3 = mh4Var2;
                    }
                    if (i6 != 0) {
                        ei4Var2 = null;
                    }
                    fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
                    ox6 ox6VarA9 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i8 = IntercomTheme.$stable;
                    ox6Var3 = ox6Var2;
                    ox6 ox6VarL9 = eo7.l(we1.c(gi0.c(ox6VarA9, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarL9);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    cVar = bt1.a.f;
                    rd7.d(bj4VarO, cVar, ny8VarA);
                    eVar = bt1.a.e;
                    rd7.d(bj4VarO, eVar, kw7VarP);
                    Integer numValueOf9 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf9);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    i9 = i3;
                    ox6 ox6VarC12 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
                    fl6VarD = dv0.d(di.a.e, false);
                    mh4Var4 = mh4Var3;
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarC12);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    if (ei4Var2 == null) {
                        bj4VarO.K(1527632066);
                        fileStyle2 = fileStyle;
                        cVar2 = cVar;
                        dVar2 = dVar;
                        i10 = i8;
                        th = null;
                        ei4Var3 = ei4Var2;
                        aVar3 = aVar2;
                        m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                        bj4VarO.U(false);
                    } else {
                        aVar3 = aVar2;
                        fileStyle2 = fileStyle;
                        ei4Var3 = ei4Var2;
                        cVar2 = cVar;
                        dVar2 = dVar;
                        i10 = i8;
                        th = null;
                        bj4VarO.K(1527900309);
                        ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                        bj4VarO.U(false);
                    }
                    bj4VarO.U(true);
                    b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                    aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, aVar);
                    if (j1bVar == null) {
                        ml5.c();
                        throw th;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar3);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar2, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar2, ox6VarC3);
                    int i110 = i10;
                    mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i110), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i110).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
                    mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i110), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i110).getType04(), bj4VarO, 0, 24960, 110586);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    bj4VarO.U(true);
                    mh4Var5 = mh4Var4;
                    ei4Var4 = ei4Var3;
                    ox6Var4 = ox6Var3;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: sx3
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return FileRowKt.FileRow$lambda$5(other, zx8Var, ox6Var4, mh4Var5, ei4Var4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            ei4Var2 = ei4Var;
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    bj4VarO.K(1879378485);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new rx3();
                        bj4VarO.C(objF);
                    }
                    mh4Var3 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i6 != 0) {
                    ei4Var2 = null;
                }
                fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
                ox6 ox6VarA10 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
                intercomTheme = IntercomTheme.INSTANCE;
                i8 = IntercomTheme.$stable;
                ox6Var3 = ox6Var2;
                ox6 ox6VarL10 = eo7.l(we1.c(gi0.c(ox6VarA10, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarL10);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf10 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf10);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                i9 = i3;
                ox6 ox6VarC13 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
                fl6VarD = dv0.d(di.a.e, false);
                mh4Var4 = mh4Var3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC13);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (ei4Var2 == null) {
                    bj4VarO.K(1527632066);
                    fileStyle2 = fileStyle;
                    cVar2 = cVar;
                    dVar2 = dVar;
                    i10 = i8;
                    th = null;
                    ei4Var3 = ei4Var2;
                    aVar3 = aVar2;
                    m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                    bj4VarO.U(false);
                } else {
                    aVar3 = aVar2;
                    fileStyle2 = fileStyle;
                    ei4Var3 = ei4Var2;
                    cVar2 = cVar;
                    dVar2 = dVar;
                    i10 = i8;
                    th = null;
                    bj4VarO.K(1527900309);
                    ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                    bj4VarO.U(false);
                }
                bj4VarO.U(true);
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw th;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar2, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar2, ox6VarC3);
                int i111 = i10;
                mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i111), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i111).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
                mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i111), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i111).getType04(), bj4VarO, 0, 24960, 110586);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(true);
                mh4Var5 = mh4Var4;
                ei4Var4 = ei4Var3;
                ox6Var4 = ox6Var3;
            } else {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    bj4VarO.K(1879378485);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new rx3();
                        bj4VarO.C(objF);
                    }
                    mh4Var3 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i6 != 0) {
                    ei4Var2 = null;
                }
                fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
                ox6 ox6VarA11 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
                intercomTheme = IntercomTheme.INSTANCE;
                i8 = IntercomTheme.$stable;
                ox6Var3 = ox6Var2;
                ox6 ox6VarL11 = eo7.l(we1.c(gi0.c(ox6VarA11, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarL11);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf11 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf11);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                i9 = i3;
                ox6 ox6VarC14 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
                fl6VarD = dv0.d(di.a.e, false);
                mh4Var4 = mh4Var3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC14);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (ei4Var2 == null) {
                    bj4VarO.K(1527632066);
                    fileStyle2 = fileStyle;
                    cVar2 = cVar;
                    dVar2 = dVar;
                    i10 = i8;
                    th = null;
                    ei4Var3 = ei4Var2;
                    aVar3 = aVar2;
                    m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                    bj4VarO.U(false);
                } else {
                    aVar3 = aVar2;
                    fileStyle2 = fileStyle;
                    ei4Var3 = ei4Var2;
                    cVar2 = cVar;
                    dVar2 = dVar;
                    i10 = i8;
                    th = null;
                    bj4VarO.K(1527900309);
                    ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                    bj4VarO.U(false);
                }
                bj4VarO.U(true);
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw th;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar2, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar2, ox6VarC3);
                int i112 = i10;
                mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i112), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i112).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
                mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i112), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i112).getType04(), bj4VarO, 0, 24960, 110586);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(true);
                mh4Var5 = mh4Var4;
                ei4Var4 = ei4Var3;
                ox6Var4 = ox6Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: sx3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return FileRowKt.FileRow$lambda$5(other, zx8Var, ox6Var4, mh4Var5, ei4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        mh4Var2 = mh4Var;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                ei4Var2 = ei4Var;
                if (bj4VarO.j(ei4Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    bj4VarO.K(1879378485);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new rx3();
                        bj4VarO.C(objF);
                    }
                    mh4Var3 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i6 != 0) {
                    ei4Var2 = null;
                }
                fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
                ox6 ox6VarA12 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
                intercomTheme = IntercomTheme.INSTANCE;
                i8 = IntercomTheme.$stable;
                ox6Var3 = ox6Var2;
                ox6 ox6VarL12 = eo7.l(we1.c(gi0.c(ox6VarA12, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarL12);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf12 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf12);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                i9 = i3;
                ox6 ox6VarC15 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
                fl6VarD = dv0.d(di.a.e, false);
                mh4Var4 = mh4Var3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC15);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (ei4Var2 == null) {
                    bj4VarO.K(1527632066);
                    fileStyle2 = fileStyle;
                    cVar2 = cVar;
                    dVar2 = dVar;
                    i10 = i8;
                    th = null;
                    ei4Var3 = ei4Var2;
                    aVar3 = aVar2;
                    m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                    bj4VarO.U(false);
                } else {
                    aVar3 = aVar2;
                    fileStyle2 = fileStyle;
                    ei4Var3 = ei4Var2;
                    cVar2 = cVar;
                    dVar2 = dVar;
                    i10 = i8;
                    th = null;
                    bj4VarO.K(1527900309);
                    ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                    bj4VarO.U(false);
                }
                bj4VarO.U(true);
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw th;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar2, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar2, ox6VarC3);
                int i113 = i10;
                mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i113), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i113).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
                mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i113), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i113).getType04(), bj4VarO, 0, 24960, 110586);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(true);
                mh4Var5 = mh4Var4;
                ei4Var4 = ei4Var3;
                ox6Var4 = ox6Var3;
            } else {
                aVar = ox6.a.t;
                if (i11 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    bj4VarO.K(1879378485);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new rx3();
                        bj4VarO.C(objF);
                    }
                    mh4Var3 = (mh4) objF;
                    bj4VarO.U(false);
                } else {
                    mh4Var3 = mh4Var2;
                }
                if (i6 != 0) {
                    ei4Var2 = null;
                }
                fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
                ox6 ox6VarA13 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
                intercomTheme = IntercomTheme.INSTANCE;
                i8 = IntercomTheme.$stable;
                ox6Var3 = ox6Var2;
                ox6 ox6VarL13 = eo7.l(we1.c(gi0.c(ox6VarA13, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarL13);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                cVar = bt1.a.f;
                rd7.d(bj4VarO, cVar, ny8VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf13 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf13);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                i9 = i3;
                ox6 ox6VarC16 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
                fl6VarD = dv0.d(di.a.e, false);
                mh4Var4 = mh4Var3;
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarC16);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                if (ei4Var2 == null) {
                    bj4VarO.K(1527632066);
                    fileStyle2 = fileStyle;
                    cVar2 = cVar;
                    dVar2 = dVar;
                    i10 = i8;
                    th = null;
                    ei4Var3 = ei4Var2;
                    aVar3 = aVar2;
                    m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                    bj4VarO.U(false);
                } else {
                    aVar3 = aVar2;
                    fileStyle2 = fileStyle;
                    ei4Var3 = ei4Var2;
                    cVar2 = cVar;
                    dVar2 = dVar;
                    i10 = i8;
                    th = null;
                    bj4VarO.K(1527900309);
                    ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                    bj4VarO.U(false);
                }
                bj4VarO.U(true);
                b47.b(bj4VarO, ir9.n(aVar, 8.0f));
                aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, aVar);
                if (j1bVar == null) {
                    ml5.c();
                    throw th;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar2, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar2, ox6VarC3);
                int i114 = i10;
                mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i114), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i114).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
                mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i114), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i114).getType04(), bj4VarO, 0, 24960, 110586);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                bj4VarO.U(true);
                mh4Var5 = mh4Var4;
                ei4Var4 = ei4Var3;
                ox6Var4 = ox6Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: sx3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return FileRowKt.FileRow$lambda$5(other, zx8Var, ox6Var4, mh4Var5, ei4Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        ei4Var2 = ei4Var;
        if ((i3 & 9363) == 9362) {
            aVar = ox6.a.t;
            if (i11 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                bj4VarO.K(1879378485);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = new rx3();
                    bj4VarO.C(objF);
                }
                mh4Var3 = (mh4) objF;
                bj4VarO.U(false);
            } else {
                mh4Var3 = mh4Var2;
            }
            if (i6 != 0) {
                ei4Var2 = null;
            }
            fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
            ox6 ox6VarA14 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
            intercomTheme = IntercomTheme.INSTANCE;
            i8 = IntercomTheme.$stable;
            ox6Var3 = ox6Var2;
            ox6 ox6VarL14 = eo7.l(we1.c(gi0.c(ox6VarA14, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarL14);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, ny8VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf14 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf14);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            i9 = i3;
            ox6 ox6VarC17 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
            fl6VarD = dv0.d(di.a.e, false);
            mh4Var4 = mh4Var3;
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarC17);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, fl6VarD);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            if (ei4Var2 == null) {
                bj4VarO.K(1527632066);
                fileStyle2 = fileStyle;
                cVar2 = cVar;
                dVar2 = dVar;
                i10 = i8;
                th = null;
                ei4Var3 = ei4Var2;
                aVar3 = aVar2;
                m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                bj4VarO.U(false);
            } else {
                aVar3 = aVar2;
                fileStyle2 = fileStyle;
                ei4Var3 = ei4Var2;
                cVar2 = cVar;
                dVar2 = dVar;
                i10 = i8;
                th = null;
                bj4VarO.K(1527900309);
                ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                bj4VarO.U(false);
            }
            bj4VarO.U(true);
            b47.b(bj4VarO, ir9.n(aVar, 8.0f));
            aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
            iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7VarP3 = bj4VarO.P();
            ox6VarC3 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw th;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar2, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar2, ox6VarC3);
            int i115 = i10;
            mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i115), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i115).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
            mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i115), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i115).getType04(), bj4VarO, 0, 24960, 110586);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
            bj4VarO.U(true);
            mh4Var5 = mh4Var4;
            ei4Var4 = ei4Var3;
            ox6Var4 = ox6Var3;
        } else {
            aVar = ox6.a.t;
            if (i11 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                bj4VarO.K(1879378485);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = new rx3();
                    bj4VarO.C(objF);
                }
                mh4Var3 = (mh4) objF;
                bj4VarO.U(false);
            } else {
                mh4Var3 = mh4Var2;
            }
            if (i6 != 0) {
                ei4Var2 = null;
            }
            fileStyle = getFileStyle(other2.getMimeType(), other2.getFileName(), bj4VarO, 0);
            ox6 ox6VarA15 = uma.a(ir9.c(ox6Var2, 1.0f), zx8Var);
            intercomTheme = IntercomTheme.INSTANCE;
            i8 = IntercomTheme.$stable;
            ox6Var3 = ox6Var2;
            ox6 ox6VarL15 = eo7.l(we1.c(gi0.c(ox6VarA15, intercomTheme.getColors(bj4VarO, i8).getContainer().m794getNeutral0d7_KjU(), al8.a), false, null, mh4Var3, 15), 12.0f, 12.0f, 16.0f, 12.0f);
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarL15);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, ny8VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf15 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf15);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            i9 = i3;
            ox6 ox6VarC18 = gi0.c(ir9.j(aVar, 40.0f), fileStyle.m278getBackgroundColor0d7_KjU(), ay8.b(10.0f));
            fl6VarD = dv0.d(di.a.e, false);
            mh4Var4 = mh4Var3;
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarC18);
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, fl6VarD);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            if (ei4Var2 == null) {
                bj4VarO.K(1527632066);
                fileStyle2 = fileStyle;
                cVar2 = cVar;
                dVar2 = dVar;
                i10 = i8;
                th = null;
                ei4Var3 = ei4Var2;
                aVar3 = aVar2;
                m65.b(is7.a(fileStyle.getIcon(), bj4VarO, 0), null, ir9.j(aVar, 20.0f), fileStyle.m279getIconColor0d7_KjU(), bj4VarO, 440, 0);
                bj4VarO.U(false);
            } else {
                aVar3 = aVar2;
                fileStyle2 = fileStyle;
                ei4Var3 = ei4Var2;
                cVar2 = cVar;
                dVar2 = dVar;
                i10 = i8;
                th = null;
                bj4VarO.K(1527900309);
                ei4Var3.invoke(fileStyle2, bj4VarO, Integer.valueOf((i9 >> 9) & 112));
                bj4VarO.U(false);
            }
            bj4VarO.U(true);
            b47.b(bj4VarO, ir9.n(aVar, 8.0f));
            aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, bj4VarO, 6);
            iHashCode3 = Long.hashCode(bj4VarO.T);
            kw7VarP3 = bj4VarO.P();
            ox6VarC3 = it1.c(bj4VarO, aVar);
            if (j1bVar == null) {
                ml5.c();
                throw th;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar2, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP3);
            l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar2, ox6VarC3);
            int i116 = i10;
            mia.b(other.getFileName(), null, gh5.a(intercomTheme, bj4VarO, i116), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i116).getType04SemiBold(), bj4VarO, 0, 24960, 110586);
            mia.b(fileStyle2.getType(), null, ac4.b(intercomTheme, bj4VarO, i116), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, intercomTheme.getTypography(bj4VarO, i116).getType04(), bj4VarO, 0, 24960, 110586);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
            bj4VarO.U(true);
            mh4Var5 = mh4Var4;
            ei4Var4 = ei4Var3;
            ox6Var4 = ox6Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: sx3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileRowKt.FileRow$lambda$5(other, zx8Var, ox6Var4, mh4Var5, ei4Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileRow$lambda$5(MediaData.Media.Other other, zx8 zx8Var, ox6 ox6Var, mh4 mh4Var, ei4 ei4Var, int i, int i2, jt1 jt1Var, int i3) {
        FileRow(other, zx8Var, ox6Var, mh4Var, ei4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void FileRowPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(486972875);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FileRowKt.INSTANCE.m229getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: tx3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FileRowKt.FileRowPreview$lambda$6(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FileRowPreview$lambda$6(int i, jt1 jt1Var, int i2) {
        FileRowPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final FileStyle getFileStyle(String str, String str2, jt1 jt1Var, int i) {
        FileStyle fileStyle;
        jt1Var.K(2000929547);
        if (ContentTypeExtensionKt.isPdf(str) || w2a.h(str2, ".pdf", true)) {
            jt1Var.K(180161046);
            int i2 = R.drawable.intercom_ic_file;
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i3 = IntercomTheme.$stable;
            fileStyle = new FileStyle(i2, intercomTheme.getColors(jt1Var, i3).getContainer().m795getRed0d7_KjU(), intercomTheme.getColors(jt1Var, i3).getIcon().m812getOnInversed0d7_KjU(), "PDF", null);
            jt1Var.B();
        } else if (ContentTypeExtensionKt.isCsv(str) || w2a.h(str2, ".csv", true)) {
            jt1Var.K(180169815);
            int i4 = R.drawable.intercom_ic_csv;
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i5 = IntercomTheme.$stable;
            fileStyle = new FileStyle(i4, intercomTheme2.getColors(jt1Var, i5).getContainer().m793getGreen0d7_KjU(), intercomTheme2.getColors(jt1Var, i5).getIcon().m812getOnInversed0d7_KjU(), "CSV", null);
            jt1Var.B();
        } else if (ContentTypeExtensionKt.isZip(str) || w2a.h(str2, ".zip", true)) {
            jt1Var.K(180178614);
            int i6 = R.drawable.intercom_ic_zip;
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i7 = IntercomTheme.$stable;
            fileStyle = new FileStyle(i6, intercomTheme3.getColors(jt1Var, i7).getContainer().m791getBlue0d7_KjU(), intercomTheme3.getColors(jt1Var, i7).getIcon().m812getOnInversed0d7_KjU(), "ZIP", null);
            jt1Var.B();
        } else if (ContentTypeExtensionKt.isTxt(str) || w2a.h(str2, ".txt", true)) {
            jt1Var.K(180187383);
            int i8 = R.drawable.intercom_ic_txt;
            IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
            int i9 = IntercomTheme.$stable;
            fileStyle = new FileStyle(i8, intercomTheme4.getColors(jt1Var, i9).getContainer().m790getBlack0d7_KjU(), intercomTheme4.getColors(jt1Var, i9).getIcon().m812getOnInversed0d7_KjU(), "TXT", null);
            jt1Var.B();
        } else {
            jt1Var.K(180194423);
            int i10 = R.drawable.intercom_ic_file;
            IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
            int i11 = IntercomTheme.$stable;
            fileStyle = new FileStyle(i10, intercomTheme5.getColors(jt1Var, i11).getContainer().m795getRed0d7_KjU(), intercomTheme5.getColors(jt1Var, i11).getIcon().m812getOnInversed0d7_KjU(), nr1.f(jt1Var, io.intercom.android.sdk.R.string.intercom_file), null);
            jt1Var.B();
        }
        jt1Var.B();
        return fileStyle;
    }
}
