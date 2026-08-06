package io.intercom.android.sdk.m5.preview.ui;

import com.intercom.twig.BuildConfig;
import defpackage.a30;
import defpackage.al8;
import defpackage.ay8;
import defpackage.b72;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.bz5;
import defpackage.c30;
import defpackage.c33;
import defpackage.ci4;
import defpackage.di;
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
import defpackage.h37;
import defpackage.hf3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.jz0;
import defpackage.ko7;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.m78;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ns0;
import defpackage.ny8;
import defpackage.nz1;
import defpackage.nz5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oy0;
import defpackage.oy8;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.qz5;
import defpackage.rd7;
import defpackage.t72;
import defpackage.uh1;
import defpackage.uma;
import defpackage.wd3;
import defpackage.we1;
import defpackage.xj8;
import defpackage.ys5;
import defpackage.z2a;
import defpackage.zx8;
import defpackage.zy0;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.m5.preview.model.PreviewUiState;
import io.intercom.android.sdk.m5.preview.ui.PreviewBottomBarKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PreviewBottomBarKt {
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Code duplicated, block: B:64:0x0146  */
    /* JADX WARN: Code duplicated, block: B:67:0x0166  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x0186  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0203  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void PreviewBottomBar(ox6 ox6Var, final PreviewUiState previewUiState, final oh4<? super Integer, g2b> oh4Var, final mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        ox6.a aVar;
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
        ox6 ox6Var3;
        fl6 fl6VarD;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        String confirmationText;
        final ox6 ox6Var4;
        xj8 xj8VarW;
        previewUiState.getClass();
        oh4Var.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(1265800885);
        j1b j1bVar = bj4VarO.a;
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(previewUiState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i2 & 8) == 0) {
            if ((i & 3072) == 0) {
                i3 |= bj4VarO.j(mh4Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i4 != 0) {
                    ox6Var2 = aVar;
                }
                ox6 ox6VarI = eo7.i(gi0.c(ir9.d(ir9.c(ox6Var2, 1.0f), 100.0f), uh1.b(0.5f, uh1.b), al8.a), 16.0f);
                ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarI);
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
                bj4VarO.K(374923407);
                ox6Var3 = ox6Var2;
                qs5 qs5Var = new qs5(true, 1.0f);
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, qs5Var);
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
                bj4VarO.K(-1204940937);
                if (previewUiState.getFiles().size() > 1) {
                    ThumbnailList(previewUiState.getFiles(), previewUiState.getCurrentPage(), oh4Var, bj4VarO, i3 & 896);
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                confirmationText = previewUiState.getConfirmationText();
                if (confirmationText != null || z2a.w(confirmationText)) {
                    bj4VarO.U(false);
                } else {
                    ox6 ox6VarM = eo7.m(aVar, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i5 = IntercomTheme.$stable;
                    b72 b72Var = intercomTheme.getShapes(bj4VarO, i5).b;
                    ko7 ko7Var = zy0.a;
                    jz0.a(mh4Var, ox6VarM, false, b72Var, zy0.a(intercomTheme.getColors(bj4VarO, i5).m751getAction0d7_KjU(), 0L, 0L, 0L, bj4VarO, 14), null, null, null, gr1.b(-1096022047, new ei4<oy8, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewBottomBarKt$PreviewBottomBar$1$2
                        public final void invoke(oy8 oy8Var, jt1 jt1Var2, int i6) {
                            oy8Var.getClass();
                            if ((i6 & 17) == 16 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(previewUiState.getConfirmationText(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                            }
                        }

                        @Override // defpackage.ei4
                        public /* bridge */ /* synthetic */ g2b invoke(oy8 oy8Var, jt1 jt1Var2, Integer num) {
                            invoke(oy8Var, jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, ((i3 >> 9) & 14) | 805306416, 484);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(false);
                }
                bj4VarO.U(true);
                ox6Var4 = ox6Var3;
            } else {
                bj4VarO.u();
                ox6Var4 = ox6Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: q88
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return PreviewBottomBarKt.PreviewBottomBar$lambda$2(ox6Var4, previewUiState, oh4Var, mh4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        if ((i3 & 1171) == 1170) {
            aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var2 = aVar;
            }
            ox6 ox6VarI2 = eo7.i(gi0.c(ir9.d(ir9.c(ox6Var2, 1.0f), 100.0f), uh1.b(0.5f, uh1.b), al8.a), 16.0f);
            ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarI2);
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
            bj4VarO.K(374923407);
            ox6Var3 = ox6Var2;
            qs5 qs5Var2 = new qs5(true, 1.0f);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, qs5Var2);
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
            bj4VarO.K(-1204940937);
            if (previewUiState.getFiles().size() > 1) {
                ThumbnailList(previewUiState.getFiles(), previewUiState.getCurrentPage(), oh4Var, bj4VarO, i3 & 896);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            confirmationText = previewUiState.getConfirmationText();
            if (confirmationText != null) {
                bj4VarO.U(false);
            } else {
                bj4VarO.U(false);
            }
            bj4VarO.U(true);
            ox6Var4 = ox6Var3;
        } else {
            aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var2 = aVar;
            }
            ox6 ox6VarI3 = eo7.i(gi0.c(ir9.d(ir9.c(ox6Var2, 1.0f), 100.0f), uh1.b(0.5f, uh1.b), al8.a), 16.0f);
            ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarI3);
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
            bj4VarO.K(374923407);
            ox6Var3 = ox6Var2;
            qs5 qs5Var3 = new qs5(true, 1.0f);
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, qs5Var3);
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
            bj4VarO.K(-1204940937);
            if (previewUiState.getFiles().size() > 1) {
                ThumbnailList(previewUiState.getFiles(), previewUiState.getCurrentPage(), oh4Var, bj4VarO, i3 & 896);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            confirmationText = previewUiState.getConfirmationText();
            if (confirmationText != null) {
                bj4VarO.U(false);
            } else {
                bj4VarO.U(false);
            }
            bj4VarO.U(true);
            ox6Var4 = ox6Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: q88
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewBottomBarKt.PreviewBottomBar$lambda$2(ox6Var4, previewUiState, oh4Var, mh4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PreviewBottomBar$lambda$2(ox6 ox6Var, PreviewUiState previewUiState, oh4 oh4Var, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        PreviewBottomBar(ox6Var, previewUiState, oh4Var, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final void ThumbnailList(final List<? extends IntercomPreviewFile> list, final int i, final oh4<? super Integer, g2b> oh4Var, jt1 jt1Var, final int i2) {
        int i3;
        final nz5 nz5Var;
        bj4 bj4Var;
        bj4 bj4VarO = jt1Var.o(-1330621562);
        if ((i2 & 6) == 0) {
            i3 = (bj4VarO.j(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bj4VarO.h(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bj4VarO.j(oh4Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var = bj4VarO;
        } else {
            nz5 nz5VarA = qz5.a(0, bj4VarO, 0, 3);
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                c33 c33Var = wd3.a;
                objF = m78.a(bj4VarO.x(), bj4VarO);
            }
            final t72 t72Var = (t72) objF;
            bj4VarO.K(702750354);
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = bl7.i(hf3.t);
                bj4VarO.C(objF2);
            }
            final h37 h37Var = (h37) objF2;
            bj4VarO.U(false);
            bj4VarO.K(702753635);
            boolean zJ = bj4VarO.J(nz5VarA);
            Object objF3 = bj4VarO.f();
            if (zJ || objF3 == c0187a) {
                objF3 = new PreviewBottomBarKt$ThumbnailList$1$1(nz5VarA, h37Var, null);
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            wd3.d(bj4VarO, (ci4) objF3, BuildConfig.FLAVOR);
            ko7 ko7Var = new ko7(8.0f, 4.0f, 8.0f, 4.0f);
            bj4VarO.K(702768868);
            boolean zJ2 = ((i3 & 112) == 32) | bj4VarO.j(list) | ((i3 & 896) == 256) | bj4VarO.j(t72Var) | bj4VarO.J(nz5VarA);
            Object objF4 = bj4VarO.f();
            if (zJ2 || objF4 == c0187a) {
                nz5Var = nz5VarA;
                oh4 oh4Var2 = new oh4() { // from class: o88
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return PreviewBottomBarKt.ThumbnailList$lambda$9$lambda$8(list, h37Var, i, t72Var, oh4Var, nz5Var, (bz5) obj);
                    }
                };
                bj4VarO.C(oh4Var2);
                objF4 = oh4Var2;
            } else {
                nz5Var = nz5VarA;
            }
            bj4VarO.U(false);
            bj4Var = bj4VarO;
            ys5.b(ox6.a.t, nz5Var, ko7Var, c30.a, di.a.k, null, false, null, (oh4) objF4, bj4Var, 221574, 456);
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: p88
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return PreviewBottomBarKt.ThumbnailList$lambda$10(list, i, oh4Var, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ThumbnailList$lambda$10(List list, int i, oh4 oh4Var, int i2, jt1 jt1Var, int i3) {
        ThumbnailList(list, i, oh4Var, jt1Var, gz3.s(i2 | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ThumbnailList$lambda$9$lambda$8(final List list, h37 h37Var, final int i, t72 t72Var, final oh4 oh4Var, nz5 nz5Var, bz5 bz5Var) {
        bz5Var.getClass();
        bz5Var.a(list.size(), null, new oh4<Integer, Object>() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewBottomBarKt$ThumbnailList$lambda$9$lambda$8$$inlined$itemsIndexed$default$2
            @Override // defpackage.oh4
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i2) {
                list.get(i2);
                return null;
            }
        }, new fr1(true, 2039820996, new fi4<fv5, Integer, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewBottomBarKt$ThumbnailList$lambda$9$lambda$8$$inlined$itemsIndexed$default$3
            public final void invoke(fv5 fv5Var, final int i2, jt1 jt1Var, int i3) {
                int i4;
                if ((i3 & 6) == 0) {
                    i4 = (jt1Var.J(fv5Var) ? 4 : 2) | i3;
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= jt1Var.h(i2) ? 32 : 16;
                }
                boolean z = true;
                if (!jt1Var.A(i4 & 1, (i4 & 147) != 146)) {
                    jt1Var.u();
                    return;
                }
                IntercomPreviewFile intercomPreviewFile = (IntercomPreviewFile) list.get(i2);
                jt1Var.K(1711032760);
                long j = i == i2 ? uh1.e : uh1.j;
                zx8 zx8VarA = ay8.a(10);
                ox6.a aVar = ox6.a.t;
                ox6 ox6VarI = eo7.i(ns0.a(aVar, 2.0f, j, zx8VarA), 4.0f);
                jt1Var.K(2133413120);
                boolean zJ = jt1Var.J(oh4Var);
                if ((((i4 & 112) ^ 48) <= 32 || !jt1Var.h(i2)) && (i4 & 48) != 32) {
                    z = false;
                }
                boolean z2 = zJ | z;
                Object objF = jt1Var.f();
                if (z2 || objF == jt1.a.a) {
                    final oh4 oh4Var2 = oh4Var;
                    objF = new mh4<g2b>() { // from class: io.intercom.android.sdk.m5.preview.ui.PreviewBottomBarKt$ThumbnailList$2$1$1$1$1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            oh4Var2.invoke(Integer.valueOf(i2));
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
                ox6 ox6VarC = we1.c(ox6VarI, false, null, (mh4) objF, 15);
                fl6 fl6VarD = dv0.d(di.a.a, false);
                int iHashCode = Long.hashCode(jt1Var.v());
                kw7 kw7VarY = jt1Var.y();
                ox6 ox6VarC2 = it1.c(jt1Var, ox6VarC);
                bt1.c.getClass();
                qr5.a aVar2 = bt1.a.b;
                if (jt1Var.s() == null) {
                    ml5.c();
                    throw null;
                }
                jt1Var.q();
                if (jt1Var.l()) {
                    jt1Var.k(aVar2);
                } else {
                    jt1Var.z();
                }
                rd7.d(jt1Var, bt1.a.f, fl6VarD);
                rd7.d(jt1Var, bt1.a.e, kw7VarY);
                rd7.d(jt1Var, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(jt1Var, bt1.a.h);
                rd7.d(jt1Var, bt1.a.d, ox6VarC2);
                PreviewUriKt.ThumbnailPreview(uma.a(ir9.j(aVar, 48.0f), ay8.a(10)), nz1.a.a, intercomPreviewFile, jt1Var, 48, 0);
                jt1Var.I();
                jt1Var.B();
            }

            @Override // defpackage.fi4
            public /* bridge */ /* synthetic */ g2b invoke(fv5 fv5Var, Integer num, jt1 jt1Var, Integer num2) {
                invoke(fv5Var, num.intValue(), jt1Var, num2.intValue());
                return g2b.a;
            }
        }));
        if (!((List) h37Var.getValue()).contains(Integer.valueOf(i))) {
            oy0.d(t72Var, null, null, new PreviewBottomBarKt$ThumbnailList$2$1$2(nz5Var, i, null), 3);
        }
        return g2b.a;
    }
}
