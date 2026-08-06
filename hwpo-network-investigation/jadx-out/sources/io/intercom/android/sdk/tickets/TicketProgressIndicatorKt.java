package io.intercom.android.sdk.tickets;

import defpackage.a30;
import defpackage.aa0;
import defpackage.ae8;
import defpackage.ay8;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ca3;
import defpackage.cc5;
import defpackage.ci4;
import defpackage.cza;
import defpackage.d73;
import defpackage.di;
import defpackage.do2;
import defpackage.dp0;
import defpackage.dza;
import defpackage.g2b;
import defpackage.gp5;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jc1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.ub5;
import defpackage.uh1;
import defpackage.uma;
import defpackage.w29;
import defpackage.wb5;
import defpackage.wi1;
import defpackage.xi1;
import defpackage.xj8;
import defpackage.xv;
import io.intercom.android.sdk.tickets.TicketProgressIndicatorKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketProgressIndicatorKt {
    /* JADX WARN: Code duplicated, block: B:40:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0170  */
    /* JADX WARN: Code duplicated, block: B:60:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x017c  */
    /* JADX WARN: Code duplicated, block: B:64:0x018c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX WARN: Code duplicated, block: B:68:0x019c  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x0227  */
    /* JADX WARN: Code duplicated, block: B:81:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x024d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0261  */
    /* JADX WARN: Code duplicated, block: B:86:0x026b  */
    /* JADX WARN: Code duplicated, block: B:91:0x029e  */
    /* JADX WARN: Code duplicated, block: B:93:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: TicketProgressIndicator-3IgeMak, reason: not valid java name */
    public static final void m526TicketProgressIndicator3IgeMak(final List<TicketTimelineCardState.ProgressSection> list, final long j, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        List<TicketTimelineCardState.ProgressSection> list2;
        int i3;
        ox6 ox6Var2;
        ox6 ox6Var3;
        wb5 wb5VarC;
        long jM764getDisabled0d7_KjU;
        int i4;
        ny8 ny8VarA;
        ox6 ox6Var4;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar;
        final ox6 ox6Var5;
        boolean zIsLoading;
        jt1.a.C0187a c0187a;
        long j2;
        boolean z;
        float fFloatValue;
        final float f;
        char c;
        long j3;
        boolean zG;
        Object objF;
        Object objB;
        int i5;
        boolean z2;
        final long j4;
        boolean zI;
        Object objF2;
        Object objF3;
        Object objF4;
        xj8 xj8VarW;
        list.getClass();
        bj4 bj4VarO = jt1Var.o(484493125);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            list2 = list;
        } else if ((i & 6) == 0) {
            list2 = list;
            i3 = (bj4VarO.j(list2) ? 4 : 2) | i;
        } else {
            list2 = list;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.i(j) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                wb5VarC = cc5.c("Infinite progress animation", bj4VarO, 0);
                jM764getDisabled0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m764getDisabled0d7_KjU();
                i4 = 1;
                c30.h hVar = new c30.h(4.0f, true, new a30());
                ox6 ox6VarA = uma.a(ir9.c(ox6Var3, 1.0f), ay8.a(50));
                ny8VarA = ly8.a(hVar, di.a.j, bj4VarO, 6);
                ox6Var4 = ox6Var3;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarA);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(1767069389);
                for (TicketTimelineCardState.ProgressSection progressSection : list2) {
                    bj4VarO.K(1767070266);
                    zIsLoading = progressSection.isLoading();
                    c0187a = jt1.a.a;
                    if (zIsLoading) {
                        bj4VarO.K(1463837930);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new w29(i4);
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        gp5.b bVar = new gp5.b();
                        ((oh4) objF4).invoke(bVar);
                        j2 = jM764getDisabled0d7_KjU;
                        z = false;
                        fFloatValue = ((Number) cc5.a(wb5VarC, 0.0f, 1.0f, xv.a(new gp5(bVar), null, 6), "Progress value animation", bj4VarO, 29112, 0).w.getValue()).floatValue();
                    } else {
                        j2 = jM764getDisabled0d7_KjU;
                        z = false;
                        if (progressSection.isDone()) {
                            fFloatValue = 1.0f;
                        } else {
                            fFloatValue = 0.0f;
                        }
                    }
                    bj4VarO.U(z);
                    bj4VarO.K(1767091849);
                    if (progressSection.isLoading()) {
                        bj4VarO.K(1463860081);
                        if ((i3 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        j4 = j2;
                        zI = z2 | bj4VarO.i(j4);
                        objF2 = bj4VarO.f();
                        if (zI || objF2 == c0187a) {
                            objF2 = new oh4() { // from class: ema
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$3$lambda$2(j, j4, (gp5.b) obj);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(z);
                        gp5.b bVar2 = new gp5.b();
                        ((oh4) objF2).invoke(bVar2);
                        ub5 ub5VarA = xv.a(new gp5(bVar2), null, 6);
                        int i7 = ((i3 << 3) & 896) | 28680;
                        objF3 = bj4VarO.f();
                        if (objF3 == c0187a) {
                            int i8 = uh1.l;
                            objF3 = new dza(wi1.u, new xi1(uh1.f(j)));
                            bj4VarO.C(objF3);
                        }
                        j2 = j4;
                        int i9 = (i7 & 896) | 229384;
                        float f2 = fFloatValue;
                        bj4 bj4Var = bj4VarO;
                        f = f2;
                        c = 6;
                        bj4VarO = bj4Var;
                        j3 = ((uh1) cc5.b(wb5VarC, new uh1(j4), new uh1(j), (cza) objF3, ub5VarA, "Color value animation", bj4Var, i9).w.getValue()).a;
                    } else {
                        f = fFloatValue;
                        c = 6;
                        j3 = j;
                    }
                    bj4VarO.U(false);
                    qs5 qs5Var = new qs5(true, 1.0f);
                    bj4VarO.K(1463876813);
                    zG = bj4VarO.g(f);
                    objF = bj4VarO.f();
                    if (zG || objF == c0187a) {
                        objF = new mh4() { // from class: fma
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Float.valueOf(TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$5$lambda$4(f));
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    mh4 mh4Var = (mh4) objF;
                    objB = aa0.b(bj4VarO, false, 1463883739);
                    if (objB == c0187a) {
                        i5 = 2;
                        objB = new dp0(i5);
                        bj4VarO.C(objB);
                    } else {
                        i5 = 2;
                    }
                    bj4VarO.U(false);
                    bj4 bj4Var2 = bj4VarO;
                    long j5 = j2;
                    ae8.b(mh4Var, qs5Var, j3, j5, 2, 0.0f, (oh4) objB, bj4Var2, 1769472);
                    jM764getDisabled0d7_KjU = j5;
                    bj4VarO = bj4Var2;
                    wb5VarC = wb5VarC;
                    i4 = 1;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                ox6Var5 = ox6Var4;
            } else {
                bj4VarO.u();
                ox6Var5 = ox6Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: gma
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$10(list, j, ox6Var5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        if ((i3 & 147) == 146) {
            if (i6 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            wb5VarC = cc5.c("Infinite progress animation", bj4VarO, 0);
            jM764getDisabled0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m764getDisabled0d7_KjU();
            i4 = 1;
            c30.h hVar2 = new c30.h(4.0f, true, new a30());
            ox6 ox6VarA2 = uma.a(ir9.c(ox6Var3, 1.0f), ay8.a(50));
            ny8VarA = ly8.a(hVar2, di.a.j, bj4VarO, 6);
            ox6Var4 = ox6Var3;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarA2);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(1767069389);
            while (r21.hasNext()) {
                bj4VarO.K(1767070266);
                zIsLoading = progressSection.isLoading();
                c0187a = jt1.a.a;
                if (zIsLoading) {
                    bj4VarO.K(1463837930);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new w29(i4);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    gp5.b bVar3 = new gp5.b();
                    ((oh4) objF4).invoke(bVar3);
                    j2 = jM764getDisabled0d7_KjU;
                    z = false;
                    fFloatValue = ((Number) cc5.a(wb5VarC, 0.0f, 1.0f, xv.a(new gp5(bVar3), null, 6), "Progress value animation", bj4VarO, 29112, 0).w.getValue()).floatValue();
                } else {
                    j2 = jM764getDisabled0d7_KjU;
                    z = false;
                    if (progressSection.isDone()) {
                        fFloatValue = 1.0f;
                    } else {
                        fFloatValue = 0.0f;
                    }
                }
                bj4VarO.U(z);
                bj4VarO.K(1767091849);
                if (progressSection.isLoading()) {
                    bj4VarO.K(1463860081);
                    if ((i3 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    j4 = j2;
                    zI = z2 | bj4VarO.i(j4);
                    objF2 = bj4VarO.f();
                    if (zI) {
                        objF2 = new oh4() { // from class: ema
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$3$lambda$2(j, j4, (gp5.b) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: ema
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$3$lambda$2(j, j4, (gp5.b) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z);
                    gp5.b bVar4 = new gp5.b();
                    ((oh4) objF2).invoke(bVar4);
                    ub5 ub5VarA2 = xv.a(new gp5(bVar4), null, 6);
                    int i10 = ((i3 << 3) & 896) | 28680;
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        int i11 = uh1.l;
                        objF3 = new dza(wi1.u, new xi1(uh1.f(j)));
                        bj4VarO.C(objF3);
                    }
                    j2 = j4;
                    int i12 = (i10 & 896) | 229384;
                    float f3 = fFloatValue;
                    bj4 bj4Var3 = bj4VarO;
                    f = f3;
                    c = 6;
                    bj4VarO = bj4Var3;
                    j3 = ((uh1) cc5.b(wb5VarC, new uh1(j4), new uh1(j), (cza) objF3, ub5VarA2, "Color value animation", bj4Var3, i12).w.getValue()).a;
                } else {
                    f = fFloatValue;
                    c = 6;
                    j3 = j;
                }
                bj4VarO.U(false);
                qs5 qs5Var2 = new qs5(true, 1.0f);
                bj4VarO.K(1463876813);
                zG = bj4VarO.g(f);
                objF = bj4VarO.f();
                if (zG) {
                    objF = new mh4() { // from class: fma
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Float.valueOf(TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$5$lambda$4(f));
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: fma
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Float.valueOf(TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$5$lambda$4(f));
                        }
                    };
                    bj4VarO.C(objF);
                }
                mh4 mh4Var2 = (mh4) objF;
                objB = aa0.b(bj4VarO, false, 1463883739);
                if (objB == c0187a) {
                    i5 = 2;
                    objB = new dp0(i5);
                    bj4VarO.C(objB);
                } else {
                    i5 = 2;
                }
                bj4VarO.U(false);
                bj4 bj4Var4 = bj4VarO;
                long j6 = j2;
                ae8.b(mh4Var2, qs5Var2, j3, j6, 2, 0.0f, (oh4) objB, bj4Var4, 1769472);
                jM764getDisabled0d7_KjU = j6;
                bj4VarO = bj4Var4;
                wb5VarC = wb5VarC;
                i4 = 1;
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            ox6Var5 = ox6Var4;
        } else {
            if (i6 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            wb5VarC = cc5.c("Infinite progress animation", bj4VarO, 0);
            jM764getDisabled0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m764getDisabled0d7_KjU();
            i4 = 1;
            c30.h hVar3 = new c30.h(4.0f, true, new a30());
            ox6 ox6VarA3 = uma.a(ir9.c(ox6Var3, 1.0f), ay8.a(50));
            ny8VarA = ly8.a(hVar3, di.a.j, bj4VarO, 6);
            ox6Var4 = ox6Var3;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarA3);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(1767069389);
            while (r21.hasNext()) {
                bj4VarO.K(1767070266);
                zIsLoading = progressSection.isLoading();
                c0187a = jt1.a.a;
                if (zIsLoading) {
                    bj4VarO.K(1463837930);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new w29(i4);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    gp5.b bVar5 = new gp5.b();
                    ((oh4) objF4).invoke(bVar5);
                    j2 = jM764getDisabled0d7_KjU;
                    z = false;
                    fFloatValue = ((Number) cc5.a(wb5VarC, 0.0f, 1.0f, xv.a(new gp5(bVar5), null, 6), "Progress value animation", bj4VarO, 29112, 0).w.getValue()).floatValue();
                } else {
                    j2 = jM764getDisabled0d7_KjU;
                    z = false;
                    if (progressSection.isDone()) {
                        fFloatValue = 1.0f;
                    } else {
                        fFloatValue = 0.0f;
                    }
                }
                bj4VarO.U(z);
                bj4VarO.K(1767091849);
                if (progressSection.isLoading()) {
                    bj4VarO.K(1463860081);
                    if ((i3 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    j4 = j2;
                    zI = z2 | bj4VarO.i(j4);
                    objF2 = bj4VarO.f();
                    if (zI) {
                        objF2 = new oh4() { // from class: ema
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$3$lambda$2(j, j4, (gp5.b) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new oh4() { // from class: ema
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$3$lambda$2(j, j4, (gp5.b) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(z);
                    gp5.b bVar6 = new gp5.b();
                    ((oh4) objF2).invoke(bVar6);
                    ub5 ub5VarA3 = xv.a(new gp5(bVar6), null, 6);
                    int i13 = ((i3 << 3) & 896) | 28680;
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        int i14 = uh1.l;
                        objF3 = new dza(wi1.u, new xi1(uh1.f(j)));
                        bj4VarO.C(objF3);
                    }
                    j2 = j4;
                    int i15 = (i13 & 896) | 229384;
                    float f4 = fFloatValue;
                    bj4 bj4Var5 = bj4VarO;
                    f = f4;
                    c = 6;
                    bj4VarO = bj4Var5;
                    j3 = ((uh1) cc5.b(wb5VarC, new uh1(j4), new uh1(j), (cza) objF3, ub5VarA3, "Color value animation", bj4Var5, i15).w.getValue()).a;
                } else {
                    f = fFloatValue;
                    c = 6;
                    j3 = j;
                }
                bj4VarO.U(false);
                qs5 qs5Var3 = new qs5(true, 1.0f);
                bj4VarO.K(1463876813);
                zG = bj4VarO.g(f);
                objF = bj4VarO.f();
                if (zG) {
                    objF = new mh4() { // from class: fma
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Float.valueOf(TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$5$lambda$4(f));
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: fma
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Float.valueOf(TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$5$lambda$4(f));
                        }
                    };
                    bj4VarO.C(objF);
                }
                mh4 mh4Var3 = (mh4) objF;
                objB = aa0.b(bj4VarO, false, 1463883739);
                if (objB == c0187a) {
                    i5 = 2;
                    objB = new dp0(i5);
                    bj4VarO.C(objB);
                } else {
                    i5 = 2;
                }
                bj4VarO.U(false);
                bj4 bj4Var6 = bj4VarO;
                long j7 = j2;
                ae8.b(mh4Var3, qs5Var3, j3, j7, 2, 0.0f, (oh4) objB, bj4Var6, 1769472);
                jM764getDisabled0d7_KjU = j7;
                bj4VarO = bj4Var6;
                wb5VarC = wb5VarC;
                i4 = 1;
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            ox6Var5 = ox6Var4;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: gma
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$10(list, j, ox6Var5, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    public static final void TicketProgressIndicatorPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1245553611);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketProgressIndicatorKt.INSTANCE.m520getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new jc1(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketProgressIndicatorPreview$lambda$11(int i, jt1 jt1Var, int i2) {
        TicketProgressIndicatorPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketProgressIndicator_3IgeMak$lambda$10(List list, long j, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        m526TicketProgressIndicator3IgeMak(list, j, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$1$lambda$0(gp5.b bVar) {
        bVar.getClass();
        bVar.a = 3200;
        Float fValueOf = Float.valueOf(1.0f);
        bVar.a(850, fValueOf).b = ca3.c;
        bVar.a(3200, fValueOf);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$3$lambda$2(long j, long j2, gp5.b bVar) {
        bVar.getClass();
        bVar.a = 3200;
        gp5.a aVarA = bVar.a(850, new uh1(j));
        do2 do2Var = ca3.c;
        aVarA.b = do2Var;
        bVar.a(1850, new uh1(j));
        bVar.a(2200, new uh1(j2)).b = do2Var;
        bVar.a(3200, new uh1(j2));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$7$lambda$6(d73 d73Var) {
        d73Var.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TicketProgressIndicator_3IgeMak$lambda$9$lambda$8$lambda$5$lambda$4(float f) {
        return f;
    }
}
