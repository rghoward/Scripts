package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a30;
import defpackage.ae8;
import defpackage.ay8;
import defpackage.b85;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.bz5;
import defpackage.c30;
import defpackage.ci4;
import defpackage.d50;
import defpackage.di;
import defpackage.do6;
import defpackage.dv0;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.fi4;
import defpackage.fl6;
import defpackage.fr1;
import defpackage.fv5;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h65;
import defpackage.i31;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.k85;
import defpackage.ko7;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.l02;
import defpackage.m65;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.no6;
import defpackage.nr1;
import defpackage.ns0;
import defpackage.nz1;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.uma;
import defpackage.uw;
import defpackage.we1;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.y0a;
import defpackage.ys5;
import defpackage.zf7;
import defpackage.zx8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaItemsKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FileRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FileStyle;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.upload.data.MediaData;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MediaItemsKt {
    /* JADX WARN: Code duplicated, block: B:100:0x024f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0257  */
    /* JADX WARN: Code duplicated, block: B:104:0x0286  */
    /* JADX WARN: Code duplicated, block: B:106:0x028a  */
    /* JADX WARN: Code duplicated, block: B:108:0x029a  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:113:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:116:0x0300  */
    /* JADX WARN: Code duplicated, block: B:119:0x0339  */
    /* JADX WARN: Code duplicated, block: B:121:0x0356  */
    /* JADX WARN: Code duplicated, block: B:123:0x035a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0362  */
    /* JADX WARN: Code duplicated, block: B:127:0x036e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0391  */
    /* JADX WARN: Code duplicated, block: B:132:0x03af  */
    /* JADX WARN: Code duplicated, block: B:134:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:138:0x03be  */
    /* JADX WARN: Code duplicated, block: B:142:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:153:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:155:0x040f  */
    /* JADX WARN: Code duplicated, block: B:157:0x041d  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x0196  */
    /* JADX WARN: Code duplicated, block: B:76:0x0198  */
    /* JADX WARN: Code duplicated, block: B:79:0x019f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:96:0x0213  */
    /* JADX WARN: Code duplicated, block: B:98:0x0248  */
    private static final void ImageItem(MediaUploadItem mediaUploadItem, final mh4<g2b> mh4Var, oh4<? super MediaUploadItem, g2b> oh4Var, final oh4<? super MediaUploadItem, g2b> oh4Var2, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        ox6.a aVar;
        ox6 ox6Var3;
        MediaData.Media mediaData;
        final MediaUploadItem.UploadState uploadState;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        kv0 kv0Var;
        sp0 sp0Var;
        IntercomTheme intercomTheme;
        int i4;
        boolean z;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objF;
        jt1.a.C0187a c0187a;
        int i6;
        jt1.a.C0187a c0187a2;
        float f;
        boolean z5;
        fl6 fl6VarD2;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        Object objF2;
        boolean z6;
        boolean z7;
        Object objF3;
        final ox6 ox6Var4;
        fl6 fl6VarD3;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        xj8 xj8VarW;
        final MediaUploadItem mediaUploadItem2 = mediaUploadItem;
        final oh4<? super MediaUploadItem, g2b> oh4Var3 = oh4Var;
        bj4 bj4VarO = jt1Var.o(179381522);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bj4VarO.J(mediaUploadItem2) : bj4VarO.j(mediaUploadItem2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(oh4Var3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(oh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i7 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                mediaData = mediaUploadItem2.getMediaData();
                uploadState = mediaUploadItem2.getUploadState();
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var3);
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
                rd7.d(bj4VarO, cVar, fl6VarD);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                zx8 zx8VarB = ay8.b(16.0f);
                y0a y0aVar = AndroidCompositionLocals_androidKt.b;
                k85.a aVar3 = new k85.a((Context) bj4VarO.F(y0aVar));
                aVar3.c = mediaData.getUri();
                aVar3.b();
                aVar3.c(R.drawable.intercom_image_load_failed);
                k85 k85VarA = aVar3.a();
                b85 imageLoader = IntercomImageLoaderKt.getImageLoader((Context) bj4VarO.F(y0aVar));
                ox6 ox6Var5 = ox6Var3;
                String fileName = mediaData.getFileName();
                kv0Var = kv0.a;
                sp0Var = di.a.e;
                ox6 ox6VarA = uma.a(ir9.j(kv0Var.f(aVar, sp0Var), 64.0f), zx8VarB);
                intercomTheme = IntercomTheme.INSTANCE;
                i4 = IntercomTheme.$stable;
                ox6 ox6VarA2 = ns0.a(gi0.c(ox6VarA, intercomTheme.getColors(bj4VarO, i4).m760getComposerMediaBackground0d7_KjU(), zx8VarB), 1.0f, intercomTheme.getColors(bj4VarO, i4).getAlpha().m687getBlack100d7_KjU(), zx8VarB);
                bj4VarO.K(213144559);
                boolean zJ = bj4VarO.j(uploadState);
                if ((i3 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z8 = zJ | z;
                i5 = i3 & 14;
                if (i5 != 4 || ((i3 & 8) != 0 && bj4VarO.j(mediaUploadItem2))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z9 = z8 | z2;
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z9 | z3;
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (z4 || objF == c0187a) {
                    objF = new mh4() { // from class: eo6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MediaItemsKt.ImageItem$lambda$15$lambda$8$lambda$7(uploadState, oh4Var2, mediaUploadItem2, mh4Var);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                i6 = i3;
                d50.b(k85VarA, fileName, imageLoader, we1.c(ox6VarA2, false, null, (mh4) objF, 15), null, nz1.a.a, null, bj4VarO, 12582912, 8048);
                if (uploadState instanceof MediaUploadItem.UploadState.Uploading) {
                    bj4VarO.K(-1981783165);
                    ox6 ox6VarC4 = gi0.c(ir9.j(kv0Var.f(aVar, sp0Var), 64.0f), intercomTheme.getColors(bj4VarO, i4).m762getComposerMediaUploadingBackground0d7_KjU(), intercomTheme.getShapes(bj4VarO, i4).d);
                    fl6VarD3 = dv0.d(sp0Var, false);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarC4);
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
                    rd7.d(bj4VarO, cVar, fl6VarD3);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    m190MediaProgressIndicatorkbKKJSQ(0.0f, 0L, bj4VarO, 0, 3);
                    bj4VarO.U(true);
                    bj4VarO.U(false);
                    c0187a2 = c0187a;
                    f = 8.0f;
                } else if (uploadState instanceof MediaUploadItem.UploadState.Error) {
                    bj4VarO.K(-1981195808);
                    ox6 ox6VarC5 = gi0.c(ir9.j(kv0Var.f(aVar, sp0Var), 64.0f), intercomTheme.getColors(bj4VarO, i4).m762getComposerMediaUploadingBackground0d7_KjU(), intercomTheme.getShapes(bj4VarO, i4).d);
                    fl6VarD2 = dv0.d(sp0Var, false);
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
                    rd7.d(bj4VarO, cVar, fl6VarD2);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(167180719);
                    if (((MediaUploadItem.UploadState.Error) uploadState).getError().getCanRetry()) {
                        m191MediaRetryIconkbKKJSQ(0.0f, 0L, bj4VarO, 0, 3);
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    f = 8.0f;
                    ox6 ox6VarB = zf7.b(8.0f, 8.0f, kv0Var.f(aVar, di.a.i));
                    int i8 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_exlamation_mark;
                    long jM808getError0d7_KjU = intercomTheme.getColors(bj4VarO, i4).getIcon().m808getError0d7_KjU();
                    bj4VarO.K(213209312);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new i31(1);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    m189MediaIconButtonjA1GFJw((mh4) objF2, ox6VarB, i8, jM808getError0d7_KjU, 0L, bj4VarO, 6, 16);
                    bj4VarO.U(false);
                    c0187a2 = c0187a;
                } else {
                    c0187a2 = c0187a;
                    f = 8.0f;
                    if (!(uploadState instanceof MediaUploadItem.UploadState.Success)) {
                        bj4VarO.K(213165681);
                        bj4VarO.U(false);
                        defpackage.u.b();
                        return;
                    } else {
                        bj4VarO.K(-1980097819);
                        if (mediaData instanceof MediaData.Media.Video) {
                            z5 = false;
                            m65.b(is7.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_play, bj4VarO, 0), null, kv0Var.f(ir9.j(aVar, 24.0f), sp0Var), intercomTheme.getColors(bj4VarO, i4).m763getComposerMediaUploadingForeground0d7_KjU(), bj4VarO, 56, 0);
                            bj4VarO = bj4VarO;
                        } else {
                            z5 = false;
                        }
                        bj4VarO.U(z5);
                    }
                }
                ox6 ox6VarB2 = zf7.b(f, -8.0f, kv0Var.f(aVar, di.a.c));
                bj4VarO.K(213243287);
                if ((i6 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i5 != 4) {
                    mediaUploadItem2 = mediaUploadItem;
                    boolean z10 = (i6 & 8) == 0 && bj4VarO.j(mediaUploadItem2);
                    z7 = z10 | z6;
                    objF3 = bj4VarO.f();
                    if (!z7 || objF3 == c0187a2) {
                        oh4Var3 = oh4Var;
                        objF3 = new mh4() { // from class: fo6
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return MediaItemsKt.ImageItem$lambda$15$lambda$14$lambda$13(oh4Var3, mediaUploadItem2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        oh4Var3 = oh4Var;
                    }
                    bj4VarO.U(false);
                    m189MediaIconButtonjA1GFJw((mh4) objF3, ox6VarB2, 0, 0L, 0L, bj4VarO, 0, 28);
                    bj4VarO.U(true);
                    ox6Var4 = ox6Var5;
                } else {
                    mediaUploadItem2 = mediaUploadItem;
                }
                z7 = z10 | z6;
                objF3 = bj4VarO.f();
                if (z7) {
                    oh4Var3 = oh4Var;
                    objF3 = new mh4() { // from class: fo6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MediaItemsKt.ImageItem$lambda$15$lambda$14$lambda$13(oh4Var3, mediaUploadItem2);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    oh4Var3 = oh4Var;
                    objF3 = new mh4() { // from class: fo6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MediaItemsKt.ImageItem$lambda$15$lambda$14$lambda$13(oh4Var3, mediaUploadItem2);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                m189MediaIconButtonjA1GFJw((mh4) objF3, ox6VarB2, 0, 0L, 0L, bj4VarO, 0, 28);
                bj4VarO.U(true);
                ox6Var4 = ox6Var5;
            } else {
                bj4VarO.u();
                ox6Var4 = ox6Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: go6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MediaItemsKt.ImageItem$lambda$16(mediaUploadItem2, mh4Var, oh4Var3, oh4Var2, ox6Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        ox6Var2 = ox6Var;
        if ((i3 & 9363) == 9362) {
            aVar = ox6.a.t;
            if (i7 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            mediaData = mediaUploadItem2.getMediaData();
            uploadState = mediaUploadItem2.getUploadState();
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
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
            rd7.d(bj4VarO, cVar, fl6VarD);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf2);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            zx8 zx8VarB2 = ay8.b(16.0f);
            y0a y0aVar2 = AndroidCompositionLocals_androidKt.b;
            k85.a aVar4 = new k85.a((Context) bj4VarO.F(y0aVar2));
            aVar4.c = mediaData.getUri();
            aVar4.b();
            aVar4.c(R.drawable.intercom_image_load_failed);
            k85 k85VarA2 = aVar4.a();
            b85 imageLoader2 = IntercomImageLoaderKt.getImageLoader((Context) bj4VarO.F(y0aVar2));
            ox6 ox6Var6 = ox6Var3;
            String fileName2 = mediaData.getFileName();
            kv0Var = kv0.a;
            sp0Var = di.a.e;
            ox6 ox6VarA3 = uma.a(ir9.j(kv0Var.f(aVar, sp0Var), 64.0f), zx8VarB2);
            intercomTheme = IntercomTheme.INSTANCE;
            i4 = IntercomTheme.$stable;
            ox6 ox6VarA4 = ns0.a(gi0.c(ox6VarA3, intercomTheme.getColors(bj4VarO, i4).m760getComposerMediaBackground0d7_KjU(), zx8VarB2), 1.0f, intercomTheme.getColors(bj4VarO, i4).getAlpha().m687getBlack100d7_KjU(), zx8VarB2);
            bj4VarO.K(213144559);
            boolean zJ2 = bj4VarO.j(uploadState);
            if ((i3 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            boolean z11 = zJ2 | z;
            i5 = i3 & 14;
            if (i5 != 4) {
                z2 = true;
            } else {
                z2 = true;
            }
            boolean z12 = z11 | z2;
            if ((i3 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z12 | z3;
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (z4) {
                objF = new mh4() { // from class: eo6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return MediaItemsKt.ImageItem$lambda$15$lambda$8$lambda$7(uploadState, oh4Var2, mediaUploadItem2, mh4Var);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: eo6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return MediaItemsKt.ImageItem$lambda$15$lambda$8$lambda$7(uploadState, oh4Var2, mediaUploadItem2, mh4Var);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            i6 = i3;
            d50.b(k85VarA2, fileName2, imageLoader2, we1.c(ox6VarA4, false, null, (mh4) objF, 15), null, nz1.a.a, null, bj4VarO, 12582912, 8048);
            if (uploadState instanceof MediaUploadItem.UploadState.Uploading) {
                bj4VarO.K(-1981783165);
                ox6 ox6VarC6 = gi0.c(ir9.j(kv0Var.f(aVar, sp0Var), 64.0f), intercomTheme.getColors(bj4VarO, i4).m762getComposerMediaUploadingBackground0d7_KjU(), intercomTheme.getShapes(bj4VarO, i4).d);
                fl6VarD3 = dv0.d(sp0Var, false);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarC6);
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
                rd7.d(bj4VarO, cVar, fl6VarD3);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                m190MediaProgressIndicatorkbKKJSQ(0.0f, 0L, bj4VarO, 0, 3);
                bj4VarO.U(true);
                bj4VarO.U(false);
                c0187a2 = c0187a;
                f = 8.0f;
            } else if (uploadState instanceof MediaUploadItem.UploadState.Error) {
                bj4VarO.K(-1981195808);
                ox6 ox6VarC7 = gi0.c(ir9.j(kv0Var.f(aVar, sp0Var), 64.0f), intercomTheme.getColors(bj4VarO, i4).m762getComposerMediaUploadingBackground0d7_KjU(), intercomTheme.getShapes(bj4VarO, i4).d);
                fl6VarD2 = dv0.d(sp0Var, false);
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
                rd7.d(bj4VarO, cVar, fl6VarD2);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(167180719);
                if (((MediaUploadItem.UploadState.Error) uploadState).getError().getCanRetry()) {
                    m191MediaRetryIconkbKKJSQ(0.0f, 0L, bj4VarO, 0, 3);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                f = 8.0f;
                ox6 ox6VarB3 = zf7.b(8.0f, 8.0f, kv0Var.f(aVar, di.a.i));
                int i9 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_exlamation_mark;
                long jM808getError0d7_KjU2 = intercomTheme.getColors(bj4VarO, i4).getIcon().m808getError0d7_KjU();
                bj4VarO.K(213209312);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new i31(1);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                m189MediaIconButtonjA1GFJw((mh4) objF2, ox6VarB3, i9, jM808getError0d7_KjU2, 0L, bj4VarO, 6, 16);
                bj4VarO.U(false);
                c0187a2 = c0187a;
            } else {
                c0187a2 = c0187a;
                f = 8.0f;
                if (!(uploadState instanceof MediaUploadItem.UploadState.Success)) {
                    bj4VarO.K(213165681);
                    bj4VarO.U(false);
                    defpackage.u.b();
                    return;
                } else {
                    bj4VarO.K(-1980097819);
                    if (mediaData instanceof MediaData.Media.Video) {
                        z5 = false;
                        m65.b(is7.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_play, bj4VarO, 0), null, kv0Var.f(ir9.j(aVar, 24.0f), sp0Var), intercomTheme.getColors(bj4VarO, i4).m763getComposerMediaUploadingForeground0d7_KjU(), bj4VarO, 56, 0);
                        bj4VarO = bj4VarO;
                    } else {
                        z5 = false;
                    }
                    bj4VarO.U(z5);
                }
            }
            ox6 ox6VarB4 = zf7.b(f, -8.0f, kv0Var.f(aVar, di.a.c));
            bj4VarO.K(213243287);
            if ((i6 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (i5 != 4) {
                mediaUploadItem2 = mediaUploadItem;
                if ((i6 & 8) == 0) {
                }
                z7 = z10 | z6;
                objF3 = bj4VarO.f();
                if (z7) {
                    oh4Var3 = oh4Var;
                    objF3 = new mh4() { // from class: fo6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MediaItemsKt.ImageItem$lambda$15$lambda$14$lambda$13(oh4Var3, mediaUploadItem2);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    oh4Var3 = oh4Var;
                    objF3 = new mh4() { // from class: fo6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MediaItemsKt.ImageItem$lambda$15$lambda$14$lambda$13(oh4Var3, mediaUploadItem2);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                m189MediaIconButtonjA1GFJw((mh4) objF3, ox6VarB4, 0, 0L, 0L, bj4VarO, 0, 28);
                bj4VarO.U(true);
                ox6Var4 = ox6Var6;
            } else {
                mediaUploadItem2 = mediaUploadItem;
            }
            z7 = z10 | z6;
            objF3 = bj4VarO.f();
            if (z7) {
                oh4Var3 = oh4Var;
                objF3 = new mh4() { // from class: fo6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return MediaItemsKt.ImageItem$lambda$15$lambda$14$lambda$13(oh4Var3, mediaUploadItem2);
                    }
                };
                bj4VarO.C(objF3);
            } else {
                oh4Var3 = oh4Var;
                objF3 = new mh4() { // from class: fo6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return MediaItemsKt.ImageItem$lambda$15$lambda$14$lambda$13(oh4Var3, mediaUploadItem2);
                    }
                };
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            m189MediaIconButtonjA1GFJw((mh4) objF3, ox6VarB4, 0, 0L, 0L, bj4VarO, 0, 28);
            bj4VarO.U(true);
            ox6Var4 = ox6Var6;
        } else {
            aVar = ox6.a.t;
            if (i7 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            mediaData = mediaUploadItem2.getMediaData();
            uploadState = mediaUploadItem2.getUploadState();
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
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
            rd7.d(bj4VarO, cVar, fl6VarD);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf3);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            zx8 zx8VarB3 = ay8.b(16.0f);
            y0a y0aVar3 = AndroidCompositionLocals_androidKt.b;
            k85.a aVar5 = new k85.a((Context) bj4VarO.F(y0aVar3));
            aVar5.c = mediaData.getUri();
            aVar5.b();
            aVar5.c(R.drawable.intercom_image_load_failed);
            k85 k85VarA3 = aVar5.a();
            b85 imageLoader3 = IntercomImageLoaderKt.getImageLoader((Context) bj4VarO.F(y0aVar3));
            ox6 ox6Var7 = ox6Var3;
            String fileName3 = mediaData.getFileName();
            kv0Var = kv0.a;
            sp0Var = di.a.e;
            ox6 ox6VarA5 = uma.a(ir9.j(kv0Var.f(aVar, sp0Var), 64.0f), zx8VarB3);
            intercomTheme = IntercomTheme.INSTANCE;
            i4 = IntercomTheme.$stable;
            ox6 ox6VarA6 = ns0.a(gi0.c(ox6VarA5, intercomTheme.getColors(bj4VarO, i4).m760getComposerMediaBackground0d7_KjU(), zx8VarB3), 1.0f, intercomTheme.getColors(bj4VarO, i4).getAlpha().m687getBlack100d7_KjU(), zx8VarB3);
            bj4VarO.K(213144559);
            boolean zJ3 = bj4VarO.j(uploadState);
            if ((i3 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            boolean z13 = zJ3 | z;
            i5 = i3 & 14;
            if (i5 != 4) {
                z2 = true;
            } else {
                z2 = true;
            }
            boolean z14 = z13 | z2;
            if ((i3 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z14 | z3;
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (z4) {
                objF = new mh4() { // from class: eo6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return MediaItemsKt.ImageItem$lambda$15$lambda$8$lambda$7(uploadState, oh4Var2, mediaUploadItem2, mh4Var);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: eo6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return MediaItemsKt.ImageItem$lambda$15$lambda$8$lambda$7(uploadState, oh4Var2, mediaUploadItem2, mh4Var);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            i6 = i3;
            d50.b(k85VarA3, fileName3, imageLoader3, we1.c(ox6VarA6, false, null, (mh4) objF, 15), null, nz1.a.a, null, bj4VarO, 12582912, 8048);
            if (uploadState instanceof MediaUploadItem.UploadState.Uploading) {
                bj4VarO.K(-1981783165);
                ox6 ox6VarC8 = gi0.c(ir9.j(kv0Var.f(aVar, sp0Var), 64.0f), intercomTheme.getColors(bj4VarO, i4).m762getComposerMediaUploadingBackground0d7_KjU(), intercomTheme.getShapes(bj4VarO, i4).d);
                fl6VarD3 = dv0.d(sp0Var, false);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarC8);
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
                rd7.d(bj4VarO, cVar, fl6VarD3);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                m190MediaProgressIndicatorkbKKJSQ(0.0f, 0L, bj4VarO, 0, 3);
                bj4VarO.U(true);
                bj4VarO.U(false);
                c0187a2 = c0187a;
                f = 8.0f;
            } else if (uploadState instanceof MediaUploadItem.UploadState.Error) {
                bj4VarO.K(-1981195808);
                ox6 ox6VarC9 = gi0.c(ir9.j(kv0Var.f(aVar, sp0Var), 64.0f), intercomTheme.getColors(bj4VarO, i4).m762getComposerMediaUploadingBackground0d7_KjU(), intercomTheme.getShapes(bj4VarO, i4).d);
                fl6VarD2 = dv0.d(sp0Var, false);
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
                rd7.d(bj4VarO, cVar, fl6VarD2);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(167180719);
                if (((MediaUploadItem.UploadState.Error) uploadState).getError().getCanRetry()) {
                    m191MediaRetryIconkbKKJSQ(0.0f, 0L, bj4VarO, 0, 3);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                f = 8.0f;
                ox6 ox6VarB5 = zf7.b(8.0f, 8.0f, kv0Var.f(aVar, di.a.i));
                int i10 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_exlamation_mark;
                long jM808getError0d7_KjU3 = intercomTheme.getColors(bj4VarO, i4).getIcon().m808getError0d7_KjU();
                bj4VarO.K(213209312);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new i31(1);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                m189MediaIconButtonjA1GFJw((mh4) objF2, ox6VarB5, i10, jM808getError0d7_KjU3, 0L, bj4VarO, 6, 16);
                bj4VarO.U(false);
                c0187a2 = c0187a;
            } else {
                c0187a2 = c0187a;
                f = 8.0f;
                if (!(uploadState instanceof MediaUploadItem.UploadState.Success)) {
                    bj4VarO.K(213165681);
                    bj4VarO.U(false);
                    defpackage.u.b();
                    return;
                } else {
                    bj4VarO.K(-1980097819);
                    if (mediaData instanceof MediaData.Media.Video) {
                        z5 = false;
                        m65.b(is7.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_play, bj4VarO, 0), null, kv0Var.f(ir9.j(aVar, 24.0f), sp0Var), intercomTheme.getColors(bj4VarO, i4).m763getComposerMediaUploadingForeground0d7_KjU(), bj4VarO, 56, 0);
                        bj4VarO = bj4VarO;
                    } else {
                        z5 = false;
                    }
                    bj4VarO.U(z5);
                }
            }
            ox6 ox6VarB6 = zf7.b(f, -8.0f, kv0Var.f(aVar, di.a.c));
            bj4VarO.K(213243287);
            if ((i6 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (i5 != 4) {
                mediaUploadItem2 = mediaUploadItem;
                if ((i6 & 8) == 0) {
                }
                z7 = z10 | z6;
                objF3 = bj4VarO.f();
                if (z7) {
                    oh4Var3 = oh4Var;
                    objF3 = new mh4() { // from class: fo6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MediaItemsKt.ImageItem$lambda$15$lambda$14$lambda$13(oh4Var3, mediaUploadItem2);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    oh4Var3 = oh4Var;
                    objF3 = new mh4() { // from class: fo6
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return MediaItemsKt.ImageItem$lambda$15$lambda$14$lambda$13(oh4Var3, mediaUploadItem2);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                m189MediaIconButtonjA1GFJw((mh4) objF3, ox6VarB6, 0, 0L, 0L, bj4VarO, 0, 28);
                bj4VarO.U(true);
                ox6Var4 = ox6Var7;
            } else {
                mediaUploadItem2 = mediaUploadItem;
            }
            z7 = z10 | z6;
            objF3 = bj4VarO.f();
            if (z7) {
                oh4Var3 = oh4Var;
                objF3 = new mh4() { // from class: fo6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return MediaItemsKt.ImageItem$lambda$15$lambda$14$lambda$13(oh4Var3, mediaUploadItem2);
                    }
                };
                bj4VarO.C(objF3);
            } else {
                oh4Var3 = oh4Var;
                objF3 = new mh4() { // from class: fo6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return MediaItemsKt.ImageItem$lambda$15$lambda$14$lambda$13(oh4Var3, mediaUploadItem2);
                    }
                };
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            m189MediaIconButtonjA1GFJw((mh4) objF3, ox6VarB6, 0, 0L, 0L, bj4VarO, 0, 28);
            bj4VarO.U(true);
            ox6Var4 = ox6Var7;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: go6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaItemsKt.ImageItem$lambda$16(mediaUploadItem2, mh4Var, oh4Var3, oh4Var2, ox6Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ImageItem$lambda$15$lambda$14$lambda$13(oh4 oh4Var, MediaUploadItem mediaUploadItem) {
        oh4Var.invoke(mediaUploadItem);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ImageItem$lambda$15$lambda$8$lambda$7(MediaUploadItem.UploadState uploadState, oh4 oh4Var, MediaUploadItem mediaUploadItem, mh4 mh4Var) {
        if (uploadState instanceof MediaUploadItem.UploadState.Error) {
            oh4Var.invoke(mediaUploadItem);
        } else if (uploadState instanceof MediaUploadItem.UploadState.Success) {
            mh4Var.invoke();
        } else if (!xj5.a(uploadState, MediaUploadItem.UploadState.Uploading.INSTANCE)) {
            defpackage.u.b();
            return null;
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ImageItem$lambda$16(MediaUploadItem mediaUploadItem, mh4 mh4Var, oh4 oh4Var, oh4 oh4Var2, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        ImageItem(mediaUploadItem, mh4Var, oh4Var, oh4Var2, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void MediaFilesPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(44999646);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MediaItemsKt.INSTANCE.m166getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: qo6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaItemsKt.MediaFilesPreview$lambda$29(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaFilesPreview$lambda$29(int i, jt1 jt1Var, int i2) {
        MediaFilesPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x0141  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: MediaIconButton-jA1GFJw, reason: not valid java name */
    private static final void m189MediaIconButtonjA1GFJw(final mh4<g2b> mh4Var, ox6 ox6Var, int i, long j, long j2, jt1 jt1Var, final int i2, final int i3) {
        mh4<g2b> mh4Var2;
        int i4;
        final ox6 ox6Var2;
        final int i5;
        final long j3;
        final long jM698getWhite1000d7_KjU;
        ox6 ox6Var3;
        int i6;
        long jM688getBlack1000d7_KjU;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(1705420252);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            mh4Var2 = mh4Var;
        } else {
            mh4Var2 = mh4Var;
            if ((i2 & 6) == 0) {
                i4 = (bj4VarO.j(mh4Var2) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                ox6Var2 = ox6Var;
                i4 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0) {
                    i5 = i;
                    int i8 = bj4VarO.h(i5) ? 256 : 128;
                    i4 |= i8;
                } else {
                    i5 = i;
                }
                i4 |= i8;
            } else {
                i5 = i;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    j3 = j;
                    int i9 = bj4VarO.i(j3) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
                    i4 |= i9;
                } else {
                    j3 = j;
                }
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    jM698getWhite1000d7_KjU = j2;
                    int i10 = bj4VarO.i(jM698getWhite1000d7_KjU) ? 16384 : 8192;
                    i4 |= i10;
                } else {
                    jM698getWhite1000d7_KjU = j2;
                }
                i4 |= i10;
            } else {
                jM698getWhite1000d7_KjU = j2;
            }
            if ((i4 & 9363) == 9362 || !bj4VarO.r()) {
                bj4VarO.v0();
                if ((i2 & 1) != 0 || bj4VarO.c0()) {
                    if (i7 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if ((i3 & 4) != 0) {
                        i6 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_x_mark;
                        i4 &= -897;
                    } else {
                        i6 = i5;
                    }
                    if ((i3 & 8) != 0) {
                        jM688getBlack1000d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getAlpha().m688getBlack1000d7_KjU();
                        i4 &= -7169;
                    } else {
                        jM688getBlack1000d7_KjU = j3;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                        jM698getWhite1000d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getAlpha().m698getWhite1000d7_KjU();
                    }
                } else {
                    bj4VarO.u();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    ox6Var3 = ox6Var2;
                    i6 = i5;
                    jM688getBlack1000d7_KjU = j3;
                }
                bj4VarO.V();
                final int i11 = i6;
                final long j4 = jM688getBlack1000d7_KjU;
                final long j5 = jM698getWhite1000d7_KjU;
                h65.b((i4 & 14) | 1572864, 60, bj4VarO, mh4Var2, gr1.b(1466983418, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaItemsKt$MediaIconButton$1
                    public final void invoke(jt1 jt1Var2, int i12) {
                        if ((i12 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarC = gi0.c(ir9.j(aVar, 24.0f), j4, ay8.a);
                        int i13 = i11;
                        long j6 = j5;
                        fl6 fl6VarD = dv0.d(di.a.e, false);
                        int iHashCode = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarC);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar2);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                        m65.b(is7.a(i13, jt1Var2, 0), null, ir9.j(aVar, 12.0f), j6, jt1Var2, 440, 0);
                        jt1Var2.I();
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), null, ir9.j(ox6Var3, 32.0f), null, false);
                j3 = jM688getBlack1000d7_KjU;
                i5 = i6;
                ox6Var2 = ox6Var3;
            } else {
                bj4VarO.u();
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ro6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MediaItemsKt.MediaIconButton_jA1GFJw$lambda$27(mh4Var, ox6Var2, i5, j3, jM698getWhite1000d7_KjU, i2, i3, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i4 |= 48;
        ox6Var2 = ox6Var;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                i5 = i;
                if (bj4VarO.h(i5)) {
                }
                i4 |= i8;
            } else {
                i5 = i;
            }
            i4 |= i8;
        } else {
            i5 = i;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                j3 = j;
                if (bj4VarO.i(j3)) {
                }
                i4 |= i9;
            } else {
                j3 = j;
            }
            i4 |= i9;
        } else {
            j3 = j;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                jM698getWhite1000d7_KjU = j2;
                if (bj4VarO.i(jM698getWhite1000d7_KjU)) {
                }
                i4 |= i10;
            } else {
                jM698getWhite1000d7_KjU = j2;
            }
            i4 |= i10;
        } else {
            jM698getWhite1000d7_KjU = j2;
        }
        if ((i4 & 9363) == 9362) {
            bj4VarO.v0();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i3 & 4) != 0) {
                    i6 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_x_mark;
                    i4 &= -897;
                } else {
                    i6 = i5;
                }
                if ((i3 & 8) != 0) {
                    jM688getBlack1000d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getAlpha().m688getBlack1000d7_KjU();
                    i4 &= -7169;
                } else {
                    jM688getBlack1000d7_KjU = j3;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    jM698getWhite1000d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getAlpha().m698getWhite1000d7_KjU();
                }
            } else {
                if (i7 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i3 & 4) != 0) {
                    i6 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_x_mark;
                    i4 &= -897;
                } else {
                    i6 = i5;
                }
                if ((i3 & 8) != 0) {
                    jM688getBlack1000d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getAlpha().m688getBlack1000d7_KjU();
                    i4 &= -7169;
                } else {
                    jM688getBlack1000d7_KjU = j3;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    jM698getWhite1000d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getAlpha().m698getWhite1000d7_KjU();
                }
            }
            bj4VarO.V();
            final int i12 = i6;
            final long j6 = jM688getBlack1000d7_KjU;
            final long j7 = jM698getWhite1000d7_KjU;
            h65.b((i4 & 14) | 1572864, 60, bj4VarO, mh4Var2, gr1.b(1466983418, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaItemsKt$MediaIconButton$1
                public final void invoke(jt1 jt1Var2, int i13) {
                    if ((i13 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarC = gi0.c(ir9.j(aVar, 24.0f), j6, ay8.a);
                    int i14 = i12;
                    long j8 = j7;
                    fl6 fl6VarD = dv0.d(di.a.e, false);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarC);
                    bt1.c.getClass();
                    qr5.a aVar2 = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar2);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                    m65.b(is7.a(i14, jt1Var2, 0), null, ir9.j(aVar, 12.0f), j8, jt1Var2, 440, 0);
                    jt1Var2.I();
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, ir9.j(ox6Var3, 32.0f), null, false);
            j3 = jM688getBlack1000d7_KjU;
            i5 = i6;
            ox6Var2 = ox6Var3;
        } else {
            bj4VarO.v0();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i3 & 4) != 0) {
                    i6 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_x_mark;
                    i4 &= -897;
                } else {
                    i6 = i5;
                }
                if ((i3 & 8) != 0) {
                    jM688getBlack1000d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getAlpha().m688getBlack1000d7_KjU();
                    i4 &= -7169;
                } else {
                    jM688getBlack1000d7_KjU = j3;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    jM698getWhite1000d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getAlpha().m698getWhite1000d7_KjU();
                }
            } else {
                if (i7 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if ((i3 & 4) != 0) {
                    i6 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_x_mark;
                    i4 &= -897;
                } else {
                    i6 = i5;
                }
                if ((i3 & 8) != 0) {
                    jM688getBlack1000d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getAlpha().m688getBlack1000d7_KjU();
                    i4 &= -7169;
                } else {
                    jM688getBlack1000d7_KjU = j3;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    jM698getWhite1000d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getAlpha().m698getWhite1000d7_KjU();
                }
            }
            bj4VarO.V();
            final int i13 = i6;
            final long j8 = jM688getBlack1000d7_KjU;
            final long j9 = jM698getWhite1000d7_KjU;
            h65.b((i4 & 14) | 1572864, 60, bj4VarO, mh4Var2, gr1.b(1466983418, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaItemsKt$MediaIconButton$1
                public final void invoke(jt1 jt1Var2, int i14) {
                    if ((i14 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarC = gi0.c(ir9.j(aVar, 24.0f), j8, ay8.a);
                    int i15 = i13;
                    long j10 = j9;
                    fl6 fl6VarD = dv0.d(di.a.e, false);
                    int iHashCode = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC2 = it1.c(jt1Var2, ox6VarC);
                    bt1.c.getClass();
                    qr5.a aVar2 = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar2);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, bt1.a.f, fl6VarD);
                    rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(jt1Var2, bt1.a.h);
                    rd7.d(jt1Var2, bt1.a.d, ox6VarC2);
                    m65.b(is7.a(i15, jt1Var2, 0), null, ir9.j(aVar, 12.0f), j10, jt1Var2, 440, 0);
                    jt1Var2.I();
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), null, ir9.j(ox6Var3, 32.0f), null, false);
            j3 = jM688getBlack1000d7_KjU;
            i5 = i6;
            ox6Var2 = ox6Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ro6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaItemsKt.MediaIconButton_jA1GFJw$lambda$27(mh4Var, ox6Var2, i5, j3, jM698getWhite1000d7_KjU, i2, i3, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaIconButton_jA1GFJw$lambda$27(mh4 mh4Var, ox6 ox6Var, int i, long j, long j2, int i2, int i3, jt1 jt1Var, int i4) {
        m189MediaIconButtonjA1GFJw(mh4Var, ox6Var, i, j, j2, jt1Var, gz3.s(i2 | 1), i3);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaItemWithState(MediaUploadItem mediaUploadItem, mh4<g2b> mh4Var, oh4<? super MediaUploadItem, g2b> oh4Var, oh4<? super MediaUploadItem, g2b> oh4Var2, jt1 jt1Var, final int i) {
        int i2;
        MediaUploadItem mediaUploadItem2;
        mh4<g2b> mh4Var2;
        oh4<? super MediaUploadItem, g2b> oh4Var3;
        oh4<? super MediaUploadItem, g2b> oh4Var4;
        bj4 bj4VarO = jt1Var.o(507870855);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bj4VarO.J(mediaUploadItem) : bj4VarO.j(mediaUploadItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.j(oh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            mediaUploadItem2 = mediaUploadItem;
            mh4Var2 = mh4Var;
            oh4Var3 = oh4Var;
            oh4Var4 = oh4Var2;
        } else {
            MediaData.Media mediaData = mediaUploadItem.getMediaData();
            if ((mediaData instanceof MediaData.Media.Image) || (mediaData instanceof MediaData.Media.Video)) {
                mediaUploadItem2 = mediaUploadItem;
                mh4Var2 = mh4Var;
                oh4Var3 = oh4Var;
                oh4Var4 = oh4Var2;
                bj4VarO.K(2079950592);
                ImageItem(mediaUploadItem2, mh4Var2, oh4Var3, oh4Var4, null, bj4VarO, i2 & 8190, 16);
                bj4VarO = bj4VarO;
                bj4VarO.U(false);
            } else if (!(mediaData instanceof MediaData.Media.Other)) {
                bj4VarO.K(2079947709);
                bj4VarO.U(false);
                defpackage.u.b();
                return;
            } else {
                bj4VarO.K(2079957472);
                mediaUploadItem2 = mediaUploadItem;
                mh4Var2 = mh4Var;
                oh4Var3 = oh4Var;
                oh4Var4 = oh4Var2;
                OtherItem(mediaUploadItem2, mh4Var2, oh4Var3, oh4Var4, bj4VarO, i2 & 8190);
                bj4VarO.U(false);
            }
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final MediaUploadItem mediaUploadItem3 = mediaUploadItem2;
            final mh4<g2b> mh4Var3 = mh4Var2;
            final oh4<? super MediaUploadItem, g2b> oh4Var5 = oh4Var3;
            final oh4<? super MediaUploadItem, g2b> oh4Var6 = oh4Var4;
            xj8VarW.d = new ci4() { // from class: lo6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaItemsKt.MediaItemWithState$lambda$6(mediaUploadItem3, mh4Var3, oh4Var5, oh4Var6, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaItemWithState$lambda$6(MediaUploadItem mediaUploadItem, mh4 mh4Var, oh4 oh4Var, oh4 oh4Var2, int i, jt1 jt1Var, int i2) {
        MediaItemWithState(mediaUploadItem, mh4Var, oh4Var, oh4Var2, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x0104  */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Code duplicated, block: B:83:0x0130  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void MediaItems(final List<MediaUploadItem> list, final oh4<? super Integer, g2b> oh4Var, final oh4<? super MediaUploadItem, g2b> oh4Var2, final oh4<? super MediaUploadItem, g2b> oh4Var3, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        ox6 ox6Var3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objF;
        final ox6 ox6Var4;
        bj4 bj4Var;
        xj8 xj8VarW;
        list.getClass();
        oh4Var.getClass();
        oh4Var2.getClass();
        oh4Var3.getClass();
        bj4 bj4VarO = jt1Var.o(235588671);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(oh4Var2) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.j(oh4Var3) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                ox6 ox6VarM = eo7.m(ir9.c(ox6Var3, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                c30.h hVar = new c30.h(8.0f, true, new a30());
                ko7 ko7VarB = eo7.b(2);
                bj4VarO.K(406277787);
                boolean zJ = bj4VarO.j(list);
                if ((i3 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z5 = z | zJ;
                if ((i3 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z6 = z5 | z2;
                if ((i3 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z3 | z6;
                objF = bj4VarO.f();
                if (z4 || objF == jt1.a.a) {
                    objF = new oh4() { // from class: ho6
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return MediaItemsKt.MediaItems$lambda$4$lambda$3(list, oh4Var, oh4Var2, oh4Var3, (bz5) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6Var4 = ox6Var3;
                bj4Var = bj4VarO;
                ys5.b(ox6VarM, null, ko7VarB, hVar, di.a.k, null, false, null, (oh4) objF, bj4Var, 221568, 458);
            } else {
                bj4VarO.u();
                bj4Var = bj4VarO;
                ox6Var4 = ox6Var2;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: io6
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return MediaItemsKt.MediaItems$lambda$5(list, oh4Var, oh4Var2, oh4Var3, ox6Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        ox6Var2 = ox6Var;
        if ((i3 & 9363) == 9362) {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            ox6 ox6VarM2 = eo7.m(ir9.c(ox6Var3, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            c30.h hVar2 = new c30.h(8.0f, true, new a30());
            ko7 ko7VarB2 = eo7.b(2);
            bj4VarO.K(406277787);
            boolean zJ2 = bj4VarO.j(list);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            boolean z7 = z | zJ2;
            if ((i3 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z8 = z7 | z2;
            if ((i3 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z3 | z8;
            objF = bj4VarO.f();
            if (z4) {
                objF = new oh4() { // from class: ho6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return MediaItemsKt.MediaItems$lambda$4$lambda$3(list, oh4Var, oh4Var2, oh4Var3, (bz5) obj);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new oh4() { // from class: ho6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return MediaItemsKt.MediaItems$lambda$4$lambda$3(list, oh4Var, oh4Var2, oh4Var3, (bz5) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6Var4 = ox6Var3;
            bj4Var = bj4VarO;
            ys5.b(ox6VarM2, null, ko7VarB2, hVar2, di.a.k, null, false, null, (oh4) objF, bj4Var, 221568, 458);
        } else {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            ox6 ox6VarM3 = eo7.m(ir9.c(ox6Var3, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            c30.h hVar3 = new c30.h(8.0f, true, new a30());
            ko7 ko7VarB3 = eo7.b(2);
            bj4VarO.K(406277787);
            boolean zJ3 = bj4VarO.j(list);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            boolean z9 = z | zJ3;
            if ((i3 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z10 = z9 | z2;
            if ((i3 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z3 | z10;
            objF = bj4VarO.f();
            if (z4) {
                objF = new oh4() { // from class: ho6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return MediaItemsKt.MediaItems$lambda$4$lambda$3(list, oh4Var, oh4Var2, oh4Var3, (bz5) obj);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new oh4() { // from class: ho6
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return MediaItemsKt.MediaItems$lambda$4$lambda$3(list, oh4Var, oh4Var2, oh4Var3, (bz5) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6Var4 = ox6Var3;
            bj4Var = bj4VarO;
            ys5.b(ox6VarM3, null, ko7VarB3, hVar3, di.a.k, null, false, null, (oh4) objF, bj4Var, 221568, 458);
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: io6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaItemsKt.MediaItems$lambda$5(list, oh4Var, oh4Var2, oh4Var3, ox6Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaItems$lambda$4$lambda$3(final List list, final oh4 oh4Var, final oh4 oh4Var2, final oh4 oh4Var3, bz5 bz5Var) {
        bz5Var.getClass();
        final do6 do6Var = new do6();
        bz5Var.a(list.size(), new oh4<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaItemsKt$MediaItems$lambda$4$lambda$3$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return do6Var.invoke(Integer.valueOf(i), list.get(i));
            }

            @Override // defpackage.oh4
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, new oh4<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaItemsKt$MediaItems$lambda$4$lambda$3$$inlined$itemsIndexed$default$2
            @Override // defpackage.oh4
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, new fr1(true, 2039820996, new fi4<fv5, Integer, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaItemsKt$MediaItems$lambda$4$lambda$3$$inlined$itemsIndexed$default$3
            public final void invoke(fv5 fv5Var, final int i, jt1 jt1Var, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (jt1Var.J(fv5Var) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= jt1Var.h(i) ? 32 : 16;
                }
                if (!jt1Var.A(i3 & 1, (i3 & 147) != 146)) {
                    jt1Var.u();
                    return;
                }
                MediaUploadItem mediaUploadItem = (MediaUploadItem) list.get(i);
                jt1Var.K(-1437731301);
                jt1Var.K(1200550442);
                boolean zJ = jt1Var.J(oh4Var) | ((((i3 & 112) ^ 48) > 32 && jt1Var.h(i)) || (i3 & 48) == 32);
                Object objF = jt1Var.f();
                if (zJ || objF == jt1.a.a) {
                    final oh4 oh4Var4 = oh4Var;
                    objF = new mh4<g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaItemsKt$MediaItems$1$1$2$1$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            oh4Var4.invoke(Integer.valueOf(i));
                        }

                        @Override // defpackage.mh4
                        public /* bridge */ /* synthetic */ g2b invoke() {
                            invoke2();
                            return g2b.a;
                        }
                    };
                    jt1Var.C(objF);
                }
                jt1Var.B();
                MediaItemsKt.MediaItemWithState(mediaUploadItem, (mh4) objF, oh4Var2, oh4Var3, jt1Var, 0);
                jt1Var.B();
            }

            @Override // defpackage.fi4
            public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, Integer num, jt1 jt1Var, Integer num2) {
                invoke(fv5Var, num.intValue(), jt1Var, num2.intValue());
                return g2b.a;
            }
        }));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object MediaItems$lambda$4$lambda$3$lambda$0(int i, MediaUploadItem mediaUploadItem) {
        mediaUploadItem.getClass();
        return mediaUploadItem.getInstanceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaItems$lambda$5(List list, oh4 oh4Var, oh4 oh4Var2, oh4 oh4Var3, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        MediaItems(list, oh4Var, oh4Var2, oh4Var3, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void MediaItemsPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1307364875);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MediaItemsKt.INSTANCE.m165getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new uw(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaItemsPreview$lambda$28(int i, jt1 jt1Var, int i2) {
        MediaItemsPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MediaProgressIndicator-kbKKJSQ, reason: not valid java name */
    public static final void m190MediaProgressIndicatorkbKKJSQ(float f, long j, jt1 jt1Var, final int i, final int i2) {
        float f2;
        int i3;
        long jM763getComposerMediaUploadingForeground0d7_KjU;
        float f3;
        final float f4;
        final long j2;
        bj4 bj4VarO = jt1Var.o(587300576);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f2 = f;
        } else if ((i & 6) == 0) {
            f2 = f;
            i3 = i | (bj4VarO.g(f2) ? 4 : 2);
        } else {
            f2 = f;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                jM763getComposerMediaUploadingForeground0d7_KjU = j;
                int i5 = bj4VarO.i(jM763getComposerMediaUploadingForeground0d7_KjU) ? 32 : 16;
                i3 |= i5;
            } else {
                jM763getComposerMediaUploadingForeground0d7_KjU = j;
            }
            i3 |= i5;
        } else {
            jM763getComposerMediaUploadingForeground0d7_KjU = j;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
            f4 = f2;
            j2 = jM763getComposerMediaUploadingForeground0d7_KjU;
        } else {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                f3 = i4 != 0 ? 24.0f : f2;
                if ((i2 & 2) != 0) {
                    jM763getComposerMediaUploadingForeground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m763getComposerMediaUploadingForeground0d7_KjU();
                    i3 &= -113;
                }
            } else {
                bj4VarO.u();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                f3 = f2;
            }
            int i6 = i3;
            long j3 = jM763getComposerMediaUploadingForeground0d7_KjU;
            bj4VarO.V();
            ae8.a(ir9.j(ox6.a.t, f3), j3, 2.0f, 0L, 0, 0.0f, bj4VarO, (i6 & 112) | 384, 56);
            f4 = f3;
            j2 = j3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ko6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaItemsKt.MediaProgressIndicator_kbKKJSQ$lambda$25(f4, j2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaProgressIndicator_kbKKJSQ$lambda$25(float f, long j, int i, int i2, jt1 jt1Var, int i3) {
        m190MediaProgressIndicatorkbKKJSQ(f, j, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MediaRetryIcon-kbKKJSQ, reason: not valid java name */
    public static final void m191MediaRetryIconkbKKJSQ(float f, long j, jt1 jt1Var, final int i, final int i2) {
        int i3;
        long jM763getComposerMediaUploadingForeground0d7_KjU;
        final long j2;
        bj4 bj4VarO = jt1Var.o(628002367);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (bj4VarO.g(f) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && bj4VarO.i(j)) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
            j2 = j;
        } else {
            bj4VarO.v0();
            if ((i & 1) == 0 || bj4VarO.c0()) {
                if (i4 != 0) {
                    f = 24.0f;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    jM763getComposerMediaUploadingForeground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m763getComposerMediaUploadingForeground0d7_KjU();
                }
                bj4VarO.V();
                m65.b(is7.a(R.drawable.intercom_ic_reload, bj4VarO, 0), nr1.f(bj4VarO, R.string.intercom_retry), ir9.j(ox6.a.t, f), jM763getComposerMediaUploadingForeground0d7_KjU, bj4VarO, 8 | ((i3 << 6) & 7168), 0);
                j2 = jM763getComposerMediaUploadingForeground0d7_KjU;
            } else {
                bj4VarO.u();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            jM763getComposerMediaUploadingForeground0d7_KjU = j;
            bj4VarO.V();
            m65.b(is7.a(R.drawable.intercom_ic_reload, bj4VarO, 0), nr1.f(bj4VarO, R.string.intercom_retry), ir9.j(ox6.a.t, f), jM763getComposerMediaUploadingForeground0d7_KjU, bj4VarO, 8 | ((i3 << 6) & 7168), 0);
            j2 = jM763getComposerMediaUploadingForeground0d7_KjU;
        }
        final float f2 = f;
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: jo6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaItemsKt.MediaRetryIcon_kbKKJSQ$lambda$26(f2, j2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b MediaRetryIcon_kbKKJSQ$lambda$26(float f, long j, int i, int i2, jt1 jt1Var, int i3) {
        m191MediaRetryIconkbKKJSQ(f, j, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OtherItem(final MediaUploadItem mediaUploadItem, final mh4<g2b> mh4Var, final oh4<? super MediaUploadItem, g2b> oh4Var, final oh4<? super MediaUploadItem, g2b> oh4Var2, jt1 jt1Var, final int i) {
        int i2;
        jt1.a.C0187a c0187a;
        ox6.a aVar;
        boolean z;
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(-1588325420);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bj4VarO.J(mediaUploadItem) : bj4VarO.j(mediaUploadItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.j(oh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var = bj4VarO;
        } else {
            MediaData.Media mediaData = mediaUploadItem.getMediaData();
            mediaData.getClass();
            MediaData.Media.Other other = (MediaData.Media.Other) mediaData;
            final MediaUploadItem.UploadState uploadState = mediaUploadItem.getUploadState();
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6.a aVar2 = ox6.a.t;
            ox6 ox6VarC = it1.c(bj4VarO, aVar2);
            bt1.c.getClass();
            qr5.a aVar3 = bt1.a.b;
            ei4<FileStyle, jt1, Integer, g2b> ei4VarM164getLambda2$intercom_sdk_base_release = null;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ox6 ox6VarN = ir9.n(aVar2, 200.0f);
            zx8 zx8VarB = ay8.b(16.0f);
            if (uploadState instanceof MediaUploadItem.UploadState.Uploading) {
                ei4VarM164getLambda2$intercom_sdk_base_release = ComposableSingletons$MediaItemsKt.INSTANCE.m163getLambda1$intercom_sdk_base_release();
            } else if ((uploadState instanceof MediaUploadItem.UploadState.Error) && ((MediaUploadItem.UploadState.Error) uploadState).getError().getCanRetry()) {
                ei4VarM164getLambda2$intercom_sdk_base_release = ComposableSingletons$MediaItemsKt.INSTANCE.m164getLambda2$intercom_sdk_base_release();
            }
            ei4<FileStyle, jt1, Integer, g2b> ei4Var = ei4VarM164getLambda2$intercom_sdk_base_release;
            bj4VarO.K(1914293876);
            int i3 = i2 & 14;
            boolean zJ = ((i2 & 112) == 32) | bj4VarO.j(uploadState) | ((i2 & 7168) == 2048) | (i3 == 4 || ((i2 & 8) != 0 && bj4VarO.j(mediaUploadItem)));
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a2 = jt1.a.a;
            if (zJ || objF == c0187a2) {
                objF = new mh4() { // from class: mo6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return MediaItemsKt.OtherItem$lambda$23$lambda$18$lambda$17(uploadState, oh4Var2, mediaUploadItem, mh4Var);
                    }
                };
                bj4VarO.C(objF);
            }
            mh4 mh4Var2 = (mh4) objF;
            bj4VarO.U(false);
            bj4 bj4Var2 = bj4VarO;
            FileRowKt.FileRow(other, zx8VarB, ox6VarN, mh4Var2, ei4Var, bj4Var2, 384, 0);
            bj4Var2.K(1914337686);
            boolean z2 = uploadState instanceof MediaUploadItem.UploadState.Error;
            kv0 kv0Var = kv0.a;
            if (z2) {
                ox6 ox6VarB = zf7.b(8.0f, 8.0f, kv0Var.f(aVar2, di.a.i));
                int i4 = io.intercom.android.sdk.ui.R.drawable.intercom_ic_exlamation_mark;
                long jM808getError0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4Var2, IntercomTheme.$stable).getIcon().m808getError0d7_KjU();
                bj4Var2.K(1914346137);
                Object objF2 = bj4Var2.f();
                if (objF2 == c0187a2) {
                    objF2 = new no6();
                    bj4Var2.C(objF2);
                }
                bj4Var2.U(false);
                c0187a = c0187a2;
                aVar = aVar2;
                z = false;
                m189MediaIconButtonjA1GFJw((mh4) objF2, ox6VarB, i4, jM808getError0d7_KjU, 0L, bj4Var2, 6, 16);
                bj4Var2 = bj4Var2;
            } else {
                c0187a = c0187a2;
                aVar = aVar2;
                z = false;
            }
            bj4Var2.U(z);
            ox6 ox6VarB2 = zf7.b(8.0f, -8.0f, kv0Var.f(aVar, di.a.c));
            bj4Var2.K(1914364204);
            boolean z3 = (i3 == 4 || ((i2 & 8) != 0 && bj4Var2.j(mediaUploadItem))) | ((i2 & 896) == 256);
            Object objF3 = bj4Var2.f();
            if (z3 || objF3 == c0187a) {
                objF3 = new mh4() { // from class: oo6
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return MediaItemsKt.OtherItem$lambda$23$lambda$22$lambda$21(oh4Var, mediaUploadItem);
                    }
                };
                bj4Var2.C(objF3);
            }
            bj4Var2.U(false);
            bj4 bj4Var3 = bj4Var2;
            m189MediaIconButtonjA1GFJw((mh4) objF3, ox6VarB2, 0, 0L, 0L, bj4Var3, 0, 28);
            bj4Var = bj4Var3;
            bj4Var.U(true);
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: po6
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MediaItemsKt.OtherItem$lambda$24(mediaUploadItem, mh4Var, oh4Var, oh4Var2, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b OtherItem$lambda$23$lambda$18$lambda$17(MediaUploadItem.UploadState uploadState, oh4 oh4Var, MediaUploadItem mediaUploadItem, mh4 mh4Var) {
        if (uploadState instanceof MediaUploadItem.UploadState.Error) {
            oh4Var.invoke(mediaUploadItem);
        } else if (uploadState instanceof MediaUploadItem.UploadState.Success) {
            mh4Var.invoke();
        } else if (!xj5.a(uploadState, MediaUploadItem.UploadState.Uploading.INSTANCE)) {
            defpackage.u.b();
            return null;
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b OtherItem$lambda$23$lambda$22$lambda$21(oh4 oh4Var, MediaUploadItem mediaUploadItem) {
        oh4Var.invoke(mediaUploadItem);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b OtherItem$lambda$24(MediaUploadItem mediaUploadItem, mh4 mh4Var, oh4 oh4Var, oh4 oh4Var2, int i, jt1 jt1Var, int i2) {
        OtherItem(mediaUploadItem, mh4Var, oh4Var, oh4Var2, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
