package io.intercom.android.sdk.tickets.list.ui;

import defpackage.ac4;
import defpackage.aj1;
import defpackage.ay8;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.go7;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.jy3;
import defpackage.ko7;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.uh1;
import defpackage.v5a;
import defpackage.wja;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.tickets.list.ui.TicketRowKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketRowKt {
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x0261  */
    /* JADX WARN: Code duplicated, block: B:87:0x026f  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:95:0x02aa  */
    public static final void TicketRow(ox6 ox6Var, final TicketRowData ticketRowData, go7 go7Var, boolean z, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        go7 go7Var2;
        boolean z2;
        go7 ko7Var;
        boolean z3;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        ox6 ox6Var3;
        go7 go7Var3;
        aj1 aj1VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        ob4 ob4Var;
        bj4 bj4Var;
        final go7 go7Var4;
        final ox6 ox6Var4;
        final boolean z4;
        ticketRowData.getClass();
        bj4 bj4VarO = jt1Var.o(-1789130333);
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
            i3 |= bj4VarO.J(ticketRowData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                go7Var2 = go7Var;
                int i5 = bj4VarO.J(go7Var2) ? 256 : 128;
                i3 |= i5;
            } else {
                go7Var2 = go7Var;
            }
            i3 |= i5;
        } else {
            go7Var2 = go7Var;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                z2 = z;
                int i6 = bj4VarO.c(z2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
                i3 |= i6;
            } else {
                z2 = z;
            }
            i3 |= i6;
        } else {
            z2 = z;
        }
        if ((i3 & 1171) == 1170 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var = bj4VarO;
            ox6Var4 = ox6Var2;
            go7Var4 = go7Var2;
            z4 = z2;
        } else {
            bj4VarO.v0();
            int i7 = i & 1;
            ox6.a aVar2 = ox6.a.t;
            if (i7 == 0 || bj4VarO.c0()) {
                if (i4 != 0) {
                    ox6Var2 = aVar2;
                }
                ko7Var = (i2 & 4) != 0 ? new ko7(20.0f, 16.0f, 20.0f, 16.0f) : go7Var2;
                if ((i2 & 8) != 0) {
                    z3 = !ticketRowData.isRead();
                }
                bj4VarO.V();
                ox6 ox6VarH = eo7.h(ox6Var2, ko7Var);
                ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (j1bVar != null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
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
                ox6Var3 = ox6Var2;
                go7Var3 = ko7Var;
                v5a.a(ir9.j(aVar2, 32.0f), ay8.a, uh1.b(0.1f, ticketRowData.getStatus().m527getColor0d7_KjU()), 0L, 0.0f, 0.0f, null, gr1.b(1329606754, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketRowKt$TicketRow$1$1
                    public final void invoke(jt1 jt1Var2, int i8) {
                        if ((i8 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            m65.b(is7.a(ticketRowData.getStatus().getIconRes(), jt1Var2, 0), null, eo7.i(ox6.a.t, 8.0f), ticketRowData.getStatus().m527getColor0d7_KjU(), jt1Var2, 440, 0);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 12582918, 120);
                b47.b(bj4VarO, ir9.n(aVar2, 10.0f));
                qs5 qs5Var = new qs5(true, 1.0f);
                aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, qs5Var);
                if (j1bVar != null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                String title = ticketRowData.getTitle();
                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                int i8 = IntercomTheme.$stable;
                wja wjaVarA = wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), gh5.a(intercomTheme, bj4VarO, i8), 0L, null, null, 0L, 0L, null, null, 16777214);
                if (ticketRowData.isRead()) {
                    ob4Var = ob4.y;
                } else {
                    ob4Var = ob4.A;
                }
                mia.b(title, null, 0L, 0L, ob4Var, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA, bj4VarO, 0, 24960, 110526);
                b47.b(bj4VarO, ir9.d(aVar2, 4.0f));
                mia.b(ticketRowData.getSubTitle(), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i8).getType04(), ac4.b(intercomTheme, bj4VarO, i8), 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 0, 24960, 110590);
                bj4Var = bj4VarO;
                bj4Var.U(true);
                if (z3) {
                    bj4Var.K(-318871183);
                    ConversationItemKt.UnreadIndicator(null, bj4Var, 0, 1);
                    bj4Var.U(false);
                } else {
                    bj4Var.K(-318823288);
                    IntercomChevronKt.IntercomChevron(eo7.m(aVar2, 6.0f, 0.0f, 0.0f, 0.0f, 14), bj4Var, 6, 0);
                    bj4Var.U(false);
                }
                bj4Var.U(true);
                go7Var4 = go7Var3;
                ox6Var4 = ox6Var3;
                z4 = z3;
            } else {
                bj4VarO.u();
                ko7Var = go7Var2;
            }
            z3 = z2;
            bj4VarO.V();
            ox6 ox6VarH2 = eo7.h(ox6Var2, ko7Var);
            ny8VarA = ly8.a(c30.a, di.a.k, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarH2);
            bt1.c.getClass();
            aVar = bt1.a.b;
            if (j1bVar != null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
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
            ox6Var3 = ox6Var2;
            go7Var3 = ko7Var;
            v5a.a(ir9.j(aVar2, 32.0f), ay8.a, uh1.b(0.1f, ticketRowData.getStatus().m527getColor0d7_KjU()), 0L, 0.0f, 0.0f, null, gr1.b(1329606754, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketRowKt$TicketRow$1$1
                public final void invoke(jt1 jt1Var2, int i9) {
                    if ((i9 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                    } else {
                        m65.b(is7.a(ticketRowData.getStatus().getIconRes(), jt1Var2, 0), null, eo7.i(ox6.a.t, 8.0f), ticketRowData.getStatus().m527getColor0d7_KjU(), jt1Var2, 440, 0);
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 12582918, 120);
            b47.b(bj4VarO, ir9.n(aVar2, 10.0f));
            qs5 qs5Var2 = new qs5(true, 1.0f);
            aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, qs5Var2);
            if (j1bVar != null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, cVar, aj1VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            String title2 = ticketRowData.getTitle();
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i9 = IntercomTheme.$stable;
            wja wjaVarA2 = wja.a(intercomTheme2.getTypography(bj4VarO, i9).getType04(), gh5.a(intercomTheme2, bj4VarO, i9), 0L, null, null, 0L, 0L, null, null, 16777214);
            if (ticketRowData.isRead()) {
                ob4Var = ob4.y;
            } else {
                ob4Var = ob4.A;
            }
            mia.b(title2, null, 0L, 0L, ob4Var, 0L, null, 0L, 2, false, 1, 0, null, wjaVarA2, bj4VarO, 0, 24960, 110526);
            b47.b(bj4VarO, ir9.d(aVar2, 4.0f));
            mia.b(ticketRowData.getSubTitle(), null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme2.getTypography(bj4VarO, i9).getType04(), ac4.b(intercomTheme2, bj4VarO, i9), 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 0, 24960, 110590);
            bj4Var = bj4VarO;
            bj4Var.U(true);
            if (z3) {
                bj4Var.K(-318871183);
                ConversationItemKt.UnreadIndicator(null, bj4Var, 0, 1);
                bj4Var.U(false);
            } else {
                bj4Var.K(-318823288);
                IntercomChevronKt.IntercomChevron(eo7.m(aVar2, 6.0f, 0.0f, 0.0f, 0.0f, 14), bj4Var, 6, 0);
                bj4Var.U(false);
            }
            bj4Var.U(true);
            go7Var4 = go7Var3;
            ox6Var4 = ox6Var3;
            z4 = z3;
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: hma
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketRowKt.TicketRow$lambda$2(ox6Var4, ticketRowData, go7Var4, z4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketRow$lambda$2(ox6 ox6Var, TicketRowData ticketRowData, go7 go7Var, boolean z, int i, int i2, jt1 jt1Var, int i3) {
        TicketRow(ox6Var, ticketRowData, go7Var, z, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void TicketRowPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1396185263);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketRowKt.INSTANCE.m540getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new jy3(i, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketRowPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        TicketRowPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
