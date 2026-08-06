package io.intercom.android.sdk.m5.components;

import defpackage.ac4;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.dt6;
import defpackage.es7;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ib1;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.tg8;
import defpackage.v5a;
import defpackage.wja;
import defpackage.xj8;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TicketHeaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketHeaderKt {
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x0154  */
    /* JADX WARN: Code duplicated, block: B:58:0x0161  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void SimpleTicketHeader(ox6 ox6Var, String str, ob4 ob4Var, jt1 jt1Var, int i, int i2) {
        ox6 ox6Var2;
        int i3;
        String str2;
        int i4;
        ob4 ob4Var2;
        int i5;
        ox6.a aVar;
        ob4 ob4Var3;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        ob4 ob4Var4;
        xj8 xj8VarW;
        str.getClass();
        bj4 bj4VarO = jt1Var.o(-921635597);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                str2 = str;
                i3 |= bj4VarO.J(str2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    ob4Var2 = ob4Var;
                    if (bj4VarO.J(ob4Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) == 146 || !bj4VarO.r()) {
                    aVar = ox6.a.t;
                    if (i6 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        ob4Var3 = ob4.y;
                    } else {
                        ob4Var3 = ob4Var2;
                    }
                    ox6 ox6VarQ = ir9.q(ox6Var2);
                    ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarQ);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
                    if (bj4VarO.a == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    ox6 ox6VarJ = ir9.j(aVar, 16.0f);
                    es7 es7VarA = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    int i7 = IntercomTheme.$stable;
                    m65.b(es7VarA, null, ox6VarJ, intercomTheme.getColors(bj4VarO, i7).getIcon().m809getMuted0d7_KjU(), bj4VarO, 440, 0);
                    b47.b(bj4VarO, ir9.n(aVar, 4.0f));
                    mia.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i7).getType04(), ac4.b(intercomTheme, bj4VarO, i7), 0L, ob4Var3, null, 0L, 0L, null, null, 16777210), bj4VarO, (i3 >> 3) & 14, 24960, 110590);
                    bj4VarO = bj4VarO;
                    bj4VarO.U(true);
                    ob4Var4 = ob4Var3;
                } else {
                    bj4VarO.u();
                    ob4Var4 = ob4Var2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new tg8(ox6Var2, str, ob4Var4, i, i2, 1);
                }
            }
            i3 |= 384;
            ob4Var2 = ob4Var;
            if ((i3 & 147) == 146) {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    ob4Var3 = ob4.y;
                } else {
                    ob4Var3 = ob4Var2;
                }
                ox6 ox6VarQ2 = ir9.q(ox6Var2);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarQ2);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ox6 ox6VarJ2 = ir9.j(aVar, 16.0f);
                es7 es7VarA2 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                int i8 = IntercomTheme.$stable;
                m65.b(es7VarA2, null, ox6VarJ2, intercomTheme2.getColors(bj4VarO, i8).getIcon().m809getMuted0d7_KjU(), bj4VarO, 440, 0);
                b47.b(bj4VarO, ir9.n(aVar, 4.0f));
                mia.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme2.getTypography(bj4VarO, i8).getType04(), ac4.b(intercomTheme2, bj4VarO, i8), 0L, ob4Var3, null, 0L, 0L, null, null, 16777210), bj4VarO, (i3 >> 3) & 14, 24960, 110590);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                ob4Var4 = ob4Var3;
            } else {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    ob4Var3 = ob4.y;
                } else {
                    ob4Var3 = ob4Var2;
                }
                ox6 ox6VarQ3 = ir9.q(ox6Var2);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarQ3);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ox6 ox6VarJ3 = ir9.j(aVar, 16.0f);
                es7 es7VarA3 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                int i9 = IntercomTheme.$stable;
                m65.b(es7VarA3, null, ox6VarJ3, intercomTheme3.getColors(bj4VarO, i9).getIcon().m809getMuted0d7_KjU(), bj4VarO, 440, 0);
                b47.b(bj4VarO, ir9.n(aVar, 4.0f));
                mia.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme3.getTypography(bj4VarO, i9).getType04(), ac4.b(intercomTheme3, bj4VarO, i9), 0L, ob4Var3, null, 0L, 0L, null, null, 16777210), bj4VarO, (i3 >> 3) & 14, 24960, 110590);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                ob4Var4 = ob4Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new tg8(ox6Var2, str, ob4Var4, i, i2, 1);
            }
        }
        i3 |= 48;
        str2 = str;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                ob4Var2 = ob4Var;
                if (bj4VarO.J(ob4Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 147) == 146) {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    ob4Var3 = ob4.y;
                } else {
                    ob4Var3 = ob4Var2;
                }
                ox6 ox6VarQ4 = ir9.q(ox6Var2);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarQ4);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ox6 ox6VarJ4 = ir9.j(aVar, 16.0f);
                es7 es7VarA4 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                int i10 = IntercomTheme.$stable;
                m65.b(es7VarA4, null, ox6VarJ4, intercomTheme4.getColors(bj4VarO, i10).getIcon().m809getMuted0d7_KjU(), bj4VarO, 440, 0);
                b47.b(bj4VarO, ir9.n(aVar, 4.0f));
                mia.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme4.getTypography(bj4VarO, i10).getType04(), ac4.b(intercomTheme4, bj4VarO, i10), 0L, ob4Var3, null, 0L, 0L, null, null, 16777210), bj4VarO, (i3 >> 3) & 14, 24960, 110590);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                ob4Var4 = ob4Var3;
            } else {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    ob4Var3 = ob4.y;
                } else {
                    ob4Var3 = ob4Var2;
                }
                ox6 ox6VarQ5 = ir9.q(ox6Var2);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarQ5);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                ox6 ox6VarJ5 = ir9.j(aVar, 16.0f);
                es7 es7VarA5 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
                IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                int i11 = IntercomTheme.$stable;
                m65.b(es7VarA5, null, ox6VarJ5, intercomTheme5.getColors(bj4VarO, i11).getIcon().m809getMuted0d7_KjU(), bj4VarO, 440, 0);
                b47.b(bj4VarO, ir9.n(aVar, 4.0f));
                mia.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme5.getTypography(bj4VarO, i11).getType04(), ac4.b(intercomTheme5, bj4VarO, i11), 0L, ob4Var3, null, 0L, 0L, null, null, 16777210), bj4VarO, (i3 >> 3) & 14, 24960, 110590);
                bj4VarO = bj4VarO;
                bj4VarO.U(true);
                ob4Var4 = ob4Var3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new tg8(ox6Var2, str, ob4Var4, i, i2, 1);
            }
        }
        i3 |= 384;
        ob4Var2 = ob4Var;
        if ((i3 & 147) == 146) {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                ob4Var3 = ob4.y;
            } else {
                ob4Var3 = ob4Var2;
            }
            ox6 ox6VarQ6 = ir9.q(ox6Var2);
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarQ6);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ox6 ox6VarJ6 = ir9.j(aVar, 16.0f);
            es7 es7VarA6 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
            IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            m65.b(es7VarA6, null, ox6VarJ6, intercomTheme6.getColors(bj4VarO, i12).getIcon().m809getMuted0d7_KjU(), bj4VarO, 440, 0);
            b47.b(bj4VarO, ir9.n(aVar, 4.0f));
            mia.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme6.getTypography(bj4VarO, i12).getType04(), ac4.b(intercomTheme6, bj4VarO, i12), 0L, ob4Var3, null, 0L, 0L, null, null, 16777210), bj4VarO, (i3 >> 3) & 14, 24960, 110590);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
            ob4Var4 = ob4Var3;
        } else {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                ob4Var3 = ob4.y;
            } else {
                ob4Var3 = ob4Var2;
            }
            ox6 ox6VarQ7 = ir9.q(ox6Var2);
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarQ7);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ox6 ox6VarJ7 = ir9.j(aVar, 16.0f);
            es7 es7VarA7 = is7.a(R.drawable.intercom_ticket_detail_icon, bj4VarO, 0);
            IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
            int i13 = IntercomTheme.$stable;
            m65.b(es7VarA7, null, ox6VarJ7, intercomTheme7.getColors(bj4VarO, i13).getIcon().m809getMuted0d7_KjU(), bj4VarO, 440, 0);
            b47.b(bj4VarO, ir9.n(aVar, 4.0f));
            mia.b(str2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme7.getTypography(bj4VarO, i13).getType04(), ac4.b(intercomTheme7, bj4VarO, i13), 0L, ob4Var3, null, 0L, 0L, null, null, 16777210), bj4VarO, (i3 >> 3) & 14, 24960, 110590);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
            ob4Var4 = ob4Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new tg8(ox6Var2, str, ob4Var4, i, i2, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SimpleTicketHeader$lambda$2(ox6 ox6Var, String str, ob4 ob4Var, int i, int i2, jt1 jt1Var, int i3) {
        SimpleTicketHeader(ox6Var, str, ob4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void TicketHeader(final ox6 ox6Var, final TicketStatusHeaderArgs ticketStatusHeaderArgs, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ticketStatusHeaderArgs.getClass();
        bj4 bj4VarO = jt1Var.o(-254158349);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.J(ticketStatusHeaderArgs) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (i4 != 0) {
                ox6Var = ox6.a.t;
            }
            ox6 ox6Var2 = ox6Var;
            SimpleTicketHeader(ox6Var2, ticketStatusHeaderArgs.getTitle(), ticketStatusHeaderArgs.getFontWeight(), bj4VarO, i3 & 14, 0);
            ox6Var = ox6Var2;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: bma
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketHeaderKt.TicketHeader$lambda$0(ox6Var, ticketStatusHeaderArgs, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketHeader$lambda$0(ox6 ox6Var, TicketStatusHeaderArgs ticketStatusHeaderArgs, int i, int i2, jt1 jt1Var, int i3) {
        TicketHeader(ox6Var, ticketStatusHeaderArgs, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final void TicketHeaderLongTextPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1234985657);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            final TicketStatusHeaderArgs ticketStatusHeaderArgs = new TicketStatusHeaderArgs("Very long long long long title", null, 2, null);
            IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(337942641, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.TicketHeaderKt.TicketHeaderLongTextPreview.1
                public final void invoke(jt1 jt1Var2, int i2) {
                    if ((i2 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ox6 ox6VarQ = ir9.q(ox6.a.t);
                    final TicketStatusHeaderArgs ticketStatusHeaderArgs2 = ticketStatusHeaderArgs;
                    v5a.a(ox6VarQ, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(-177489460, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.TicketHeaderKt.TicketHeaderLongTextPreview.1.1
                        public final void invoke(jt1 jt1Var3, int i3) {
                            if ((i3 & 3) == 2 && jt1Var3.r()) {
                                jt1Var3.u();
                            } else {
                                TicketHeaderKt.TicketHeader(null, ticketStatusHeaderArgs2, jt1Var3, 0, 1);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                            invoke(jt1Var3, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), jt1Var2, 12582918, 126);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ib1(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketHeaderLongTextPreview$lambda$4(int i, jt1 jt1Var, int i2) {
        TicketHeaderLongTextPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final void TicketHeaderPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1418431454);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            final TicketStatusHeaderArgs ticketStatusHeaderArgs = new TicketStatusHeaderArgs("Bug", null, 2, null);
            IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(10965256, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.TicketHeaderKt.TicketHeaderPreview.1
                public final void invoke(jt1 jt1Var2, int i2) {
                    if ((i2 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ox6 ox6VarQ = ir9.q(ox6.a.t);
                    final TicketStatusHeaderArgs ticketStatusHeaderArgs2 = ticketStatusHeaderArgs;
                    v5a.a(ox6VarQ, null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(34012515, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.TicketHeaderKt.TicketHeaderPreview.1.1
                        public final void invoke(jt1 jt1Var3, int i3) {
                            if ((i3 & 3) == 2 && jt1Var3.r()) {
                                jt1Var3.u();
                            } else {
                                TicketHeaderKt.TicketHeader(null, ticketStatusHeaderArgs2, jt1Var3, 0, 1);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var3, Integer num) {
                            invoke(jt1Var3, num.intValue());
                            return g2b.a;
                        }
                    }, jt1Var2), jt1Var2, 12582918, 126);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new dt6(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketHeaderPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        TicketHeaderPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
