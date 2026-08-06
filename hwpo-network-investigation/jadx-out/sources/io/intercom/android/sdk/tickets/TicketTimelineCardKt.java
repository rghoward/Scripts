package io.intercom.android.sdk.tickets;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.aj1;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cka;
import defpackage.di;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.mia;
import defpackage.ml5;
import defpackage.ny8;
import defpackage.oc1;
import defpackage.ox6;
import defpackage.pc1;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.vaa;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z02;
import defpackage.zp0;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.tickets.TicketTimelineCardKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketTimelineCardKt {
    private static final TicketTimelineCardState sampleTicketTimelineCardState;

    static {
        Avatar avatarCreate = Avatar.create("https://static.intercomassets.com/avatars/5355644/square_128/002Bizimply-Headshots-1641919551.jpeg", BuildConfig.FLAVOR);
        avatarCreate.getClass();
        String str = "Hannah will pick this up soon 🙌";
        String str2 = "🕑  Estimated to be resolved today at 4pm";
        String str3 = "Submitted";
        sampleTicketTimelineCardState = new TicketTimelineCardState(ws0.h(new AvatarWrapper(avatarCreate, false, 2, null)), str, str2, TicketStatus.Submitted.m527getColor0d7_KjU(), ws0.i(new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false), new TicketTimelineCardState.ProgressSection(false, false)), str3, Long.valueOf(System.currentTimeMillis()), null);
    }

    public static final void InProgressTicketTimelineWithLabelPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-255211063);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m524getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new z02(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b InProgressTicketTimelineWithLabelPreview$lambda$6(int i, jt1 jt1Var, int i2) {
        InProgressTicketTimelineWithLabelPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void ResolvedTicketTimelineWithLabelPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(2040249091);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m523getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new pc1(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ResolvedTicketTimelineWithLabelPreview$lambda$5(int i, jt1 jt1Var, int i2) {
        ResolvedTicketTimelineWithLabelPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void SubmittedTicketTimelineWithLabelPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1972637636);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m522getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new oc1(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SubmittedTicketTimelineWithLabelPreview$lambda$4(int i, jt1 jt1Var, int i2) {
        SubmittedTicketTimelineWithLabelPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:52:0x012b  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0219  */
    /* JADX WARN: Code duplicated, block: B:61:0x0227  */
    /* JADX WARN: Code duplicated, block: B:63:0x022b  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void TicketTimelineCard(final TicketTimelineCardState ticketTimelineCardState, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final ox6 ox6Var2;
        ox6.a aVar;
        ox6 ox6Var3;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        ny8 ny8VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        Long timestamp;
        String str;
        IntercomTheme intercomTheme;
        int i4;
        xj8 xj8VarW;
        ticketTimelineCardState.getClass();
        bj4 bj4VarO = jt1Var.o(926572596);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (bj4VarO.j(ticketTimelineCardState) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i5 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                ox6 ox6VarI = eo7.i(ox6Var3, 24.0f);
                aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
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
                rd7.d(bj4VarO, cVar, aj1VarA);
                eVar = bt1.a.e;
                rd7.d(bj4VarO, eVar, kw7VarP);
                Integer numValueOf = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                ox6 ox6VarR = ir9.r(aVar);
                ny8VarA = ly8.a(c30.a, di.a.j, bj4VarO, 0);
                iHashCode2 = Long.hashCode(bj4VarO.T);
                kw7VarP2 = bj4VarO.P();
                ox6VarC2 = it1.c(bj4VarO, ox6VarR);
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
                rd7.d(bj4VarO, cVar, ny8VarA);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                AvatarGroupKt.m19AvatarGroupJ8mCjc(ticketTimelineCardState.getAdminAvatars(), null, 64.0f, cka.b(24), bj4VarO, 3456, 2);
                bj4VarO.U(true);
                b47.b(bj4VarO, ir9.d(aVar, 12.0f));
                String statusLabel = ticketTimelineCardState.getStatusLabel();
                timestamp = ticketTimelineCardState.getTimestamp();
                if (timestamp != null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context)) == null) {
                    str = BuildConfig.FLAVOR;
                }
                String str2 = str;
                intercomTheme = IntercomTheme.INSTANCE;
                i4 = IntercomTheme.$stable;
                ox6 ox6Var4 = ox6Var3;
                TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(statusLabel, str2, null, null, intercomTheme.getTypography(bj4VarO, i4).getType04SemiBold(), ticketTimelineCardState.m531getProgressColor0d7_KjU(), 0, 0, new vaa(3), bj4VarO, 0, 204);
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                mia.b(ticketTimelineCardState.getStatusTitle(), null, gh5.a(intercomTheme, bj4VarO, i4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i4).getType04(), bj4VarO, 0, 0, 131066);
                bj4VarO = bj4VarO;
                bj4VarO.K(2095162851);
                if (ticketTimelineCardState.getStatusSubtitle().length() > 0) {
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    mia.b(ticketTimelineCardState.getStatusSubtitle(), null, gh5.a(intercomTheme, bj4VarO, i4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i4).getType04(), bj4VarO, 0, 0, 131066);
                    bj4VarO = bj4VarO;
                }
                bj4VarO.U(false);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                TicketProgressIndicatorKt.m526TicketProgressIndicator3IgeMak(ticketTimelineCardState.getProgressSections(), ticketTimelineCardState.m531getProgressColor0d7_KjU(), null, bj4VarO, 0, 4);
                bj4VarO.U(true);
                ox6Var2 = ox6Var4;
            } else {
                bj4VarO.u();
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: jma
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketTimelineCardKt.TicketTimelineCard$lambda$2(ticketTimelineCardState, ox6Var2, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        if ((i3 & 19) == 18) {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            Context context2 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            ox6 ox6VarI2 = eo7.i(ox6Var3, 24.0f);
            aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
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
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf2);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6VarR2 = ir9.r(aVar);
            ny8VarA = ly8.a(c30.a, di.a.j, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarR2);
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
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            AvatarGroupKt.m19AvatarGroupJ8mCjc(ticketTimelineCardState.getAdminAvatars(), null, 64.0f, cka.b(24), bj4VarO, 3456, 2);
            bj4VarO.U(true);
            b47.b(bj4VarO, ir9.d(aVar, 12.0f));
            String statusLabel2 = ticketTimelineCardState.getStatusLabel();
            timestamp = ticketTimelineCardState.getTimestamp();
            if (timestamp != null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = BuildConfig.FLAVOR;
            }
            String str3 = str;
            intercomTheme = IntercomTheme.INSTANCE;
            i4 = IntercomTheme.$stable;
            ox6 ox6Var5 = ox6Var3;
            TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(statusLabel2, str3, null, null, intercomTheme.getTypography(bj4VarO, i4).getType04SemiBold(), ticketTimelineCardState.m531getProgressColor0d7_KjU(), 0, 0, new vaa(3), bj4VarO, 0, 204);
            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
            mia.b(ticketTimelineCardState.getStatusTitle(), null, gh5.a(intercomTheme, bj4VarO, i4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i4).getType04(), bj4VarO, 0, 0, 131066);
            bj4VarO = bj4VarO;
            bj4VarO.K(2095162851);
            if (ticketTimelineCardState.getStatusSubtitle().length() > 0) {
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                mia.b(ticketTimelineCardState.getStatusSubtitle(), null, gh5.a(intercomTheme, bj4VarO, i4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i4).getType04(), bj4VarO, 0, 0, 131066);
                bj4VarO = bj4VarO;
            }
            bj4VarO.U(false);
            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
            TicketProgressIndicatorKt.m526TicketProgressIndicator3IgeMak(ticketTimelineCardState.getProgressSections(), ticketTimelineCardState.m531getProgressColor0d7_KjU(), null, bj4VarO, 0, 4);
            bj4VarO.U(true);
            ox6Var2 = ox6Var5;
        } else {
            aVar = ox6.a.t;
            if (i5 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            Context context3 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            ox6 ox6VarI3 = eo7.i(ox6Var3, 24.0f);
            aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
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
            rd7.d(bj4VarO, cVar, aj1VarA);
            eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf3);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            ox6 ox6VarR3 = ir9.r(aVar);
            ny8VarA = ly8.a(c30.a, di.a.j, bj4VarO, 0);
            iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7VarP2 = bj4VarO.P();
            ox6VarC2 = it1.c(bj4VarO, ox6VarR3);
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
            rd7.d(bj4VarO, cVar, ny8VarA);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            AvatarGroupKt.m19AvatarGroupJ8mCjc(ticketTimelineCardState.getAdminAvatars(), null, 64.0f, cka.b(24), bj4VarO, 3456, 2);
            bj4VarO.U(true);
            b47.b(bj4VarO, ir9.d(aVar, 12.0f));
            String statusLabel3 = ticketTimelineCardState.getStatusLabel();
            timestamp = ticketTimelineCardState.getTimestamp();
            if (timestamp != null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = BuildConfig.FLAVOR;
            }
            String str4 = str;
            intercomTheme = IntercomTheme.INSTANCE;
            i4 = IntercomTheme.$stable;
            ox6 ox6Var6 = ox6Var3;
            TextWithSeparatorKt.m89TextWithSeparatorwV1YYcM(statusLabel3, str4, null, null, intercomTheme.getTypography(bj4VarO, i4).getType04SemiBold(), ticketTimelineCardState.m531getProgressColor0d7_KjU(), 0, 0, new vaa(3), bj4VarO, 0, 204);
            b47.b(bj4VarO, ir9.d(aVar, 8.0f));
            mia.b(ticketTimelineCardState.getStatusTitle(), null, gh5.a(intercomTheme, bj4VarO, i4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i4).getType04(), bj4VarO, 0, 0, 131066);
            bj4VarO = bj4VarO;
            bj4VarO.K(2095162851);
            if (ticketTimelineCardState.getStatusSubtitle().length() > 0) {
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                mia.b(ticketTimelineCardState.getStatusSubtitle(), null, gh5.a(intercomTheme, bj4VarO, i4), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i4).getType04(), bj4VarO, 0, 0, 131066);
                bj4VarO = bj4VarO;
            }
            bj4VarO.U(false);
            b47.b(bj4VarO, ir9.d(aVar, 16.0f));
            TicketProgressIndicatorKt.m526TicketProgressIndicator3IgeMak(ticketTimelineCardState.getProgressSections(), ticketTimelineCardState.m531getProgressColor0d7_KjU(), null, bj4VarO, 0, 4);
            bj4VarO.U(true);
            ox6Var2 = ox6Var6;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: jma
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketTimelineCardKt.TicketTimelineCard$lambda$2(ticketTimelineCardState, ox6Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketTimelineCard$lambda$2(TicketTimelineCardState ticketTimelineCardState, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        TicketTimelineCard(ticketTimelineCardState, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void WaitingOnCustomerTicketTimelinePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-670677167);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m521getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new zp0(i, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b WaitingOnCustomerTicketTimelinePreview$lambda$3(int i, jt1 jt1Var, int i2) {
        WaitingOnCustomerTicketTimelinePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final TicketTimelineCardState getSampleTicketTimelineCardState() {
        return sampleTicketTimelineCardState;
    }
}
