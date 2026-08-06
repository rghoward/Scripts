package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a30;
import defpackage.aj1;
import defpackage.ay8;
import defpackage.b85;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.d50;
import defpackage.di;
import defpackage.dv0;
import defpackage.e72;
import defpackage.e96;
import defpackage.ed1;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.hf3;
import defpackage.i12;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.k85;
import defpackage.kp4;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.l02;
import defpackage.lp4;
import defpackage.ly8;
import defpackage.m12;
import defpackage.m40;
import defpackage.m65;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.n12;
import defpackage.np4;
import defpackage.nr1;
import defpackage.ns0;
import defpackage.ny8;
import defpackage.nz1;
import defpackage.oh4;
import defpackage.op4;
import defpackage.ox6;
import defpackage.pp4;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.u;
import defpackage.uma;
import defpackage.w30;
import defpackage.we1;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.y0a;
import defpackage.yi1;
import defpackage.z2a;
import defpackage.z43;
import defpackage.zf7;
import defpackage.zx8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.GroupedMediaKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class GroupedMediaKt {
    /* JADX WARN: Code duplicated, block: B:100:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:104:0x01de  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:109:0x0206  */
    /* JADX WARN: Code duplicated, block: B:110:0x0209  */
    /* JADX WARN: Code duplicated, block: B:112:0x0235  */
    /* JADX WARN: Code duplicated, block: B:114:0x0240  */
    /* JADX WARN: Code duplicated, block: B:116:0x0273  */
    /* JADX WARN: Code duplicated, block: B:118:0x027a  */
    /* JADX WARN: Code duplicated, block: B:119:0x027e  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:135:0x02d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:139:0x02dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:148:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:149:0x0301  */
    /* JADX WARN: Code duplicated, block: B:162:0x038f  */
    /* JADX WARN: Code duplicated, block: B:164:0x039b  */
    /* JADX WARN: Code duplicated, block: B:166:0x039f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0373 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:82:0x013c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x0149  */
    /* JADX WARN: Code duplicated, block: B:88:0x0199  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d1  */
    public static final void GroupedMedia(final List<MediaItem> list, final zx8 zx8Var, ox6 ox6Var, oh4<? super String, g2b> oh4Var, oh4<? super String, g2b> oh4Var2, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        int i4;
        oh4<? super String, g2b> oh4Var3;
        int i5;
        int i6;
        oh4<? super String, g2b> oh4Var4;
        int i7;
        ox6.a aVar;
        ox6 ox6Var3;
        jt1.a.C0187a c0187a;
        oh4<? super String, g2b> oh4Var5;
        int i8;
        oh4<? super String, g2b> oh4Var6;
        long jM687getBlack100d7_KjU;
        long jM760getComposerMediaBackground0d7_KjU;
        List<RowLayout> listCalculateMediaLayout;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        oh4<? super String, g2b> oh4Var7;
        bt1.a.d dVar;
        long j;
        long j2;
        int i9;
        aj1 aj1VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        int i10;
        int i11;
        bj4 bj4Var;
        final ox6 ox6Var4;
        final oh4<? super String, g2b> oh4Var8;
        final oh4<? super String, g2b> oh4Var9;
        int i12;
        RowLayout rowLayout;
        boolean z;
        boolean z2;
        bj4 bj4Var2;
        boolean z3;
        long j3;
        ny8 ny8VarA;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        boolean z4;
        qr5.a aVar3;
        RowLayout.Grid grid;
        int columns;
        int i13;
        long j4;
        int i14;
        MediaItem mediaItem;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        oh4<? super String, g2b> oh4Var10;
        MediaItem mediaItem2;
        oh4<? super String, g2b> oh4Var11;
        Object objF;
        Object objF2;
        xj8 xj8VarW;
        list.getClass();
        zx8Var.getClass();
        bj4 bj4VarO = jt1Var.o(2071572915);
        j1b j1bVar = bj4VarO.a;
        int i15 = 2;
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
            i3 |= bj4VarO.J(zx8Var) ? 32 : 16;
        }
        int i16 = i2 & 4;
        if (i16 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    oh4Var3 = oh4Var;
                    if (bj4VarO.j(oh4Var3)) {
                        i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        oh4Var4 = oh4Var2;
                        if (bj4VarO.j(oh4Var4)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                        aVar = ox6.a.t;
                        if (i16 != 0) {
                            ox6Var3 = aVar;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(-79072205);
                            objF2 = bj4VarO.f();
                            if (objF2 == c0187a) {
                                objF2 = new m12(i15);
                                bj4VarO.C(objF2);
                            }
                            oh4Var5 = (oh4) objF2;
                            bj4VarO.U(false);
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        i8 = 1;
                        if (i6 != 0) {
                            bj4VarO.K(-79070893);
                            objF = bj4VarO.f();
                            if (objF == c0187a) {
                                objF = new n12(i8);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i17 = IntercomTheme.$stable;
                        jM687getBlack100d7_KjU = intercomTheme.getColors(bj4VarO, i17).getAlpha().m687getBlack100d7_KjU();
                        jM760getComposerMediaBackground0d7_KjU = intercomTheme.getColors(bj4VarO, i17).m760getComposerMediaBackground0d7_KjU();
                        listCalculateMediaLayout = calculateMediaLayout(list.size());
                        ox6 ox6VarR = ir9.r(ox6Var3);
                        fl6VarD = dv0.d(di.a.c, false);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarR);
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
                        oh4Var7 = oh4Var5;
                        dVar = bt1.a.d;
                        rd7.d(bj4VarO, dVar, ox6VarC);
                        ox6 ox6VarA = uma.a(aVar, zx8Var);
                        j = jM760getComposerMediaBackground0d7_KjU;
                        j2 = jM687getBlack100d7_KjU;
                        i9 = 6;
                        aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
                        iHashCode2 = Long.hashCode(bj4VarO.T);
                        kw7VarP2 = bj4VarO.P();
                        ox6VarC2 = it1.c(bj4VarO, ox6VarA);
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
                        rd7.d(bj4VarO, cVar, aj1VarA);
                        rd7.d(bj4VarO, eVar, kw7VarP2);
                        l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC2);
                        bj4VarO.K(263351186);
                        i10 = 0;
                        i11 = 0;
                        for (Object obj : listCalculateMediaLayout) {
                            i12 = i10 + 1;
                            if (i10 < 0) {
                                ws0.m();
                                throw null;
                            }
                            rowLayout = (RowLayout) obj;
                            if (i10 == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i10 == listCalculateMediaLayout.size() - 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (rowLayout instanceof RowLayout.SingleFullWidth) {
                                bj4VarO.K(1374402462);
                                mediaItem2 = list.get(i11);
                                zx8 mediaShapeForPosition = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                                Block block = mediaItem2.getBlock();
                                boolean zIsVideo = mediaItem2.isVideo();
                                if (mediaItem2.isVideo()) {
                                    oh4Var11 = oh4Var6;
                                } else {
                                    oh4Var11 = oh4Var7;
                                }
                                j3 = j2;
                                j4 = j;
                                bj4 bj4Var3 = bj4VarO;
                                m284SingleMediaItemSnr_uVM(block, zIsVideo, mediaShapeForPosition, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var3, 12779520, 0);
                                bj4Var2 = bj4Var3;
                                i11++;
                                bj4Var2.U(false);
                                i14 = 6;
                            } else {
                                bj4Var2 = bj4VarO;
                                z3 = z2;
                                j3 = j2;
                                if (!(rowLayout instanceof RowLayout.Grid)) {
                                    bj4Var2.K(875619194);
                                    bj4Var2.U(false);
                                    u.b();
                                    return;
                                }
                                bj4Var2.K(1375596737);
                                ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                                iHashCode3 = Long.hashCode(bj4Var2.T);
                                kw7VarP3 = bj4Var2.P();
                                ox6VarC3 = it1.c(bj4Var2, aVar);
                                bt1.c.getClass();
                                z4 = true;
                                aVar3 = bt1.a.b;
                                if (j1bVar == null) {
                                    ml5.c();
                                    throw null;
                                }
                                bj4Var2.q();
                                if (bj4Var2.S) {
                                    bj4Var2.k(aVar3);
                                } else {
                                    bj4Var2.z();
                                }
                                rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                                rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                                rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                                rd7.c(bj4Var2, bt1.a.h);
                                rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                                bj4Var2.K(-1976324612);
                                grid = (RowLayout.Grid) rowLayout;
                                columns = grid.getColumns();
                                i13 = 0;
                                while (i13 < columns) {
                                    mediaItem = list.get(i11);
                                    if (i13 == 0) {
                                        z5 = z4;
                                    } else {
                                        z5 = false;
                                    }
                                    if (i13 == grid.getColumns() - 1) {
                                        z6 = z4;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z || !z5) {
                                        z7 = false;
                                    } else {
                                        z7 = z4;
                                    }
                                    if (z || !z6) {
                                        z8 = false;
                                    } else {
                                        z8 = z4;
                                    }
                                    if (z3 || !z5) {
                                        z9 = false;
                                    } else {
                                        z9 = z4;
                                    }
                                    if (z3 || !z6) {
                                        z10 = false;
                                    } else {
                                        z10 = z4;
                                    }
                                    zx8 mediaShapeForPosition2 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                                    int i18 = i13;
                                    Block block2 = mediaItem.getBlock();
                                    boolean z11 = z;
                                    boolean zIsVideo2 = mediaItem.isVideo();
                                    if (mediaItem.isVideo()) {
                                        oh4Var10 = oh4Var6;
                                    } else {
                                        oh4Var10 = oh4Var7;
                                    }
                                    boolean z12 = z4;
                                    long j5 = j;
                                    bj4 bj4Var4 = bj4Var2;
                                    m284SingleMediaItemSnr_uVM(block2, zIsVideo2, mediaShapeForPosition2, j5, j3, 1.0f, oh4Var10, m40.a(new qs5(z12, 1.0f)), bj4Var4, 196608, 0);
                                    bj4Var2 = bj4Var4;
                                    i11++;
                                    i13 = i18 + 1;
                                    z = z11;
                                    z4 = z12;
                                    j = j5;
                                    grid = grid;
                                }
                                j4 = j;
                                i14 = 6;
                                bj4Var2.U(false);
                                bj4Var2.U(z4);
                                bj4Var2.U(false);
                                g2b g2bVar = g2b.a;
                            }
                            bj4VarO = bj4Var2;
                            j = j4;
                            j2 = j3;
                            i10 = i12;
                            i9 = i14;
                        }
                        bj4Var = bj4VarO;
                        bj4Var.U(false);
                        bj4Var.U(true);
                        bj4Var.U(true);
                        ox6Var4 = ox6Var3;
                        oh4Var8 = oh4Var6;
                        oh4Var9 = oh4Var7;
                    } else {
                        bj4VarO.u();
                        bj4Var = bj4VarO;
                        ox6Var4 = ox6Var2;
                        oh4Var9 = oh4Var3;
                        oh4Var8 = oh4Var4;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: ip4
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj2, Object obj3) {
                                int iIntValue = ((Integer) obj3).intValue();
                                return GroupedMediaKt.GroupedMedia$lambda$9(list, zx8Var, ox6Var4, oh4Var9, oh4Var8, i, i2, (jt1) obj2, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                oh4Var4 = oh4Var2;
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-79072205);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new m12(i15);
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    i8 = 1;
                    if (i6 != 0) {
                        bj4VarO.K(-79070893);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new n12(i8);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                    int i19 = IntercomTheme.$stable;
                    jM687getBlack100d7_KjU = intercomTheme2.getColors(bj4VarO, i19).getAlpha().m687getBlack100d7_KjU();
                    jM760getComposerMediaBackground0d7_KjU = intercomTheme2.getColors(bj4VarO, i19).m760getComposerMediaBackground0d7_KjU();
                    listCalculateMediaLayout = calculateMediaLayout(list.size());
                    ox6 ox6VarR2 = ir9.r(ox6Var3);
                    fl6VarD = dv0.d(di.a.c, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarR2);
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
                    oh4Var7 = oh4Var5;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    ox6 ox6VarA2 = uma.a(aVar, zx8Var);
                    j = jM760getComposerMediaBackground0d7_KjU;
                    j2 = jM687getBlack100d7_KjU;
                    i9 = 6;
                    aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarA2);
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
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(263351186);
                    i10 = 0;
                    i11 = 0;
                    while (r3.hasNext()) {
                        i12 = i10 + 1;
                        if (i10 < 0) {
                            ws0.m();
                            throw null;
                        }
                        rowLayout = (RowLayout) obj;
                        if (i10 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i10 == listCalculateMediaLayout.size() - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (rowLayout instanceof RowLayout.SingleFullWidth) {
                            bj4VarO.K(1374402462);
                            mediaItem2 = list.get(i11);
                            zx8 mediaShapeForPosition3 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                            Block block3 = mediaItem2.getBlock();
                            boolean zIsVideo3 = mediaItem2.isVideo();
                            if (mediaItem2.isVideo()) {
                                oh4Var11 = oh4Var6;
                            } else {
                                oh4Var11 = oh4Var7;
                            }
                            j3 = j2;
                            j4 = j;
                            bj4 bj4Var5 = bj4VarO;
                            m284SingleMediaItemSnr_uVM(block3, zIsVideo3, mediaShapeForPosition3, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var5, 12779520, 0);
                            bj4Var2 = bj4Var5;
                            i11++;
                            bj4Var2.U(false);
                            i14 = 6;
                        } else {
                            bj4Var2 = bj4VarO;
                            z3 = z2;
                            j3 = j2;
                            if (!(rowLayout instanceof RowLayout.Grid)) {
                                bj4Var2.K(875619194);
                                bj4Var2.U(false);
                                u.b();
                                return;
                            }
                            bj4Var2.K(1375596737);
                            ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                            iHashCode3 = Long.hashCode(bj4Var2.T);
                            kw7VarP3 = bj4Var2.P();
                            ox6VarC3 = it1.c(bj4Var2, aVar);
                            bt1.c.getClass();
                            z4 = true;
                            aVar3 = bt1.a.b;
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var2.q();
                            if (bj4Var2.S) {
                                bj4Var2.k(aVar3);
                            } else {
                                bj4Var2.z();
                            }
                            rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                            rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                            rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                            rd7.c(bj4Var2, bt1.a.h);
                            rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                            bj4Var2.K(-1976324612);
                            grid = (RowLayout.Grid) rowLayout;
                            columns = grid.getColumns();
                            i13 = 0;
                            while (i13 < columns) {
                                mediaItem = list.get(i11);
                                if (i13 == 0) {
                                    z5 = z4;
                                } else {
                                    z5 = false;
                                }
                                if (i13 == grid.getColumns() - 1) {
                                    z6 = z4;
                                } else {
                                    z6 = false;
                                }
                                if (z) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                if (z) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (z3) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (z3) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                zx8 mediaShapeForPosition4 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                                int i110 = i13;
                                Block block4 = mediaItem.getBlock();
                                boolean z13 = z;
                                boolean zIsVideo4 = mediaItem.isVideo();
                                if (mediaItem.isVideo()) {
                                    oh4Var10 = oh4Var6;
                                } else {
                                    oh4Var10 = oh4Var7;
                                }
                                boolean z14 = z4;
                                long j6 = j;
                                bj4 bj4Var6 = bj4Var2;
                                m284SingleMediaItemSnr_uVM(block4, zIsVideo4, mediaShapeForPosition4, j6, j3, 1.0f, oh4Var10, m40.a(new qs5(z14, 1.0f)), bj4Var6, 196608, 0);
                                bj4Var2 = bj4Var6;
                                i11++;
                                i13 = i110 + 1;
                                z = z13;
                                z4 = z14;
                                j = j6;
                                grid = grid;
                            }
                            j4 = j;
                            i14 = 6;
                            bj4Var2.U(false);
                            bj4Var2.U(z4);
                            bj4Var2.U(false);
                            g2b g2bVar2 = g2b.a;
                        }
                        bj4VarO = bj4Var2;
                        j = j4;
                        j2 = j3;
                        i10 = i12;
                        i9 = i14;
                    }
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ox6Var4 = ox6Var3;
                    oh4Var8 = oh4Var6;
                    oh4Var9 = oh4Var7;
                } else {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-79072205);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new m12(i15);
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    i8 = 1;
                    if (i6 != 0) {
                        bj4VarO.K(-79070893);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new n12(i8);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                    int i111 = IntercomTheme.$stable;
                    jM687getBlack100d7_KjU = intercomTheme3.getColors(bj4VarO, i111).getAlpha().m687getBlack100d7_KjU();
                    jM760getComposerMediaBackground0d7_KjU = intercomTheme3.getColors(bj4VarO, i111).m760getComposerMediaBackground0d7_KjU();
                    listCalculateMediaLayout = calculateMediaLayout(list.size());
                    ox6 ox6VarR3 = ir9.r(ox6Var3);
                    fl6VarD = dv0.d(di.a.c, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarR3);
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
                    oh4Var7 = oh4Var5;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    ox6 ox6VarA3 = uma.a(aVar, zx8Var);
                    j = jM760getComposerMediaBackground0d7_KjU;
                    j2 = jM687getBlack100d7_KjU;
                    i9 = 6;
                    aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarA3);
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
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(263351186);
                    i10 = 0;
                    i11 = 0;
                    while (r3.hasNext()) {
                        i12 = i10 + 1;
                        if (i10 < 0) {
                            ws0.m();
                            throw null;
                        }
                        rowLayout = (RowLayout) obj;
                        if (i10 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i10 == listCalculateMediaLayout.size() - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (rowLayout instanceof RowLayout.SingleFullWidth) {
                            bj4VarO.K(1374402462);
                            mediaItem2 = list.get(i11);
                            zx8 mediaShapeForPosition5 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                            Block block5 = mediaItem2.getBlock();
                            boolean zIsVideo5 = mediaItem2.isVideo();
                            if (mediaItem2.isVideo()) {
                                oh4Var11 = oh4Var6;
                            } else {
                                oh4Var11 = oh4Var7;
                            }
                            j3 = j2;
                            j4 = j;
                            bj4 bj4Var7 = bj4VarO;
                            m284SingleMediaItemSnr_uVM(block5, zIsVideo5, mediaShapeForPosition5, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var7, 12779520, 0);
                            bj4Var2 = bj4Var7;
                            i11++;
                            bj4Var2.U(false);
                            i14 = 6;
                        } else {
                            bj4Var2 = bj4VarO;
                            z3 = z2;
                            j3 = j2;
                            if (!(rowLayout instanceof RowLayout.Grid)) {
                                bj4Var2.K(875619194);
                                bj4Var2.U(false);
                                u.b();
                                return;
                            }
                            bj4Var2.K(1375596737);
                            ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                            iHashCode3 = Long.hashCode(bj4Var2.T);
                            kw7VarP3 = bj4Var2.P();
                            ox6VarC3 = it1.c(bj4Var2, aVar);
                            bt1.c.getClass();
                            z4 = true;
                            aVar3 = bt1.a.b;
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var2.q();
                            if (bj4Var2.S) {
                                bj4Var2.k(aVar3);
                            } else {
                                bj4Var2.z();
                            }
                            rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                            rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                            rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                            rd7.c(bj4Var2, bt1.a.h);
                            rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                            bj4Var2.K(-1976324612);
                            grid = (RowLayout.Grid) rowLayout;
                            columns = grid.getColumns();
                            i13 = 0;
                            while (i13 < columns) {
                                mediaItem = list.get(i11);
                                if (i13 == 0) {
                                    z5 = z4;
                                } else {
                                    z5 = false;
                                }
                                if (i13 == grid.getColumns() - 1) {
                                    z6 = z4;
                                } else {
                                    z6 = false;
                                }
                                if (z) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                if (z) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (z3) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (z3) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                zx8 mediaShapeForPosition6 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                                int i112 = i13;
                                Block block6 = mediaItem.getBlock();
                                boolean z15 = z;
                                boolean zIsVideo6 = mediaItem.isVideo();
                                if (mediaItem.isVideo()) {
                                    oh4Var10 = oh4Var6;
                                } else {
                                    oh4Var10 = oh4Var7;
                                }
                                boolean z16 = z4;
                                long j7 = j;
                                bj4 bj4Var8 = bj4Var2;
                                m284SingleMediaItemSnr_uVM(block6, zIsVideo6, mediaShapeForPosition6, j7, j3, 1.0f, oh4Var10, m40.a(new qs5(z16, 1.0f)), bj4Var8, 196608, 0);
                                bj4Var2 = bj4Var8;
                                i11++;
                                i13 = i112 + 1;
                                z = z15;
                                z4 = z16;
                                j = j7;
                                grid = grid;
                            }
                            j4 = j;
                            i14 = 6;
                            bj4Var2.U(false);
                            bj4Var2.U(z4);
                            bj4Var2.U(false);
                            g2b g2bVar3 = g2b.a;
                        }
                        bj4VarO = bj4Var2;
                        j = j4;
                        j2 = j3;
                        i10 = i12;
                        i9 = i14;
                    }
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ox6Var4 = ox6Var3;
                    oh4Var8 = oh4Var6;
                    oh4Var9 = oh4Var7;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ip4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return GroupedMediaKt.GroupedMedia$lambda$9(list, zx8Var, ox6Var4, oh4Var9, oh4Var8, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            oh4Var3 = oh4Var;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-79072205);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new m12(i15);
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    i8 = 1;
                    if (i6 != 0) {
                        bj4VarO.K(-79070893);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new n12(i8);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                    int i113 = IntercomTheme.$stable;
                    jM687getBlack100d7_KjU = intercomTheme4.getColors(bj4VarO, i113).getAlpha().m687getBlack100d7_KjU();
                    jM760getComposerMediaBackground0d7_KjU = intercomTheme4.getColors(bj4VarO, i113).m760getComposerMediaBackground0d7_KjU();
                    listCalculateMediaLayout = calculateMediaLayout(list.size());
                    ox6 ox6VarR4 = ir9.r(ox6Var3);
                    fl6VarD = dv0.d(di.a.c, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarR4);
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
                    Integer numValueOf4 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf4);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    oh4Var7 = oh4Var5;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    ox6 ox6VarA4 = uma.a(aVar, zx8Var);
                    j = jM760getComposerMediaBackground0d7_KjU;
                    j2 = jM687getBlack100d7_KjU;
                    i9 = 6;
                    aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarA4);
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
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(263351186);
                    i10 = 0;
                    i11 = 0;
                    while (r3.hasNext()) {
                        i12 = i10 + 1;
                        if (i10 < 0) {
                            ws0.m();
                            throw null;
                        }
                        rowLayout = (RowLayout) obj;
                        if (i10 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i10 == listCalculateMediaLayout.size() - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (rowLayout instanceof RowLayout.SingleFullWidth) {
                            bj4VarO.K(1374402462);
                            mediaItem2 = list.get(i11);
                            zx8 mediaShapeForPosition7 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                            Block block7 = mediaItem2.getBlock();
                            boolean zIsVideo7 = mediaItem2.isVideo();
                            if (mediaItem2.isVideo()) {
                                oh4Var11 = oh4Var6;
                            } else {
                                oh4Var11 = oh4Var7;
                            }
                            j3 = j2;
                            j4 = j;
                            bj4 bj4Var9 = bj4VarO;
                            m284SingleMediaItemSnr_uVM(block7, zIsVideo7, mediaShapeForPosition7, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var9, 12779520, 0);
                            bj4Var2 = bj4Var9;
                            i11++;
                            bj4Var2.U(false);
                            i14 = 6;
                        } else {
                            bj4Var2 = bj4VarO;
                            z3 = z2;
                            j3 = j2;
                            if (!(rowLayout instanceof RowLayout.Grid)) {
                                bj4Var2.K(875619194);
                                bj4Var2.U(false);
                                u.b();
                                return;
                            }
                            bj4Var2.K(1375596737);
                            ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                            iHashCode3 = Long.hashCode(bj4Var2.T);
                            kw7VarP3 = bj4Var2.P();
                            ox6VarC3 = it1.c(bj4Var2, aVar);
                            bt1.c.getClass();
                            z4 = true;
                            aVar3 = bt1.a.b;
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var2.q();
                            if (bj4Var2.S) {
                                bj4Var2.k(aVar3);
                            } else {
                                bj4Var2.z();
                            }
                            rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                            rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                            rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                            rd7.c(bj4Var2, bt1.a.h);
                            rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                            bj4Var2.K(-1976324612);
                            grid = (RowLayout.Grid) rowLayout;
                            columns = grid.getColumns();
                            i13 = 0;
                            while (i13 < columns) {
                                mediaItem = list.get(i11);
                                if (i13 == 0) {
                                    z5 = z4;
                                } else {
                                    z5 = false;
                                }
                                if (i13 == grid.getColumns() - 1) {
                                    z6 = z4;
                                } else {
                                    z6 = false;
                                }
                                if (z) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                if (z) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (z3) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (z3) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                zx8 mediaShapeForPosition8 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                                int i114 = i13;
                                Block block8 = mediaItem.getBlock();
                                boolean z17 = z;
                                boolean zIsVideo8 = mediaItem.isVideo();
                                if (mediaItem.isVideo()) {
                                    oh4Var10 = oh4Var6;
                                } else {
                                    oh4Var10 = oh4Var7;
                                }
                                boolean z18 = z4;
                                long j8 = j;
                                bj4 bj4Var10 = bj4Var2;
                                m284SingleMediaItemSnr_uVM(block8, zIsVideo8, mediaShapeForPosition8, j8, j3, 1.0f, oh4Var10, m40.a(new qs5(z18, 1.0f)), bj4Var10, 196608, 0);
                                bj4Var2 = bj4Var10;
                                i11++;
                                i13 = i114 + 1;
                                z = z17;
                                z4 = z18;
                                j = j8;
                                grid = grid;
                            }
                            j4 = j;
                            i14 = 6;
                            bj4Var2.U(false);
                            bj4Var2.U(z4);
                            bj4Var2.U(false);
                            g2b g2bVar4 = g2b.a;
                        }
                        bj4VarO = bj4Var2;
                        j = j4;
                        j2 = j3;
                        i10 = i12;
                        i9 = i14;
                    }
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ox6Var4 = ox6Var3;
                    oh4Var8 = oh4Var6;
                    oh4Var9 = oh4Var7;
                } else {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-79072205);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new m12(i15);
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    i8 = 1;
                    if (i6 != 0) {
                        bj4VarO.K(-79070893);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new n12(i8);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                    int i115 = IntercomTheme.$stable;
                    jM687getBlack100d7_KjU = intercomTheme5.getColors(bj4VarO, i115).getAlpha().m687getBlack100d7_KjU();
                    jM760getComposerMediaBackground0d7_KjU = intercomTheme5.getColors(bj4VarO, i115).m760getComposerMediaBackground0d7_KjU();
                    listCalculateMediaLayout = calculateMediaLayout(list.size());
                    ox6 ox6VarR5 = ir9.r(ox6Var3);
                    fl6VarD = dv0.d(di.a.c, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarR5);
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
                    Integer numValueOf5 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf5);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    oh4Var7 = oh4Var5;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    ox6 ox6VarA5 = uma.a(aVar, zx8Var);
                    j = jM760getComposerMediaBackground0d7_KjU;
                    j2 = jM687getBlack100d7_KjU;
                    i9 = 6;
                    aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarA5);
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
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(263351186);
                    i10 = 0;
                    i11 = 0;
                    while (r3.hasNext()) {
                        i12 = i10 + 1;
                        if (i10 < 0) {
                            ws0.m();
                            throw null;
                        }
                        rowLayout = (RowLayout) obj;
                        if (i10 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i10 == listCalculateMediaLayout.size() - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (rowLayout instanceof RowLayout.SingleFullWidth) {
                            bj4VarO.K(1374402462);
                            mediaItem2 = list.get(i11);
                            zx8 mediaShapeForPosition9 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                            Block block9 = mediaItem2.getBlock();
                            boolean zIsVideo9 = mediaItem2.isVideo();
                            if (mediaItem2.isVideo()) {
                                oh4Var11 = oh4Var6;
                            } else {
                                oh4Var11 = oh4Var7;
                            }
                            j3 = j2;
                            j4 = j;
                            bj4 bj4Var11 = bj4VarO;
                            m284SingleMediaItemSnr_uVM(block9, zIsVideo9, mediaShapeForPosition9, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var11, 12779520, 0);
                            bj4Var2 = bj4Var11;
                            i11++;
                            bj4Var2.U(false);
                            i14 = 6;
                        } else {
                            bj4Var2 = bj4VarO;
                            z3 = z2;
                            j3 = j2;
                            if (!(rowLayout instanceof RowLayout.Grid)) {
                                bj4Var2.K(875619194);
                                bj4Var2.U(false);
                                u.b();
                                return;
                            }
                            bj4Var2.K(1375596737);
                            ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                            iHashCode3 = Long.hashCode(bj4Var2.T);
                            kw7VarP3 = bj4Var2.P();
                            ox6VarC3 = it1.c(bj4Var2, aVar);
                            bt1.c.getClass();
                            z4 = true;
                            aVar3 = bt1.a.b;
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var2.q();
                            if (bj4Var2.S) {
                                bj4Var2.k(aVar3);
                            } else {
                                bj4Var2.z();
                            }
                            rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                            rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                            rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                            rd7.c(bj4Var2, bt1.a.h);
                            rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                            bj4Var2.K(-1976324612);
                            grid = (RowLayout.Grid) rowLayout;
                            columns = grid.getColumns();
                            i13 = 0;
                            while (i13 < columns) {
                                mediaItem = list.get(i11);
                                if (i13 == 0) {
                                    z5 = z4;
                                } else {
                                    z5 = false;
                                }
                                if (i13 == grid.getColumns() - 1) {
                                    z6 = z4;
                                } else {
                                    z6 = false;
                                }
                                if (z) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                if (z) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (z3) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (z3) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                zx8 mediaShapeForPosition10 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                                int i116 = i13;
                                Block block10 = mediaItem.getBlock();
                                boolean z19 = z;
                                boolean zIsVideo10 = mediaItem.isVideo();
                                if (mediaItem.isVideo()) {
                                    oh4Var10 = oh4Var6;
                                } else {
                                    oh4Var10 = oh4Var7;
                                }
                                boolean z110 = z4;
                                long j9 = j;
                                bj4 bj4Var12 = bj4Var2;
                                m284SingleMediaItemSnr_uVM(block10, zIsVideo10, mediaShapeForPosition10, j9, j3, 1.0f, oh4Var10, m40.a(new qs5(z110, 1.0f)), bj4Var12, 196608, 0);
                                bj4Var2 = bj4Var12;
                                i11++;
                                i13 = i116 + 1;
                                z = z19;
                                z4 = z110;
                                j = j9;
                                grid = grid;
                            }
                            j4 = j;
                            i14 = 6;
                            bj4Var2.U(false);
                            bj4Var2.U(z4);
                            bj4Var2.U(false);
                            g2b g2bVar5 = g2b.a;
                        }
                        bj4VarO = bj4Var2;
                        j = j4;
                        j2 = j3;
                        i10 = i12;
                        i9 = i14;
                    }
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ox6Var4 = ox6Var3;
                    oh4Var8 = oh4Var6;
                    oh4Var9 = oh4Var7;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ip4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return GroupedMediaKt.GroupedMedia$lambda$9(list, zx8Var, ox6Var4, oh4Var9, oh4Var8, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var4 = oh4Var2;
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i16 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-79072205);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new m12(i15);
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                i8 = 1;
                if (i6 != 0) {
                    bj4VarO.K(-79070893);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new n12(i8);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                int i117 = IntercomTheme.$stable;
                jM687getBlack100d7_KjU = intercomTheme6.getColors(bj4VarO, i117).getAlpha().m687getBlack100d7_KjU();
                jM760getComposerMediaBackground0d7_KjU = intercomTheme6.getColors(bj4VarO, i117).m760getComposerMediaBackground0d7_KjU();
                listCalculateMediaLayout = calculateMediaLayout(list.size());
                ox6 ox6VarR6 = ir9.r(ox6Var3);
                fl6VarD = dv0.d(di.a.c, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarR6);
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
                Integer numValueOf6 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf6);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                oh4Var7 = oh4Var5;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6VarA6 = uma.a(aVar, zx8Var);
                j = jM760getComposerMediaBackground0d7_KjU;
                j2 = jM687getBlack100d7_KjU;
                i9 = 6;
                aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarA6);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(263351186);
                i10 = 0;
                i11 = 0;
                while (r3.hasNext()) {
                    i12 = i10 + 1;
                    if (i10 < 0) {
                        ws0.m();
                        throw null;
                    }
                    rowLayout = (RowLayout) obj;
                    if (i10 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i10 == listCalculateMediaLayout.size() - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rowLayout instanceof RowLayout.SingleFullWidth) {
                        bj4VarO.K(1374402462);
                        mediaItem2 = list.get(i11);
                        zx8 mediaShapeForPosition11 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                        Block block11 = mediaItem2.getBlock();
                        boolean zIsVideo11 = mediaItem2.isVideo();
                        if (mediaItem2.isVideo()) {
                            oh4Var11 = oh4Var6;
                        } else {
                            oh4Var11 = oh4Var7;
                        }
                        j3 = j2;
                        j4 = j;
                        bj4 bj4Var13 = bj4VarO;
                        m284SingleMediaItemSnr_uVM(block11, zIsVideo11, mediaShapeForPosition11, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var13, 12779520, 0);
                        bj4Var2 = bj4Var13;
                        i11++;
                        bj4Var2.U(false);
                        i14 = 6;
                    } else {
                        bj4Var2 = bj4VarO;
                        z3 = z2;
                        j3 = j2;
                        if (!(rowLayout instanceof RowLayout.Grid)) {
                            bj4Var2.K(875619194);
                            bj4Var2.U(false);
                            u.b();
                            return;
                        }
                        bj4Var2.K(1375596737);
                        ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                        iHashCode3 = Long.hashCode(bj4Var2.T);
                        kw7VarP3 = bj4Var2.P();
                        ox6VarC3 = it1.c(bj4Var2, aVar);
                        bt1.c.getClass();
                        z4 = true;
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var2.q();
                        if (bj4Var2.S) {
                            bj4Var2.k(aVar3);
                        } else {
                            bj4Var2.z();
                        }
                        rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                        rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                        rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                        rd7.c(bj4Var2, bt1.a.h);
                        rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                        bj4Var2.K(-1976324612);
                        grid = (RowLayout.Grid) rowLayout;
                        columns = grid.getColumns();
                        i13 = 0;
                        while (i13 < columns) {
                            mediaItem = list.get(i11);
                            if (i13 == 0) {
                                z5 = z4;
                            } else {
                                z5 = false;
                            }
                            if (i13 == grid.getColumns() - 1) {
                                z6 = z4;
                            } else {
                                z6 = false;
                            }
                            if (z) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (z3) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (z3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            zx8 mediaShapeForPosition12 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                            int i118 = i13;
                            Block block12 = mediaItem.getBlock();
                            boolean z111 = z;
                            boolean zIsVideo12 = mediaItem.isVideo();
                            if (mediaItem.isVideo()) {
                                oh4Var10 = oh4Var6;
                            } else {
                                oh4Var10 = oh4Var7;
                            }
                            boolean z112 = z4;
                            long j10 = j;
                            bj4 bj4Var14 = bj4Var2;
                            m284SingleMediaItemSnr_uVM(block12, zIsVideo12, mediaShapeForPosition12, j10, j3, 1.0f, oh4Var10, m40.a(new qs5(z112, 1.0f)), bj4Var14, 196608, 0);
                            bj4Var2 = bj4Var14;
                            i11++;
                            i13 = i118 + 1;
                            z = z111;
                            z4 = z112;
                            j = j10;
                            grid = grid;
                        }
                        j4 = j;
                        i14 = 6;
                        bj4Var2.U(false);
                        bj4Var2.U(z4);
                        bj4Var2.U(false);
                        g2b g2bVar6 = g2b.a;
                    }
                    bj4VarO = bj4Var2;
                    j = j4;
                    j2 = j3;
                    i10 = i12;
                    i9 = i14;
                }
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ox6Var4 = ox6Var3;
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var7;
            } else {
                aVar = ox6.a.t;
                if (i16 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-79072205);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new m12(i15);
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                i8 = 1;
                if (i6 != 0) {
                    bj4VarO.K(-79070893);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new n12(i8);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                int i119 = IntercomTheme.$stable;
                jM687getBlack100d7_KjU = intercomTheme7.getColors(bj4VarO, i119).getAlpha().m687getBlack100d7_KjU();
                jM760getComposerMediaBackground0d7_KjU = intercomTheme7.getColors(bj4VarO, i119).m760getComposerMediaBackground0d7_KjU();
                listCalculateMediaLayout = calculateMediaLayout(list.size());
                ox6 ox6VarR7 = ir9.r(ox6Var3);
                fl6VarD = dv0.d(di.a.c, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarR7);
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
                Integer numValueOf7 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf7);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                oh4Var7 = oh4Var5;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6VarA7 = uma.a(aVar, zx8Var);
                j = jM760getComposerMediaBackground0d7_KjU;
                j2 = jM687getBlack100d7_KjU;
                i9 = 6;
                aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarA7);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(263351186);
                i10 = 0;
                i11 = 0;
                while (r3.hasNext()) {
                    i12 = i10 + 1;
                    if (i10 < 0) {
                        ws0.m();
                        throw null;
                    }
                    rowLayout = (RowLayout) obj;
                    if (i10 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i10 == listCalculateMediaLayout.size() - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rowLayout instanceof RowLayout.SingleFullWidth) {
                        bj4VarO.K(1374402462);
                        mediaItem2 = list.get(i11);
                        zx8 mediaShapeForPosition13 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                        Block block13 = mediaItem2.getBlock();
                        boolean zIsVideo13 = mediaItem2.isVideo();
                        if (mediaItem2.isVideo()) {
                            oh4Var11 = oh4Var6;
                        } else {
                            oh4Var11 = oh4Var7;
                        }
                        j3 = j2;
                        j4 = j;
                        bj4 bj4Var15 = bj4VarO;
                        m284SingleMediaItemSnr_uVM(block13, zIsVideo13, mediaShapeForPosition13, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var15, 12779520, 0);
                        bj4Var2 = bj4Var15;
                        i11++;
                        bj4Var2.U(false);
                        i14 = 6;
                    } else {
                        bj4Var2 = bj4VarO;
                        z3 = z2;
                        j3 = j2;
                        if (!(rowLayout instanceof RowLayout.Grid)) {
                            bj4Var2.K(875619194);
                            bj4Var2.U(false);
                            u.b();
                            return;
                        }
                        bj4Var2.K(1375596737);
                        ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                        iHashCode3 = Long.hashCode(bj4Var2.T);
                        kw7VarP3 = bj4Var2.P();
                        ox6VarC3 = it1.c(bj4Var2, aVar);
                        bt1.c.getClass();
                        z4 = true;
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var2.q();
                        if (bj4Var2.S) {
                            bj4Var2.k(aVar3);
                        } else {
                            bj4Var2.z();
                        }
                        rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                        rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                        rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                        rd7.c(bj4Var2, bt1.a.h);
                        rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                        bj4Var2.K(-1976324612);
                        grid = (RowLayout.Grid) rowLayout;
                        columns = grid.getColumns();
                        i13 = 0;
                        while (i13 < columns) {
                            mediaItem = list.get(i11);
                            if (i13 == 0) {
                                z5 = z4;
                            } else {
                                z5 = false;
                            }
                            if (i13 == grid.getColumns() - 1) {
                                z6 = z4;
                            } else {
                                z6 = false;
                            }
                            if (z) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (z3) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (z3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            zx8 mediaShapeForPosition14 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                            int i1110 = i13;
                            Block block14 = mediaItem.getBlock();
                            boolean z113 = z;
                            boolean zIsVideo14 = mediaItem.isVideo();
                            if (mediaItem.isVideo()) {
                                oh4Var10 = oh4Var6;
                            } else {
                                oh4Var10 = oh4Var7;
                            }
                            boolean z114 = z4;
                            long j11 = j;
                            bj4 bj4Var16 = bj4Var2;
                            m284SingleMediaItemSnr_uVM(block14, zIsVideo14, mediaShapeForPosition14, j11, j3, 1.0f, oh4Var10, m40.a(new qs5(z114, 1.0f)), bj4Var16, 196608, 0);
                            bj4Var2 = bj4Var16;
                            i11++;
                            i13 = i1110 + 1;
                            z = z113;
                            z4 = z114;
                            j = j11;
                            grid = grid;
                        }
                        j4 = j;
                        i14 = 6;
                        bj4Var2.U(false);
                        bj4Var2.U(z4);
                        bj4Var2.U(false);
                        g2b g2bVar7 = g2b.a;
                    }
                    bj4VarO = bj4Var2;
                    j = j4;
                    j2 = j3;
                    i10 = i12;
                    i9 = i14;
                }
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ox6Var4 = ox6Var3;
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var7;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ip4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return GroupedMediaKt.GroupedMedia$lambda$9(list, zx8Var, ox6Var4, oh4Var9, oh4Var8, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                oh4Var3 = oh4Var;
                if (bj4VarO.j(oh4Var3)) {
                    i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) == 9362) {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-79072205);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new m12(i15);
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    i8 = 1;
                    if (i6 != 0) {
                        bj4VarO.K(-79070893);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new n12(i8);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                    int i1111 = IntercomTheme.$stable;
                    jM687getBlack100d7_KjU = intercomTheme8.getColors(bj4VarO, i1111).getAlpha().m687getBlack100d7_KjU();
                    jM760getComposerMediaBackground0d7_KjU = intercomTheme8.getColors(bj4VarO, i1111).m760getComposerMediaBackground0d7_KjU();
                    listCalculateMediaLayout = calculateMediaLayout(list.size());
                    ox6 ox6VarR8 = ir9.r(ox6Var3);
                    fl6VarD = dv0.d(di.a.c, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarR8);
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
                    Integer numValueOf8 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf8);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    oh4Var7 = oh4Var5;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    ox6 ox6VarA8 = uma.a(aVar, zx8Var);
                    j = jM760getComposerMediaBackground0d7_KjU;
                    j2 = jM687getBlack100d7_KjU;
                    i9 = 6;
                    aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarA8);
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
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(263351186);
                    i10 = 0;
                    i11 = 0;
                    while (r3.hasNext()) {
                        i12 = i10 + 1;
                        if (i10 < 0) {
                            ws0.m();
                            throw null;
                        }
                        rowLayout = (RowLayout) obj;
                        if (i10 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i10 == listCalculateMediaLayout.size() - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (rowLayout instanceof RowLayout.SingleFullWidth) {
                            bj4VarO.K(1374402462);
                            mediaItem2 = list.get(i11);
                            zx8 mediaShapeForPosition15 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                            Block block15 = mediaItem2.getBlock();
                            boolean zIsVideo15 = mediaItem2.isVideo();
                            if (mediaItem2.isVideo()) {
                                oh4Var11 = oh4Var6;
                            } else {
                                oh4Var11 = oh4Var7;
                            }
                            j3 = j2;
                            j4 = j;
                            bj4 bj4Var17 = bj4VarO;
                            m284SingleMediaItemSnr_uVM(block15, zIsVideo15, mediaShapeForPosition15, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var17, 12779520, 0);
                            bj4Var2 = bj4Var17;
                            i11++;
                            bj4Var2.U(false);
                            i14 = 6;
                        } else {
                            bj4Var2 = bj4VarO;
                            z3 = z2;
                            j3 = j2;
                            if (!(rowLayout instanceof RowLayout.Grid)) {
                                bj4Var2.K(875619194);
                                bj4Var2.U(false);
                                u.b();
                                return;
                            }
                            bj4Var2.K(1375596737);
                            ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                            iHashCode3 = Long.hashCode(bj4Var2.T);
                            kw7VarP3 = bj4Var2.P();
                            ox6VarC3 = it1.c(bj4Var2, aVar);
                            bt1.c.getClass();
                            z4 = true;
                            aVar3 = bt1.a.b;
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var2.q();
                            if (bj4Var2.S) {
                                bj4Var2.k(aVar3);
                            } else {
                                bj4Var2.z();
                            }
                            rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                            rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                            rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                            rd7.c(bj4Var2, bt1.a.h);
                            rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                            bj4Var2.K(-1976324612);
                            grid = (RowLayout.Grid) rowLayout;
                            columns = grid.getColumns();
                            i13 = 0;
                            while (i13 < columns) {
                                mediaItem = list.get(i11);
                                if (i13 == 0) {
                                    z5 = z4;
                                } else {
                                    z5 = false;
                                }
                                if (i13 == grid.getColumns() - 1) {
                                    z6 = z4;
                                } else {
                                    z6 = false;
                                }
                                if (z) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                if (z) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (z3) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (z3) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                zx8 mediaShapeForPosition16 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                                int i1112 = i13;
                                Block block16 = mediaItem.getBlock();
                                boolean z115 = z;
                                boolean zIsVideo16 = mediaItem.isVideo();
                                if (mediaItem.isVideo()) {
                                    oh4Var10 = oh4Var6;
                                } else {
                                    oh4Var10 = oh4Var7;
                                }
                                boolean z116 = z4;
                                long j12 = j;
                                bj4 bj4Var18 = bj4Var2;
                                m284SingleMediaItemSnr_uVM(block16, zIsVideo16, mediaShapeForPosition16, j12, j3, 1.0f, oh4Var10, m40.a(new qs5(z116, 1.0f)), bj4Var18, 196608, 0);
                                bj4Var2 = bj4Var18;
                                i11++;
                                i13 = i1112 + 1;
                                z = z115;
                                z4 = z116;
                                j = j12;
                                grid = grid;
                            }
                            j4 = j;
                            i14 = 6;
                            bj4Var2.U(false);
                            bj4Var2.U(z4);
                            bj4Var2.U(false);
                            g2b g2bVar8 = g2b.a;
                        }
                        bj4VarO = bj4Var2;
                        j = j4;
                        j2 = j3;
                        i10 = i12;
                        i9 = i14;
                    }
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ox6Var4 = ox6Var3;
                    oh4Var8 = oh4Var6;
                    oh4Var9 = oh4Var7;
                } else {
                    aVar = ox6.a.t;
                    if (i16 != 0) {
                        ox6Var3 = aVar;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(-79072205);
                        objF2 = bj4VarO.f();
                        if (objF2 == c0187a) {
                            objF2 = new m12(i15);
                            bj4VarO.C(objF2);
                        }
                        oh4Var5 = (oh4) objF2;
                        bj4VarO.U(false);
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    i8 = 1;
                    if (i6 != 0) {
                        bj4VarO.K(-79070893);
                        objF = bj4VarO.f();
                        if (objF == c0187a) {
                            objF = new n12(i8);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                    int i1113 = IntercomTheme.$stable;
                    jM687getBlack100d7_KjU = intercomTheme9.getColors(bj4VarO, i1113).getAlpha().m687getBlack100d7_KjU();
                    jM760getComposerMediaBackground0d7_KjU = intercomTheme9.getColors(bj4VarO, i1113).m760getComposerMediaBackground0d7_KjU();
                    listCalculateMediaLayout = calculateMediaLayout(list.size());
                    ox6 ox6VarR9 = ir9.r(ox6Var3);
                    fl6VarD = dv0.d(di.a.c, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarR9);
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
                    Integer numValueOf9 = Integer.valueOf(iHashCode);
                    bVar = bt1.a.g;
                    rd7.d(bj4VarO, bVar, numValueOf9);
                    c0034a = bt1.a.h;
                    rd7.c(bj4VarO, c0034a);
                    oh4Var7 = oh4Var5;
                    dVar = bt1.a.d;
                    rd7.d(bj4VarO, dVar, ox6VarC);
                    ox6 ox6VarA9 = uma.a(aVar, zx8Var);
                    j = jM760getComposerMediaBackground0d7_KjU;
                    j2 = jM687getBlack100d7_KjU;
                    i9 = 6;
                    aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
                    iHashCode2 = Long.hashCode(bj4VarO.T);
                    kw7VarP2 = bj4VarO.P();
                    ox6VarC2 = it1.c(bj4VarO, ox6VarA9);
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
                    rd7.d(bj4VarO, cVar, aj1VarA);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    bj4VarO.K(263351186);
                    i10 = 0;
                    i11 = 0;
                    while (r3.hasNext()) {
                        i12 = i10 + 1;
                        if (i10 < 0) {
                            ws0.m();
                            throw null;
                        }
                        rowLayout = (RowLayout) obj;
                        if (i10 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i10 == listCalculateMediaLayout.size() - 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (rowLayout instanceof RowLayout.SingleFullWidth) {
                            bj4VarO.K(1374402462);
                            mediaItem2 = list.get(i11);
                            zx8 mediaShapeForPosition17 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                            Block block17 = mediaItem2.getBlock();
                            boolean zIsVideo17 = mediaItem2.isVideo();
                            if (mediaItem2.isVideo()) {
                                oh4Var11 = oh4Var6;
                            } else {
                                oh4Var11 = oh4Var7;
                            }
                            j3 = j2;
                            j4 = j;
                            bj4 bj4Var19 = bj4VarO;
                            m284SingleMediaItemSnr_uVM(block17, zIsVideo17, mediaShapeForPosition17, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var19, 12779520, 0);
                            bj4Var2 = bj4Var19;
                            i11++;
                            bj4Var2.U(false);
                            i14 = 6;
                        } else {
                            bj4Var2 = bj4VarO;
                            z3 = z2;
                            j3 = j2;
                            if (!(rowLayout instanceof RowLayout.Grid)) {
                                bj4Var2.K(875619194);
                                bj4Var2.U(false);
                                u.b();
                                return;
                            }
                            bj4Var2.K(1375596737);
                            ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                            iHashCode3 = Long.hashCode(bj4Var2.T);
                            kw7VarP3 = bj4Var2.P();
                            ox6VarC3 = it1.c(bj4Var2, aVar);
                            bt1.c.getClass();
                            z4 = true;
                            aVar3 = bt1.a.b;
                            if (j1bVar == null) {
                                ml5.c();
                                throw null;
                            }
                            bj4Var2.q();
                            if (bj4Var2.S) {
                                bj4Var2.k(aVar3);
                            } else {
                                bj4Var2.z();
                            }
                            rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                            rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                            rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                            rd7.c(bj4Var2, bt1.a.h);
                            rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                            bj4Var2.K(-1976324612);
                            grid = (RowLayout.Grid) rowLayout;
                            columns = grid.getColumns();
                            i13 = 0;
                            while (i13 < columns) {
                                mediaItem = list.get(i11);
                                if (i13 == 0) {
                                    z5 = z4;
                                } else {
                                    z5 = false;
                                }
                                if (i13 == grid.getColumns() - 1) {
                                    z6 = z4;
                                } else {
                                    z6 = false;
                                }
                                if (z) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                if (z) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (z3) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (z3) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                zx8 mediaShapeForPosition18 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                                int i1114 = i13;
                                Block block18 = mediaItem.getBlock();
                                boolean z117 = z;
                                boolean zIsVideo18 = mediaItem.isVideo();
                                if (mediaItem.isVideo()) {
                                    oh4Var10 = oh4Var6;
                                } else {
                                    oh4Var10 = oh4Var7;
                                }
                                boolean z118 = z4;
                                long j13 = j;
                                bj4 bj4Var110 = bj4Var2;
                                m284SingleMediaItemSnr_uVM(block18, zIsVideo18, mediaShapeForPosition18, j13, j3, 1.0f, oh4Var10, m40.a(new qs5(z118, 1.0f)), bj4Var110, 196608, 0);
                                bj4Var2 = bj4Var110;
                                i11++;
                                i13 = i1114 + 1;
                                z = z117;
                                z4 = z118;
                                j = j13;
                                grid = grid;
                            }
                            j4 = j;
                            i14 = 6;
                            bj4Var2.U(false);
                            bj4Var2.U(z4);
                            bj4Var2.U(false);
                            g2b g2bVar9 = g2b.a;
                        }
                        bj4VarO = bj4Var2;
                        j = j4;
                        j2 = j3;
                        i10 = i12;
                        i9 = i14;
                    }
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    bj4Var.U(true);
                    bj4Var.U(true);
                    ox6Var4 = ox6Var3;
                    oh4Var8 = oh4Var6;
                    oh4Var9 = oh4Var7;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ip4
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return GroupedMediaKt.GroupedMedia$lambda$9(list, zx8Var, ox6Var4, oh4Var9, oh4Var8, i, i2, (jt1) obj2, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var4 = oh4Var2;
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i16 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-79072205);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new m12(i15);
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                i8 = 1;
                if (i6 != 0) {
                    bj4VarO.K(-79070893);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new n12(i8);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                int i1115 = IntercomTheme.$stable;
                jM687getBlack100d7_KjU = intercomTheme10.getColors(bj4VarO, i1115).getAlpha().m687getBlack100d7_KjU();
                jM760getComposerMediaBackground0d7_KjU = intercomTheme10.getColors(bj4VarO, i1115).m760getComposerMediaBackground0d7_KjU();
                listCalculateMediaLayout = calculateMediaLayout(list.size());
                ox6 ox6VarR10 = ir9.r(ox6Var3);
                fl6VarD = dv0.d(di.a.c, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarR10);
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
                Integer numValueOf10 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf10);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                oh4Var7 = oh4Var5;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6VarA10 = uma.a(aVar, zx8Var);
                j = jM760getComposerMediaBackground0d7_KjU;
                j2 = jM687getBlack100d7_KjU;
                i9 = 6;
                aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarA10);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(263351186);
                i10 = 0;
                i11 = 0;
                while (r3.hasNext()) {
                    i12 = i10 + 1;
                    if (i10 < 0) {
                        ws0.m();
                        throw null;
                    }
                    rowLayout = (RowLayout) obj;
                    if (i10 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i10 == listCalculateMediaLayout.size() - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rowLayout instanceof RowLayout.SingleFullWidth) {
                        bj4VarO.K(1374402462);
                        mediaItem2 = list.get(i11);
                        zx8 mediaShapeForPosition19 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                        Block block19 = mediaItem2.getBlock();
                        boolean zIsVideo19 = mediaItem2.isVideo();
                        if (mediaItem2.isVideo()) {
                            oh4Var11 = oh4Var6;
                        } else {
                            oh4Var11 = oh4Var7;
                        }
                        j3 = j2;
                        j4 = j;
                        bj4 bj4Var111 = bj4VarO;
                        m284SingleMediaItemSnr_uVM(block19, zIsVideo19, mediaShapeForPosition19, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var111, 12779520, 0);
                        bj4Var2 = bj4Var111;
                        i11++;
                        bj4Var2.U(false);
                        i14 = 6;
                    } else {
                        bj4Var2 = bj4VarO;
                        z3 = z2;
                        j3 = j2;
                        if (!(rowLayout instanceof RowLayout.Grid)) {
                            bj4Var2.K(875619194);
                            bj4Var2.U(false);
                            u.b();
                            return;
                        }
                        bj4Var2.K(1375596737);
                        ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                        iHashCode3 = Long.hashCode(bj4Var2.T);
                        kw7VarP3 = bj4Var2.P();
                        ox6VarC3 = it1.c(bj4Var2, aVar);
                        bt1.c.getClass();
                        z4 = true;
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var2.q();
                        if (bj4Var2.S) {
                            bj4Var2.k(aVar3);
                        } else {
                            bj4Var2.z();
                        }
                        rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                        rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                        rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                        rd7.c(bj4Var2, bt1.a.h);
                        rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                        bj4Var2.K(-1976324612);
                        grid = (RowLayout.Grid) rowLayout;
                        columns = grid.getColumns();
                        i13 = 0;
                        while (i13 < columns) {
                            mediaItem = list.get(i11);
                            if (i13 == 0) {
                                z5 = z4;
                            } else {
                                z5 = false;
                            }
                            if (i13 == grid.getColumns() - 1) {
                                z6 = z4;
                            } else {
                                z6 = false;
                            }
                            if (z) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (z3) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (z3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            zx8 mediaShapeForPosition110 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                            int i1116 = i13;
                            Block block110 = mediaItem.getBlock();
                            boolean z119 = z;
                            boolean zIsVideo110 = mediaItem.isVideo();
                            if (mediaItem.isVideo()) {
                                oh4Var10 = oh4Var6;
                            } else {
                                oh4Var10 = oh4Var7;
                            }
                            boolean z1110 = z4;
                            long j14 = j;
                            bj4 bj4Var112 = bj4Var2;
                            m284SingleMediaItemSnr_uVM(block110, zIsVideo110, mediaShapeForPosition110, j14, j3, 1.0f, oh4Var10, m40.a(new qs5(z1110, 1.0f)), bj4Var112, 196608, 0);
                            bj4Var2 = bj4Var112;
                            i11++;
                            i13 = i1116 + 1;
                            z = z119;
                            z4 = z1110;
                            j = j14;
                            grid = grid;
                        }
                        j4 = j;
                        i14 = 6;
                        bj4Var2.U(false);
                        bj4Var2.U(z4);
                        bj4Var2.U(false);
                        g2b g2bVar10 = g2b.a;
                    }
                    bj4VarO = bj4Var2;
                    j = j4;
                    j2 = j3;
                    i10 = i12;
                    i9 = i14;
                }
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ox6Var4 = ox6Var3;
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var7;
            } else {
                aVar = ox6.a.t;
                if (i16 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-79072205);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new m12(i15);
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                i8 = 1;
                if (i6 != 0) {
                    bj4VarO.K(-79070893);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new n12(i8);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                int i1117 = IntercomTheme.$stable;
                jM687getBlack100d7_KjU = intercomTheme11.getColors(bj4VarO, i1117).getAlpha().m687getBlack100d7_KjU();
                jM760getComposerMediaBackground0d7_KjU = intercomTheme11.getColors(bj4VarO, i1117).m760getComposerMediaBackground0d7_KjU();
                listCalculateMediaLayout = calculateMediaLayout(list.size());
                ox6 ox6VarR11 = ir9.r(ox6Var3);
                fl6VarD = dv0.d(di.a.c, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarR11);
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
                Integer numValueOf11 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf11);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                oh4Var7 = oh4Var5;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6VarA11 = uma.a(aVar, zx8Var);
                j = jM760getComposerMediaBackground0d7_KjU;
                j2 = jM687getBlack100d7_KjU;
                i9 = 6;
                aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarA11);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(263351186);
                i10 = 0;
                i11 = 0;
                while (r3.hasNext()) {
                    i12 = i10 + 1;
                    if (i10 < 0) {
                        ws0.m();
                        throw null;
                    }
                    rowLayout = (RowLayout) obj;
                    if (i10 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i10 == listCalculateMediaLayout.size() - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rowLayout instanceof RowLayout.SingleFullWidth) {
                        bj4VarO.K(1374402462);
                        mediaItem2 = list.get(i11);
                        zx8 mediaShapeForPosition111 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                        Block block111 = mediaItem2.getBlock();
                        boolean zIsVideo111 = mediaItem2.isVideo();
                        if (mediaItem2.isVideo()) {
                            oh4Var11 = oh4Var6;
                        } else {
                            oh4Var11 = oh4Var7;
                        }
                        j3 = j2;
                        j4 = j;
                        bj4 bj4Var113 = bj4VarO;
                        m284SingleMediaItemSnr_uVM(block111, zIsVideo111, mediaShapeForPosition111, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var113, 12779520, 0);
                        bj4Var2 = bj4Var113;
                        i11++;
                        bj4Var2.U(false);
                        i14 = 6;
                    } else {
                        bj4Var2 = bj4VarO;
                        z3 = z2;
                        j3 = j2;
                        if (!(rowLayout instanceof RowLayout.Grid)) {
                            bj4Var2.K(875619194);
                            bj4Var2.U(false);
                            u.b();
                            return;
                        }
                        bj4Var2.K(1375596737);
                        ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                        iHashCode3 = Long.hashCode(bj4Var2.T);
                        kw7VarP3 = bj4Var2.P();
                        ox6VarC3 = it1.c(bj4Var2, aVar);
                        bt1.c.getClass();
                        z4 = true;
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var2.q();
                        if (bj4Var2.S) {
                            bj4Var2.k(aVar3);
                        } else {
                            bj4Var2.z();
                        }
                        rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                        rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                        rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                        rd7.c(bj4Var2, bt1.a.h);
                        rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                        bj4Var2.K(-1976324612);
                        grid = (RowLayout.Grid) rowLayout;
                        columns = grid.getColumns();
                        i13 = 0;
                        while (i13 < columns) {
                            mediaItem = list.get(i11);
                            if (i13 == 0) {
                                z5 = z4;
                            } else {
                                z5 = false;
                            }
                            if (i13 == grid.getColumns() - 1) {
                                z6 = z4;
                            } else {
                                z6 = false;
                            }
                            if (z) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (z3) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (z3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            zx8 mediaShapeForPosition112 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                            int i1118 = i13;
                            Block block112 = mediaItem.getBlock();
                            boolean z1111 = z;
                            boolean zIsVideo112 = mediaItem.isVideo();
                            if (mediaItem.isVideo()) {
                                oh4Var10 = oh4Var6;
                            } else {
                                oh4Var10 = oh4Var7;
                            }
                            boolean z1112 = z4;
                            long j15 = j;
                            bj4 bj4Var114 = bj4Var2;
                            m284SingleMediaItemSnr_uVM(block112, zIsVideo112, mediaShapeForPosition112, j15, j3, 1.0f, oh4Var10, m40.a(new qs5(z1112, 1.0f)), bj4Var114, 196608, 0);
                            bj4Var2 = bj4Var114;
                            i11++;
                            i13 = i1118 + 1;
                            z = z1111;
                            z4 = z1112;
                            j = j15;
                            grid = grid;
                        }
                        j4 = j;
                        i14 = 6;
                        bj4Var2.U(false);
                        bj4Var2.U(z4);
                        bj4Var2.U(false);
                        g2b g2bVar11 = g2b.a;
                    }
                    bj4VarO = bj4Var2;
                    j = j4;
                    j2 = j3;
                    i10 = i12;
                    i9 = i14;
                }
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ox6Var4 = ox6Var3;
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var7;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ip4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return GroupedMediaKt.GroupedMedia$lambda$9(list, zx8Var, ox6Var4, oh4Var9, oh4Var8, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        oh4Var3 = oh4Var;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                oh4Var4 = oh4Var2;
                if (bj4VarO.j(oh4Var4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i3 & 9363) == 9362) {
                aVar = ox6.a.t;
                if (i16 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-79072205);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new m12(i15);
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                i8 = 1;
                if (i6 != 0) {
                    bj4VarO.K(-79070893);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new n12(i8);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                int i1119 = IntercomTheme.$stable;
                jM687getBlack100d7_KjU = intercomTheme12.getColors(bj4VarO, i1119).getAlpha().m687getBlack100d7_KjU();
                jM760getComposerMediaBackground0d7_KjU = intercomTheme12.getColors(bj4VarO, i1119).m760getComposerMediaBackground0d7_KjU();
                listCalculateMediaLayout = calculateMediaLayout(list.size());
                ox6 ox6VarR12 = ir9.r(ox6Var3);
                fl6VarD = dv0.d(di.a.c, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarR12);
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
                Integer numValueOf12 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf12);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                oh4Var7 = oh4Var5;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6VarA12 = uma.a(aVar, zx8Var);
                j = jM760getComposerMediaBackground0d7_KjU;
                j2 = jM687getBlack100d7_KjU;
                i9 = 6;
                aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarA12);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(263351186);
                i10 = 0;
                i11 = 0;
                while (r3.hasNext()) {
                    i12 = i10 + 1;
                    if (i10 < 0) {
                        ws0.m();
                        throw null;
                    }
                    rowLayout = (RowLayout) obj;
                    if (i10 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i10 == listCalculateMediaLayout.size() - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rowLayout instanceof RowLayout.SingleFullWidth) {
                        bj4VarO.K(1374402462);
                        mediaItem2 = list.get(i11);
                        zx8 mediaShapeForPosition113 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                        Block block113 = mediaItem2.getBlock();
                        boolean zIsVideo113 = mediaItem2.isVideo();
                        if (mediaItem2.isVideo()) {
                            oh4Var11 = oh4Var6;
                        } else {
                            oh4Var11 = oh4Var7;
                        }
                        j3 = j2;
                        j4 = j;
                        bj4 bj4Var115 = bj4VarO;
                        m284SingleMediaItemSnr_uVM(block113, zIsVideo113, mediaShapeForPosition113, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var115, 12779520, 0);
                        bj4Var2 = bj4Var115;
                        i11++;
                        bj4Var2.U(false);
                        i14 = 6;
                    } else {
                        bj4Var2 = bj4VarO;
                        z3 = z2;
                        j3 = j2;
                        if (!(rowLayout instanceof RowLayout.Grid)) {
                            bj4Var2.K(875619194);
                            bj4Var2.U(false);
                            u.b();
                            return;
                        }
                        bj4Var2.K(1375596737);
                        ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                        iHashCode3 = Long.hashCode(bj4Var2.T);
                        kw7VarP3 = bj4Var2.P();
                        ox6VarC3 = it1.c(bj4Var2, aVar);
                        bt1.c.getClass();
                        z4 = true;
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var2.q();
                        if (bj4Var2.S) {
                            bj4Var2.k(aVar3);
                        } else {
                            bj4Var2.z();
                        }
                        rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                        rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                        rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                        rd7.c(bj4Var2, bt1.a.h);
                        rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                        bj4Var2.K(-1976324612);
                        grid = (RowLayout.Grid) rowLayout;
                        columns = grid.getColumns();
                        i13 = 0;
                        while (i13 < columns) {
                            mediaItem = list.get(i11);
                            if (i13 == 0) {
                                z5 = z4;
                            } else {
                                z5 = false;
                            }
                            if (i13 == grid.getColumns() - 1) {
                                z6 = z4;
                            } else {
                                z6 = false;
                            }
                            if (z) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (z3) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (z3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            zx8 mediaShapeForPosition114 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                            int i11110 = i13;
                            Block block114 = mediaItem.getBlock();
                            boolean z1113 = z;
                            boolean zIsVideo114 = mediaItem.isVideo();
                            if (mediaItem.isVideo()) {
                                oh4Var10 = oh4Var6;
                            } else {
                                oh4Var10 = oh4Var7;
                            }
                            boolean z1114 = z4;
                            long j16 = j;
                            bj4 bj4Var116 = bj4Var2;
                            m284SingleMediaItemSnr_uVM(block114, zIsVideo114, mediaShapeForPosition114, j16, j3, 1.0f, oh4Var10, m40.a(new qs5(z1114, 1.0f)), bj4Var116, 196608, 0);
                            bj4Var2 = bj4Var116;
                            i11++;
                            i13 = i11110 + 1;
                            z = z1113;
                            z4 = z1114;
                            j = j16;
                            grid = grid;
                        }
                        j4 = j;
                        i14 = 6;
                        bj4Var2.U(false);
                        bj4Var2.U(z4);
                        bj4Var2.U(false);
                        g2b g2bVar12 = g2b.a;
                    }
                    bj4VarO = bj4Var2;
                    j = j4;
                    j2 = j3;
                    i10 = i12;
                    i9 = i14;
                }
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ox6Var4 = ox6Var3;
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var7;
            } else {
                aVar = ox6.a.t;
                if (i16 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(-79072205);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = new m12(i15);
                        bj4VarO.C(objF2);
                    }
                    oh4Var5 = (oh4) objF2;
                    bj4VarO.U(false);
                } else {
                    oh4Var5 = oh4Var3;
                }
                i8 = 1;
                if (i6 != 0) {
                    bj4VarO.K(-79070893);
                    objF = bj4VarO.f();
                    if (objF == c0187a) {
                        objF = new n12(i8);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF;
                } else {
                    oh4Var6 = oh4Var4;
                }
                IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                int i11111 = IntercomTheme.$stable;
                jM687getBlack100d7_KjU = intercomTheme13.getColors(bj4VarO, i11111).getAlpha().m687getBlack100d7_KjU();
                jM760getComposerMediaBackground0d7_KjU = intercomTheme13.getColors(bj4VarO, i11111).m760getComposerMediaBackground0d7_KjU();
                listCalculateMediaLayout = calculateMediaLayout(list.size());
                ox6 ox6VarR13 = ir9.r(ox6Var3);
                fl6VarD = dv0.d(di.a.c, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarR13);
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
                Integer numValueOf13 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf13);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                oh4Var7 = oh4Var5;
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6VarA13 = uma.a(aVar, zx8Var);
                j = jM760getComposerMediaBackground0d7_KjU;
                j2 = jM687getBlack100d7_KjU;
                i9 = 6;
                aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarA13);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                bj4VarO.K(263351186);
                i10 = 0;
                i11 = 0;
                while (r3.hasNext()) {
                    i12 = i10 + 1;
                    if (i10 < 0) {
                        ws0.m();
                        throw null;
                    }
                    rowLayout = (RowLayout) obj;
                    if (i10 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i10 == listCalculateMediaLayout.size() - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rowLayout instanceof RowLayout.SingleFullWidth) {
                        bj4VarO.K(1374402462);
                        mediaItem2 = list.get(i11);
                        zx8 mediaShapeForPosition115 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                        Block block115 = mediaItem2.getBlock();
                        boolean zIsVideo115 = mediaItem2.isVideo();
                        if (mediaItem2.isVideo()) {
                            oh4Var11 = oh4Var6;
                        } else {
                            oh4Var11 = oh4Var7;
                        }
                        j3 = j2;
                        j4 = j;
                        bj4 bj4Var117 = bj4VarO;
                        m284SingleMediaItemSnr_uVM(block115, zIsVideo115, mediaShapeForPosition115, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var117, 12779520, 0);
                        bj4Var2 = bj4Var117;
                        i11++;
                        bj4Var2.U(false);
                        i14 = 6;
                    } else {
                        bj4Var2 = bj4VarO;
                        z3 = z2;
                        j3 = j2;
                        if (!(rowLayout instanceof RowLayout.Grid)) {
                            bj4Var2.K(875619194);
                            bj4Var2.U(false);
                            u.b();
                            return;
                        }
                        bj4Var2.K(1375596737);
                        ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                        iHashCode3 = Long.hashCode(bj4Var2.T);
                        kw7VarP3 = bj4Var2.P();
                        ox6VarC3 = it1.c(bj4Var2, aVar);
                        bt1.c.getClass();
                        z4 = true;
                        aVar3 = bt1.a.b;
                        if (j1bVar == null) {
                            ml5.c();
                            throw null;
                        }
                        bj4Var2.q();
                        if (bj4Var2.S) {
                            bj4Var2.k(aVar3);
                        } else {
                            bj4Var2.z();
                        }
                        rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                        rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                        rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                        rd7.c(bj4Var2, bt1.a.h);
                        rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                        bj4Var2.K(-1976324612);
                        grid = (RowLayout.Grid) rowLayout;
                        columns = grid.getColumns();
                        i13 = 0;
                        while (i13 < columns) {
                            mediaItem = list.get(i11);
                            if (i13 == 0) {
                                z5 = z4;
                            } else {
                                z5 = false;
                            }
                            if (i13 == grid.getColumns() - 1) {
                                z6 = z4;
                            } else {
                                z6 = false;
                            }
                            if (z) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (z3) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (z3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            zx8 mediaShapeForPosition116 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                            int i11112 = i13;
                            Block block116 = mediaItem.getBlock();
                            boolean z1115 = z;
                            boolean zIsVideo116 = mediaItem.isVideo();
                            if (mediaItem.isVideo()) {
                                oh4Var10 = oh4Var6;
                            } else {
                                oh4Var10 = oh4Var7;
                            }
                            boolean z1116 = z4;
                            long j17 = j;
                            bj4 bj4Var118 = bj4Var2;
                            m284SingleMediaItemSnr_uVM(block116, zIsVideo116, mediaShapeForPosition116, j17, j3, 1.0f, oh4Var10, m40.a(new qs5(z1116, 1.0f)), bj4Var118, 196608, 0);
                            bj4Var2 = bj4Var118;
                            i11++;
                            i13 = i11112 + 1;
                            z = z1115;
                            z4 = z1116;
                            j = j17;
                            grid = grid;
                        }
                        j4 = j;
                        i14 = 6;
                        bj4Var2.U(false);
                        bj4Var2.U(z4);
                        bj4Var2.U(false);
                        g2b g2bVar13 = g2b.a;
                    }
                    bj4VarO = bj4Var2;
                    j = j4;
                    j2 = j3;
                    i10 = i12;
                    i9 = i14;
                }
                bj4Var = bj4VarO;
                bj4Var.U(false);
                bj4Var.U(true);
                bj4Var.U(true);
                ox6Var4 = ox6Var3;
                oh4Var8 = oh4Var6;
                oh4Var9 = oh4Var7;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ip4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return GroupedMediaKt.GroupedMedia$lambda$9(list, zx8Var, ox6Var4, oh4Var9, oh4Var8, i, i2, (jt1) obj2, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        oh4Var4 = oh4Var2;
        if ((i3 & 9363) == 9362) {
            aVar = ox6.a.t;
            if (i16 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            c0187a = jt1.a.a;
            if (i4 != 0) {
                bj4VarO.K(-79072205);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new m12(i15);
                    bj4VarO.C(objF2);
                }
                oh4Var5 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var5 = oh4Var3;
            }
            i8 = 1;
            if (i6 != 0) {
                bj4VarO.K(-79070893);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new n12(i8);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                oh4Var6 = (oh4) objF;
            } else {
                oh4Var6 = oh4Var4;
            }
            IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
            int i11113 = IntercomTheme.$stable;
            jM687getBlack100d7_KjU = intercomTheme14.getColors(bj4VarO, i11113).getAlpha().m687getBlack100d7_KjU();
            jM760getComposerMediaBackground0d7_KjU = intercomTheme14.getColors(bj4VarO, i11113).m760getComposerMediaBackground0d7_KjU();
            listCalculateMediaLayout = calculateMediaLayout(list.size());
            ox6 ox6VarR14 = ir9.r(ox6Var3);
            fl6VarD = dv0.d(di.a.c, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarR14);
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
            Integer numValueOf14 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf14);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            oh4Var7 = oh4Var5;
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6VarA14 = uma.a(aVar, zx8Var);
            j = jM760getComposerMediaBackground0d7_KjU;
            j2 = jM687getBlack100d7_KjU;
            i9 = 6;
            aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarA14);
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
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            bj4VarO.K(263351186);
            i10 = 0;
            i11 = 0;
            while (r3.hasNext()) {
                i12 = i10 + 1;
                if (i10 < 0) {
                    ws0.m();
                    throw null;
                }
                rowLayout = (RowLayout) obj;
                if (i10 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i10 == listCalculateMediaLayout.size() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rowLayout instanceof RowLayout.SingleFullWidth) {
                    bj4VarO.K(1374402462);
                    mediaItem2 = list.get(i11);
                    zx8 mediaShapeForPosition117 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                    Block block117 = mediaItem2.getBlock();
                    boolean zIsVideo117 = mediaItem2.isVideo();
                    if (mediaItem2.isVideo()) {
                        oh4Var11 = oh4Var6;
                    } else {
                        oh4Var11 = oh4Var7;
                    }
                    j3 = j2;
                    j4 = j;
                    bj4 bj4Var119 = bj4VarO;
                    m284SingleMediaItemSnr_uVM(block117, zIsVideo117, mediaShapeForPosition117, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var119, 12779520, 0);
                    bj4Var2 = bj4Var119;
                    i11++;
                    bj4Var2.U(false);
                    i14 = 6;
                } else {
                    bj4Var2 = bj4VarO;
                    z3 = z2;
                    j3 = j2;
                    if (!(rowLayout instanceof RowLayout.Grid)) {
                        bj4Var2.K(875619194);
                        bj4Var2.U(false);
                        u.b();
                        return;
                    }
                    bj4Var2.K(1375596737);
                    ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                    iHashCode3 = Long.hashCode(bj4Var2.T);
                    kw7VarP3 = bj4Var2.P();
                    ox6VarC3 = it1.c(bj4Var2, aVar);
                    bt1.c.getClass();
                    z4 = true;
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var2.q();
                    if (bj4Var2.S) {
                        bj4Var2.k(aVar3);
                    } else {
                        bj4Var2.z();
                    }
                    rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                    rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                    rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                    rd7.c(bj4Var2, bt1.a.h);
                    rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                    bj4Var2.K(-1976324612);
                    grid = (RowLayout.Grid) rowLayout;
                    columns = grid.getColumns();
                    i13 = 0;
                    while (i13 < columns) {
                        mediaItem = list.get(i11);
                        if (i13 == 0) {
                            z5 = z4;
                        } else {
                            z5 = false;
                        }
                        if (i13 == grid.getColumns() - 1) {
                            z6 = z4;
                        } else {
                            z6 = false;
                        }
                        if (z) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        if (z) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z3) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z3) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        zx8 mediaShapeForPosition118 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                        int i11114 = i13;
                        Block block118 = mediaItem.getBlock();
                        boolean z1117 = z;
                        boolean zIsVideo118 = mediaItem.isVideo();
                        if (mediaItem.isVideo()) {
                            oh4Var10 = oh4Var6;
                        } else {
                            oh4Var10 = oh4Var7;
                        }
                        boolean z1118 = z4;
                        long j18 = j;
                        bj4 bj4Var1110 = bj4Var2;
                        m284SingleMediaItemSnr_uVM(block118, zIsVideo118, mediaShapeForPosition118, j18, j3, 1.0f, oh4Var10, m40.a(new qs5(z1118, 1.0f)), bj4Var1110, 196608, 0);
                        bj4Var2 = bj4Var1110;
                        i11++;
                        i13 = i11114 + 1;
                        z = z1117;
                        z4 = z1118;
                        j = j18;
                        grid = grid;
                    }
                    j4 = j;
                    i14 = 6;
                    bj4Var2.U(false);
                    bj4Var2.U(z4);
                    bj4Var2.U(false);
                    g2b g2bVar14 = g2b.a;
                }
                bj4VarO = bj4Var2;
                j = j4;
                j2 = j3;
                i10 = i12;
                i9 = i14;
            }
            bj4Var = bj4VarO;
            bj4Var.U(false);
            bj4Var.U(true);
            bj4Var.U(true);
            ox6Var4 = ox6Var3;
            oh4Var8 = oh4Var6;
            oh4Var9 = oh4Var7;
        } else {
            aVar = ox6.a.t;
            if (i16 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            c0187a = jt1.a.a;
            if (i4 != 0) {
                bj4VarO.K(-79072205);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = new m12(i15);
                    bj4VarO.C(objF2);
                }
                oh4Var5 = (oh4) objF2;
                bj4VarO.U(false);
            } else {
                oh4Var5 = oh4Var3;
            }
            i8 = 1;
            if (i6 != 0) {
                bj4VarO.K(-79070893);
                objF = bj4VarO.f();
                if (objF == c0187a) {
                    objF = new n12(i8);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                oh4Var6 = (oh4) objF;
            } else {
                oh4Var6 = oh4Var4;
            }
            IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
            int i11115 = IntercomTheme.$stable;
            jM687getBlack100d7_KjU = intercomTheme15.getColors(bj4VarO, i11115).getAlpha().m687getBlack100d7_KjU();
            jM760getComposerMediaBackground0d7_KjU = intercomTheme15.getColors(bj4VarO, i11115).m760getComposerMediaBackground0d7_KjU();
            listCalculateMediaLayout = calculateMediaLayout(list.size());
            ox6 ox6VarR15 = ir9.r(ox6Var3);
            fl6VarD = dv0.d(di.a.c, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarR15);
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
            Integer numValueOf15 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf15);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            oh4Var7 = oh4Var5;
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6VarA15 = uma.a(aVar, zx8Var);
            j = jM760getComposerMediaBackground0d7_KjU;
            j2 = jM687getBlack100d7_KjU;
            i9 = 6;
            aj1VarA = yi1.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.m, bj4VarO, 6);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarA15);
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
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            bj4VarO.K(263351186);
            i10 = 0;
            i11 = 0;
            while (r3.hasNext()) {
                i12 = i10 + 1;
                if (i10 < 0) {
                    ws0.m();
                    throw null;
                }
                rowLayout = (RowLayout) obj;
                if (i10 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i10 == listCalculateMediaLayout.size() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rowLayout instanceof RowLayout.SingleFullWidth) {
                    bj4VarO.K(1374402462);
                    mediaItem2 = list.get(i11);
                    zx8 mediaShapeForPosition119 = getMediaShapeForPosition(z, z, z2, z2, zx8Var);
                    Block block119 = mediaItem2.getBlock();
                    boolean zIsVideo119 = mediaItem2.isVideo();
                    if (mediaItem2.isVideo()) {
                        oh4Var11 = oh4Var6;
                    } else {
                        oh4Var11 = oh4Var7;
                    }
                    j3 = j2;
                    j4 = j;
                    bj4 bj4Var1111 = bj4VarO;
                    m284SingleMediaItemSnr_uVM(block119, zIsVideo119, mediaShapeForPosition119, j4, j3, 1.0f, oh4Var11, m40.a(ir9.c(aVar, 1.0f)), bj4Var1111, 12779520, 0);
                    bj4Var2 = bj4Var1111;
                    i11++;
                    bj4Var2.U(false);
                    i14 = 6;
                } else {
                    bj4Var2 = bj4VarO;
                    z3 = z2;
                    j3 = j2;
                    if (!(rowLayout instanceof RowLayout.Grid)) {
                        bj4Var2.K(875619194);
                        bj4Var2.U(false);
                        u.b();
                        return;
                    }
                    bj4Var2.K(1375596737);
                    ny8VarA = ly8.a(new c30.h(LazyMessageListKt.getGroupedMessageGap(), true, new a30()), di.a.j, bj4Var2, i9);
                    iHashCode3 = Long.hashCode(bj4Var2.T);
                    kw7VarP3 = bj4Var2.P();
                    ox6VarC3 = it1.c(bj4Var2, aVar);
                    bt1.c.getClass();
                    z4 = true;
                    aVar3 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var2.q();
                    if (bj4Var2.S) {
                        bj4Var2.k(aVar3);
                    } else {
                        bj4Var2.z();
                    }
                    rd7.d(bj4Var2, bt1.a.f, ny8VarA);
                    rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                    rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                    rd7.c(bj4Var2, bt1.a.h);
                    rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                    bj4Var2.K(-1976324612);
                    grid = (RowLayout.Grid) rowLayout;
                    columns = grid.getColumns();
                    i13 = 0;
                    while (i13 < columns) {
                        mediaItem = list.get(i11);
                        if (i13 == 0) {
                            z5 = z4;
                        } else {
                            z5 = false;
                        }
                        if (i13 == grid.getColumns() - 1) {
                            z6 = z4;
                        } else {
                            z6 = false;
                        }
                        if (z) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        if (z) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z3) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z3) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        zx8 mediaShapeForPosition1110 = getMediaShapeForPosition(z7, z8, z9, z10, zx8Var);
                        int i11116 = i13;
                        Block block1110 = mediaItem.getBlock();
                        boolean z1119 = z;
                        boolean zIsVideo1110 = mediaItem.isVideo();
                        if (mediaItem.isVideo()) {
                            oh4Var10 = oh4Var6;
                        } else {
                            oh4Var10 = oh4Var7;
                        }
                        boolean z11110 = z4;
                        long j19 = j;
                        bj4 bj4Var1112 = bj4Var2;
                        m284SingleMediaItemSnr_uVM(block1110, zIsVideo1110, mediaShapeForPosition1110, j19, j3, 1.0f, oh4Var10, m40.a(new qs5(z11110, 1.0f)), bj4Var1112, 196608, 0);
                        bj4Var2 = bj4Var1112;
                        i11++;
                        i13 = i11116 + 1;
                        z = z1119;
                        z4 = z11110;
                        j = j19;
                        grid = grid;
                    }
                    j4 = j;
                    i14 = 6;
                    bj4Var2.U(false);
                    bj4Var2.U(z4);
                    bj4Var2.U(false);
                    g2b g2bVar15 = g2b.a;
                }
                bj4VarO = bj4Var2;
                j = j4;
                j2 = j3;
                i10 = i12;
                i9 = i14;
            }
            bj4Var = bj4VarO;
            bj4Var.U(false);
            bj4Var.U(true);
            bj4Var.U(true);
            ox6Var4 = ox6Var3;
            oh4Var8 = oh4Var6;
            oh4Var9 = oh4Var7;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ip4
                @Override // defpackage.ci4
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return GroupedMediaKt.GroupedMedia$lambda$9(list, zx8Var, ox6Var4, oh4Var9, oh4Var8, i, i2, (jt1) obj2, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedMedia$lambda$1$lambda$0(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedMedia$lambda$3$lambda$2(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedMedia$lambda$9(List list, zx8 zx8Var, ox6 ox6Var, oh4 oh4Var, oh4 oh4Var2, int i, int i2, jt1 jt1Var, int i3) {
        GroupedMedia(list, zx8Var, ox6Var, oh4Var, oh4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void GroupedMediaWith10MixedItemsPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(254529965);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GroupedMediaKt.INSTANCE.m248getLambda18$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new kp4(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedMediaWith10MixedItemsPreview$lambda$27(int i, jt1 jt1Var, int i2) {
        GroupedMediaWith10MixedItemsPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void GroupedMediaWith1ImagePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1318349613);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GroupedMediaKt.INSTANCE.m249getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new pp4(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedMediaWith1ImagePreview$lambda$19(int i, jt1 jt1Var, int i2) {
        GroupedMediaWith1ImagePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void GroupedMediaWith1VideoPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-3964941);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GroupedMediaKt.INSTANCE.m251getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new lp4(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedMediaWith1VideoPreview$lambda$20(int i, jt1 jt1Var, int i2) {
        GroupedMediaWith1VideoPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void GroupedMediaWith2ImagesPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1377228095);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GroupedMediaKt.INSTANCE.m253getLambda6$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new op4(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedMediaWith2ImagesPreview$lambda$21(int i, jt1 jt1Var, int i2) {
        GroupedMediaWith2ImagesPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void GroupedMediaWith3ImagesPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1786952576);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GroupedMediaKt.INSTANCE.m255getLambda8$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ed1(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedMediaWith3ImagesPreview$lambda$22(int i, jt1 jt1Var, int i2) {
        GroupedMediaWith3ImagesPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void GroupedMediaWith4MixedItemsPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(2015086798);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GroupedMediaKt.INSTANCE.m240getLambda10$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new np4(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedMediaWith4MixedItemsPreview$lambda$23(int i, jt1 jt1Var, int i2) {
        GroupedMediaWith4MixedItemsPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void GroupedMediaWith5MixedItemsPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1203327089);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GroupedMediaKt.INSTANCE.m242getLambda12$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new i12(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedMediaWith5MixedItemsPreview$lambda$24(int i, jt1 jt1Var, int i2) {
        GroupedMediaWith5MixedItemsPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void GroupedMediaWith6MixedItemsPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-126773680);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GroupedMediaKt.INSTANCE.m244getLambda14$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new w30(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedMediaWith6MixedItemsPreview$lambda$25(int i, jt1 jt1Var, int i2) {
        GroupedMediaWith6MixedItemsPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void GroupedMediaWith7MixedItemsPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(949779729);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$GroupedMediaKt.INSTANCE.m246getLambda16$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: jp4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return GroupedMediaKt.GroupedMediaWith7MixedItemsPreview$lambda$26(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GroupedMediaWith7MixedItemsPreview$lambda$26(int i, jt1 jt1Var, int i2) {
        GroupedMediaWith7MixedItemsPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void SingleImage(final Block block, final oh4<? super String, g2b> oh4Var, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        ox6 ox6Var3;
        boolean z;
        boolean zJ;
        Object objF;
        String text;
        final ox6 ox6Var4;
        xj8 xj8VarW;
        block.getClass();
        oh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-1149784997);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(block) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                bj4VarO.K(668744382);
                if ((i3 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                zJ = z | bj4VarO.j(block);
                objF = bj4VarO.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new mh4() { // from class: hp4
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return GroupedMediaKt.SingleImage$lambda$16$lambda$15(oh4Var, block);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                ox6 ox6VarC = we1.c(ox6Var3, false, null, (mh4) objF, 15);
                y0a y0aVar = AndroidCompositionLocals_androidKt.b;
                k85.a aVar = new k85.a((Context) bj4VarO.F(y0aVar));
                aVar.c = block.getUrl();
                aVar.b();
                aVar.c(R.drawable.intercom_image_load_failed);
                k85 k85VarA = aVar.a();
                b85 imageLoader = IntercomImageLoaderKt.getImageLoader((Context) bj4VarO.F(y0aVar));
                bj4VarO.K(668754697);
                text = block.getText();
                if (z2a.w(text)) {
                    text = nr1.f(bj4VarO, R.string.intercom_image_attached);
                }
                bj4VarO.U(false);
                d50.b(k85VarA, text, imageLoader, ox6VarC, null, nz1.a.a, null, bj4VarO, 12582912, 8048);
                ox6Var4 = ox6Var3;
            } else {
                bj4VarO.u();
                ox6Var4 = ox6Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: mp4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return GroupedMediaKt.SingleImage$lambda$18(block, oh4Var, ox6Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        if ((i3 & 147) == 146) {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            bj4VarO.K(668744382);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            zJ = z | bj4VarO.j(block);
            objF = bj4VarO.f();
            if (zJ) {
                objF = new mh4() { // from class: hp4
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return GroupedMediaKt.SingleImage$lambda$16$lambda$15(oh4Var, block);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: hp4
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return GroupedMediaKt.SingleImage$lambda$16$lambda$15(oh4Var, block);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarC2 = we1.c(ox6Var3, false, null, (mh4) objF, 15);
            y0a y0aVar2 = AndroidCompositionLocals_androidKt.b;
            k85.a aVar2 = new k85.a((Context) bj4VarO.F(y0aVar2));
            aVar2.c = block.getUrl();
            aVar2.b();
            aVar2.c(R.drawable.intercom_image_load_failed);
            k85 k85VarA2 = aVar2.a();
            b85 imageLoader2 = IntercomImageLoaderKt.getImageLoader((Context) bj4VarO.F(y0aVar2));
            bj4VarO.K(668754697);
            text = block.getText();
            if (z2a.w(text)) {
                text = nr1.f(bj4VarO, R.string.intercom_image_attached);
            }
            bj4VarO.U(false);
            d50.b(k85VarA2, text, imageLoader2, ox6VarC2, null, nz1.a.a, null, bj4VarO, 12582912, 8048);
            ox6Var4 = ox6Var3;
        } else {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            bj4VarO.K(668744382);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            zJ = z | bj4VarO.j(block);
            objF = bj4VarO.f();
            if (zJ) {
                objF = new mh4() { // from class: hp4
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return GroupedMediaKt.SingleImage$lambda$16$lambda$15(oh4Var, block);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: hp4
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return GroupedMediaKt.SingleImage$lambda$16$lambda$15(oh4Var, block);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            ox6 ox6VarC3 = we1.c(ox6Var3, false, null, (mh4) objF, 15);
            y0a y0aVar3 = AndroidCompositionLocals_androidKt.b;
            k85.a aVar3 = new k85.a((Context) bj4VarO.F(y0aVar3));
            aVar3.c = block.getUrl();
            aVar3.b();
            aVar3.c(R.drawable.intercom_image_load_failed);
            k85 k85VarA3 = aVar3.a();
            b85 imageLoader3 = IntercomImageLoaderKt.getImageLoader((Context) bj4VarO.F(y0aVar3));
            bj4VarO.K(668754697);
            text = block.getText();
            if (z2a.w(text)) {
                text = nr1.f(bj4VarO, R.string.intercom_image_attached);
            }
            bj4VarO.U(false);
            d50.b(k85VarA3, text, imageLoader3, ox6VarC3, null, nz1.a.a, null, bj4VarO, 12582912, 8048);
            ox6Var4 = ox6Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: mp4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return GroupedMediaKt.SingleImage$lambda$18(block, oh4Var, ox6Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SingleImage$lambda$16$lambda$15(oh4 oh4Var, Block block) {
        String url = block.getUrl();
        url.getClass();
        oh4Var.invoke(url);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SingleImage$lambda$18(Block block, oh4 oh4Var, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        SingleImage(block, oh4Var, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0181  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:112:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:116:0x020a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0222  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:96:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x013a  */
    /* JADX WARN: Code duplicated, block: B:99:0x013e  */
    /* JADX INFO: renamed from: SingleMediaItem-Snr_uVM, reason: not valid java name */
    private static final void m284SingleMediaItemSnr_uVM(final Block block, final boolean z, final zx8 zx8Var, final long j, final long j2, final float f, final oh4<? super String, g2b> oh4Var, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        Block block2;
        int i3;
        oh4<? super String, g2b> oh4Var2;
        ox6 ox6Var2;
        ox6.a aVar;
        ox6 ox6Var3;
        sp0 sp0Var;
        ox6 ox6Var4;
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
        bj4 bj4Var;
        boolean z2;
        final ox6 ox6Var5;
        IntercomTheme intercomTheme;
        int i4;
        fl6 fl6VarD2;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        xj8 xj8VarW;
        bj4 bj4VarO = jt1Var.o(-2147444412);
        j1b j1bVar = bj4VarO.a;
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.c(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.J(zx8Var) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bj4VarO.i(j) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= bj4VarO.i(j2) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= bj4VarO.g(f) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
            oh4Var2 = oh4Var;
        } else {
            oh4Var2 = oh4Var;
            if ((i & 1572864) == 0) {
                i3 |= bj4VarO.j(oh4Var2) ? 1048576 : 524288;
            }
        }
        int i5 = i2 & 128;
        if (i5 == 0) {
            if ((12582912 & i) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 8388608 : 4194304;
            }
            if ((i3 & 4793491) == 4793490 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i5 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                ox6 ox6VarA = ns0.a(uma.a(gi0.c(ox6Var3, j, zx8Var), zx8Var), f, j2, zx8Var);
                sp0Var = di.a.e;
                ox6Var4 = ox6Var3;
                fl6VarD = dv0.d(sp0Var, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarA);
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
                SingleImage(block2, oh4Var2, kv0.a.k(), bj4VarO, (i3 & 14) | ((i3 >> 15) & 112), 0);
                bj4Var = bj4VarO;
                bj4Var.K(-1294750345);
                if (z) {
                    ox6 ox6VarJ = ir9.j(aVar, 48.0f);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i4 = IntercomTheme.$stable;
                    ox6 ox6VarC3 = gi0.c(ox6VarJ, intercomTheme.getColors(bj4Var, i4).m761getComposerMediaPlayBackground0d7_KjU(), ay8.a);
                    fl6VarD2 = dv0.d(sp0Var, false);
                    iHashCode2 = Long.hashCode(bj4Var.T);
                    kw7VarP2 = bj4Var.P();
                    ox6VarC2 = it1.c(bj4Var, ox6VarC3);
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var.q();
                    if (bj4Var.S) {
                        bj4Var.k(aVar2);
                    } else {
                        bj4Var.z();
                    }
                    rd7.d(bj4Var, cVar, fl6VarD2);
                    rd7.d(bj4Var, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4Var, bVar, bj4Var, c0034a);
                    rd7.d(bj4Var, dVar, ox6VarC2);
                    m65.b(is7.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_play, bj4Var, 0), "Play Video", zf7.b(1.0f, 0.0f, ir9.j(aVar, 28.0f)), intercomTheme.getColors(bj4Var, i4).m763getComposerMediaUploadingForeground0d7_KjU(), bj4Var, 440, 0);
                    z2 = true;
                    bj4Var.U(true);
                } else {
                    z2 = true;
                }
                bj4Var.U(false);
                bj4Var.U(z2);
                ox6Var5 = ox6Var4;
            } else {
                bj4VarO.u();
                bj4Var = bj4VarO;
                ox6Var5 = ox6Var2;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: qp4
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return GroupedMediaKt.SingleMediaItem_Snr_uVM$lambda$14(block, z, zx8Var, j, j2, f, oh4Var, ox6Var5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 12582912;
        ox6Var2 = ox6Var;
        if ((i3 & 4793491) == 4793490) {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            ox6 ox6VarA2 = ns0.a(uma.a(gi0.c(ox6Var3, j, zx8Var), zx8Var), f, j2, zx8Var);
            sp0Var = di.a.e;
            ox6Var4 = ox6Var3;
            fl6VarD = dv0.d(sp0Var, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarA2);
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
            SingleImage(block2, oh4Var2, kv0.a.k(), bj4VarO, (i3 & 14) | ((i3 >> 15) & 112), 0);
            bj4Var = bj4VarO;
            bj4Var.K(-1294750345);
            if (z) {
                ox6 ox6VarJ2 = ir9.j(aVar, 48.0f);
                intercomTheme = IntercomTheme.INSTANCE;
                i4 = IntercomTheme.$stable;
                ox6 ox6VarC4 = gi0.c(ox6VarJ2, intercomTheme.getColors(bj4Var, i4).m761getComposerMediaPlayBackground0d7_KjU(), ay8.a);
                fl6VarD2 = dv0.d(sp0Var, false);
                iHashCode2 = Long.hashCode(bj4Var.T);
                kw7VarP2 = bj4Var.P();
                ox6VarC2 = it1.c(bj4Var, ox6VarC4);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    bj4Var.k(aVar2);
                } else {
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, fl6VarD2);
                rd7.d(bj4Var, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4Var, bVar, bj4Var, c0034a);
                rd7.d(bj4Var, dVar, ox6VarC2);
                m65.b(is7.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_play, bj4Var, 0), "Play Video", zf7.b(1.0f, 0.0f, ir9.j(aVar, 28.0f)), intercomTheme.getColors(bj4Var, i4).m763getComposerMediaUploadingForeground0d7_KjU(), bj4Var, 440, 0);
                z2 = true;
                bj4Var.U(true);
            } else {
                z2 = true;
            }
            bj4Var.U(false);
            bj4Var.U(z2);
            ox6Var5 = ox6Var4;
        } else {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            ox6 ox6VarA3 = ns0.a(uma.a(gi0.c(ox6Var3, j, zx8Var), zx8Var), f, j2, zx8Var);
            sp0Var = di.a.e;
            ox6Var4 = ox6Var3;
            fl6VarD = dv0.d(sp0Var, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarA3);
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
            SingleImage(block2, oh4Var2, kv0.a.k(), bj4VarO, (i3 & 14) | ((i3 >> 15) & 112), 0);
            bj4Var = bj4VarO;
            bj4Var.K(-1294750345);
            if (z) {
                ox6 ox6VarJ3 = ir9.j(aVar, 48.0f);
                intercomTheme = IntercomTheme.INSTANCE;
                i4 = IntercomTheme.$stable;
                ox6 ox6VarC5 = gi0.c(ox6VarJ3, intercomTheme.getColors(bj4Var, i4).m761getComposerMediaPlayBackground0d7_KjU(), ay8.a);
                fl6VarD2 = dv0.d(sp0Var, false);
                iHashCode2 = Long.hashCode(bj4Var.T);
                kw7VarP2 = bj4Var.P();
                ox6VarC2 = it1.c(bj4Var, ox6VarC5);
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var.q();
                if (bj4Var.S) {
                    bj4Var.k(aVar2);
                } else {
                    bj4Var.z();
                }
                rd7.d(bj4Var, cVar, fl6VarD2);
                rd7.d(bj4Var, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4Var, bVar, bj4Var, c0034a);
                rd7.d(bj4Var, dVar, ox6VarC2);
                m65.b(is7.a(io.intercom.android.sdk.ui.R.drawable.intercom_ic_play, bj4Var, 0), "Play Video", zf7.b(1.0f, 0.0f, ir9.j(aVar, 28.0f)), intercomTheme.getColors(bj4Var, i4).m763getComposerMediaUploadingForeground0d7_KjU(), bj4Var, 440, 0);
                z2 = true;
                bj4Var.U(true);
            } else {
                z2 = true;
            }
            bj4Var.U(false);
            bj4Var.U(z2);
            ox6Var5 = ox6Var4;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: qp4
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return GroupedMediaKt.SingleMediaItem_Snr_uVM$lambda$14(block, z, zx8Var, j, j2, f, oh4Var, ox6Var5, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SingleMediaItem_Snr_uVM$lambda$14(Block block, boolean z, zx8 zx8Var, long j, long j2, float f, oh4 oh4Var, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        m284SingleMediaItemSnr_uVM(block, z, zx8Var, j, j2, f, oh4Var, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final List<RowLayout> calculateMediaLayout(int i) {
        if (i == 0) {
            return hf3.t;
        }
        if (i == 4) {
            return ws0.i(new RowLayout.Grid(2), new RowLayout.Grid(2));
        }
        int i2 = i / 3;
        int i3 = i % 3;
        e96 e96VarF = ws0.f();
        for (int i4 = 0; i4 < i2; i4++) {
            e96VarF.add(new RowLayout.Grid(3));
        }
        if (i3 == 1) {
            e96VarF.add(RowLayout.SingleFullWidth.INSTANCE);
        } else if (i3 == 2) {
            e96VarF.add(new RowLayout.Grid(2));
        }
        return ws0.e(e96VarF);
    }

    private static final zx8 getMediaShapeForPosition(boolean z, boolean z2, boolean z3, boolean z4, zx8 zx8Var) {
        e72 z43Var = new z43(4.0f);
        e72 e72Var = z ? zx8Var.a : z43Var;
        e72 e72Var2 = z2 ? zx8Var.b : z43Var;
        e72 e72Var3 = z3 ? zx8Var.d : z43Var;
        if (z4) {
            z43Var = zx8Var.c;
        }
        return new zx8(e72Var, e72Var2, z43Var, e72Var3);
    }
}
