package io.intercom.android.sdk.tickets;

import com.intercom.twig.BuildConfig;
import defpackage.a04;
import defpackage.a30;
import defpackage.aa0;
import defpackage.aa3;
import defpackage.ac4;
import defpackage.ah5;
import defpackage.aj1;
import defpackage.al8;
import defpackage.ay8;
import defpackage.az3;
import defpackage.b29;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cka;
import defpackage.di;
import defpackage.dv0;
import defpackage.dw3;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.g3;
import defpackage.gh5;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.iw;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.k6a;
import defpackage.kk;
import defpackage.kw7;
import defpackage.l02;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.mm8;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.q69;
import defpackage.qq2;
import defpackage.qr5;
import defpackage.qs5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.sv;
import defpackage.u;
import defpackage.u7d;
import defpackage.uh1;
import defpackage.uma;
import defpackage.v5a;
import defpackage.vaa;
import defpackage.wd3;
import defpackage.wja;
import defpackage.ws0;
import defpackage.ww9;
import defpackage.xj8;
import defpackage.xt;
import defpackage.xv;
import defpackage.y43;
import defpackage.yi1;
import defpackage.yq5;
import defpackage.za2;
import defpackage.zf7;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.IntercomButton;
import io.intercom.android.sdk.ui.component.IntercomButtonKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TicketDetailContentKt {
    private static final TicketDetailState.TicketDetailContentState sampleTicketDetailState;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Avatar avatarCreate = Avatar.create("https://static.intercomassets.com/avatars/5355644/square_128/002Bizimply-Headshots-1641919551.jpeg", BuildConfig.FLAVOR);
        avatarCreate.getClass();
        int i = 2;
        qq2 qq2Var = null;
        String str = null;
        sampleTicketDetailState = new TicketDetailState.TicketDetailContentState("API issue", new TicketTimelineCardState(ws0.h(new AvatarWrapper(avatarCreate, false, i, null)), "Hannah will pick this up soon", "🕑  Estimated to be resolved today at 4pm", uh1.h, ws0.i(new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(false, true), new TicketTimelineCardState.ProgressSection(false, false)), "Submitted", Long.valueOf(System.currentTimeMillis()), qq2Var), ws0.i(new Ticket.TicketAttribute.PrimitiveAttribute(null, null, "Description", false, null, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Et, ut hendrerit et lacus, dictumst ridiculus morbi elementum.", 27, qq2Var), new Ticket.TicketAttribute.PrimitiveAttribute(null, str, "API Version", false, null, "1.2", 27, null), new Ticket.TicketAttribute.DateTimeAttribute(str, null, "When did the issue occur?", false, null, "1676555323", 27, null)), "test@gmail.com", "123", new ConversationButtonState(true, Integer.valueOf(R.drawable.intercom_send_message_icon), new StringProvider.StringRes(R.string.intercom_send_us_a_message, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0)));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0232  */
    /* JADX WARN: Code duplicated, block: B:104:0x0256  */
    /* JADX WARN: Code duplicated, block: B:105:0x025b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0265  */
    /* JADX WARN: Code duplicated, block: B:109:0x026b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0312  */
    /* JADX WARN: Code duplicated, block: B:114:0x033f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0346  */
    /* JADX WARN: Code duplicated, block: B:117:0x034a  */
    /* JADX WARN: Code duplicated, block: B:120:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:122:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:125:0x040c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0414  */
    /* JADX WARN: Code duplicated, block: B:132:0x043a  */
    /* JADX WARN: Code duplicated, block: B:134:0x043e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0454  */
    /* JADX WARN: Code duplicated, block: B:140:0x0460  */
    /* JADX WARN: Code duplicated, block: B:142:0x0466  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:76:0x0110  */
    /* JADX WARN: Code duplicated, block: B:79:0x012f  */
    /* JADX WARN: Code duplicated, block: B:81:0x013f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x0141  */
    /* JADX WARN: Code duplicated, block: B:84:0x0153  */
    /* JADX WARN: Code duplicated, block: B:87:0x018c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0195  */
    /* JADX WARN: Code duplicated, block: B:90:0x0199  */
    /* JADX WARN: Code duplicated, block: B:93:0x0204  */
    /* JADX WARN: Code duplicated, block: B:95:0x020b  */
    /* JADX WARN: Code duplicated, block: B:96:0x020f  */
    /* JADX WARN: Code duplicated, block: B:99:0x022a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void TicketDetailContent(ox6 ox6Var, final TicketDetailState.TicketDetailContentState ticketDetailContentState, oh4<? super String, g2b> oh4Var, boolean z, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        oh4<? super String, g2b> oh4Var2;
        int i4;
        boolean z2;
        int i5;
        ox6.a aVar;
        jt1.a.C0187a c0187a;
        int i6;
        final boolean z3;
        boolean z4;
        Object objF;
        h37 h37Var;
        Object objF2;
        h37 h37Var2;
        Object objB;
        boolean z5;
        h37 h37Var3;
        CardState cardStateTicketDetailContent$lambda$4;
        CardState cardState;
        boolean z6;
        c30.k kVar;
        aj1 aj1VarA;
        ox6 ox6Var3;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        bt1.a.c cVar;
        bt1.a.e eVar;
        bt1.a.b bVar;
        bt1.a.C0034a c0034a;
        bt1.a.d dVar;
        IntercomTheme intercomTheme;
        int i7;
        oh4<? super String, g2b> oh4Var3;
        int i8;
        az3 az3Var;
        fl6 fl6VarD;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        float f;
        float fTicketDetailContent$lambda$10;
        aa3 aa3Var;
        a04 a04VarB;
        ?? r21;
        final oh4<? super String, g2b> oh4Var4;
        final oh4<? super String, g2b> oh4Var5;
        final ox6 ox6Var4;
        final boolean z7;
        aj1 aj1VarA2;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        boolean z8;
        boolean zJ;
        Object objF3;
        boolean zJ2;
        Object objF4;
        Object objF5;
        xj8 xj8VarW;
        final TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
        ticketDetailContentState2.getClass();
        bj4 bj4VarO = jt1Var.o(-872031756);
        j1b j1bVar = bj4VarO.a;
        int i9 = i2 & 1;
        if (i9 != 0) {
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
            i3 |= bj4VarO.j(ticketDetailContentState2) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                oh4Var2 = oh4Var;
                i3 |= bj4VarO.j(oh4Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                    aVar = ox6.a.t;
                    if (i9 != 0) {
                        ox6Var2 = aVar;
                    }
                    c0187a = jt1.a.a;
                    i6 = 1;
                    if (i10 != 0) {
                        bj4VarO.K(1639440163);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new b29(i6);
                            bj4VarO.C(objF5);
                        }
                        oh4Var2 = (oh4) objF5;
                        bj4VarO.U(false);
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    Object[] objArr = new Object[0];
                    bj4VarO.K(1639443041);
                    if ((i3 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objF = bj4VarO.f();
                    if (z4 || objF == c0187a) {
                        objF = new mh4() { // from class: sla
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TicketDetailContentKt.TicketDetailContent$lambda$3$lambda$2(z3);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) mm8.d(objArr, (mh4) objF, bj4VarO, 0);
                    bj4VarO.K(1639447110);
                    objF2 = bj4VarO.f();
                    if (objF2 == c0187a) {
                        objF2 = bl7.i(new y43(-56.0f));
                        bj4VarO.C(objF2);
                    }
                    h37Var2 = (h37) objF2;
                    objB = aa0.b(bj4VarO, false, 1639449312);
                    z5 = z3;
                    if (objB == c0187a) {
                        objB = bl7.i(Float.valueOf(0.0f));
                        bj4VarO.C(objB);
                    }
                    h37Var3 = (h37) objB;
                    bj4VarO.U(false);
                    bj4VarO.K(1639450743);
                    cardStateTicketDetailContent$lambda$4 = TicketDetailContent$lambda$4(h37Var);
                    cardState = CardState.SubmissionCard;
                    if (cardStateTicketDetailContent$lambda$4 == cardState) {
                        bj4VarO.K(1639454260);
                        zJ2 = bj4VarO.J(h37Var);
                        objF4 = bj4VarO.f();
                        if (zJ2 || objF4 == c0187a) {
                            objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(h37Var2, h37Var3, h37Var, null);
                            bj4VarO.C(objF4);
                        }
                        z6 = false;
                        bj4VarO.U(false);
                        wd3.d(bj4VarO, (ci4) objF4, null);
                    } else {
                        z6 = false;
                    }
                    bj4VarO.U(z6);
                    ox6 ox6VarH = q69.h(ox6Var2.H(ir9.b), q69.f(bj4VarO), 14);
                    sp0.a aVar3 = di.a.m;
                    kVar = c30.c;
                    aj1VarA = yi1.a(kVar, aVar3, bj4VarO, 0);
                    ox6Var3 = ox6Var2;
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarH);
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
                    intercomTheme = IntercomTheme.INSTANCE;
                    i7 = IntercomTheme.$stable;
                    oh4Var3 = oh4Var2;
                    i8 = i3;
                    ox6 ox6VarC4 = gi0.c(aVar, kk.a(intercomTheme, bj4VarO, i7), al8.a);
                    az3Var = ir9.c;
                    ox6 ox6VarA = sv.a(ir9.e(ox6VarC4.H(az3Var), 194.0f, 0.0f, 2), xv.c(0, 0, null, 7));
                    fl6VarD = dv0.d(di.a.e, false);
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
                    rd7.d(bj4VarO, cVar, fl6VarD);
                    rd7.d(bj4VarO, eVar, kw7VarP2);
                    l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC2);
                    TicketTimelineCardState ticketTimelineCardState = ticketDetailContentState.getTicketTimelineCardState();
                    if (TicketDetailContent$lambda$4(h37Var) == CardState.TimelineCard) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    TicketTimelineCardKt.TicketTimelineCard(ticketTimelineCardState, yq5.b(aVar, ((Number) xt.b(f, xv.b(0.0f, 0.0f, null, 7), bj4VarO, 48).getValue()).floatValue()), bj4VarO, 0, 0);
                    if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                        fTicketDetailContent$lambda$10 = TicketDetailContent$lambda$10(h37Var3);
                    } else {
                        fTicketDetailContent$lambda$10 = 0.0f;
                    }
                    if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                        aa3Var = null;
                        a04VarB = xv.c(1000, 0, null, 6);
                    } else {
                        aa3Var = null;
                        a04VarB = xv.b(0.0f, 0.0f, null, 7);
                    }
                    TicketSubmissionCard(zf7.b(0.0f, ((y43) xt.a(TicketDetailContent$lambda$7(h37Var2), xv.c(1000, 0, aa3Var, 6), bj4VarO, 48, 12).getValue()).t, yq5.b(aVar, ((Number) xt.b(fTicketDetailContent$lambda$10, a04VarB, bj4VarO, 0).getValue()).floatValue())), bj4VarO, 0, 0);
                    bj4VarO.U(true);
                    r21 = aa3Var;
                    v5a.a(az3Var, null, intercomTheme.getColors(bj4VarO, i7).getBase().m712getBase0d7_KjU(), 0L, 0.0f, 0.0f, null, gr1.b(925724611, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$3$2
                        public final void invoke(jt1 jt1Var2, int i11) {
                            ox6.a aVar4;
                            boolean z9;
                            ox6.a aVar5;
                            float f2;
                            if ((i11 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            ox6.a aVar6 = ox6.a.t;
                            ox6 ox6VarI = eo7.i(aVar6, 16.0f);
                            TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState;
                            c30.k kVar2 = c30.c;
                            sp0.a aVar7 = di.a.m;
                            aj1 aj1VarA3 = yi1.a(kVar2, aVar7, jt1Var2, 0);
                            int iHashCode4 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY = jt1Var2.y();
                            ox6 ox6VarC5 = it1.c(jt1Var2, ox6VarI);
                            bt1.c.getClass();
                            qr5.a aVar8 = bt1.a.b;
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar8);
                            } else {
                                jt1Var2.z();
                            }
                            bt1.a.c cVar2 = bt1.a.f;
                            rd7.d(jt1Var2, cVar2, aj1VarA3);
                            bt1.a.e eVar2 = bt1.a.e;
                            rd7.d(jt1Var2, eVar2, kw7VarY);
                            Integer numValueOf2 = Integer.valueOf(iHashCode4);
                            bt1.a.b bVar2 = bt1.a.g;
                            rd7.d(jt1Var2, bVar2, numValueOf2);
                            bt1.a.C0034a c0034a2 = bt1.a.h;
                            rd7.c(jt1Var2, c0034a2);
                            bt1.a.d dVar2 = bt1.a.d;
                            rd7.d(jt1Var2, dVar2, ox6VarC5);
                            ox6 ox6VarA2 = uma.a(aVar6, ay8.b(8.0f));
                            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                            int i12 = IntercomTheme.$stable;
                            ox6 ox6VarI2 = eo7.i(ir9.c(gi0.c(ox6VarA2, intercomTheme2.getColors(jt1Var2, i12).m757getBubbleBackground0d7_KjU(), al8.a), 1.0f), 12.0f);
                            ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                            int iHashCode5 = Long.hashCode(jt1Var2.v());
                            kw7 kw7VarY2 = jt1Var2.y();
                            ox6 ox6VarC6 = it1.c(jt1Var2, ox6VarI2);
                            if (jt1Var2.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var2.q();
                            if (jt1Var2.l()) {
                                jt1Var2.k(aVar8);
                            } else {
                                jt1Var2.z();
                            }
                            rd7.d(jt1Var2, cVar2, ny8VarA);
                            rd7.d(jt1Var2, eVar2, kw7VarY2);
                            g3.c(iHashCode5, jt1Var2, bVar2, jt1Var2, c0034a2);
                            rd7.d(jt1Var2, dVar2, ox6VarC6);
                            m65.b(is7.a(R.drawable.intercom_ticket_notification, jt1Var2, 0), null, ir9.j(eo7.m(aVar6, 0.0f, 4.0f, 0.0f, 0.0f, 13), 16.0f), intercomTheme2.getColors(jt1Var2, i12).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                            b47.b(jt1Var2, ir9.n(aVar6, 16.0f));
                            wja type04 = intercomTheme2.getTypography(jt1Var2, i12).getType04();
                            jt1Var2.K(1807110638);
                            iw.b bVar3 = new iw.b();
                            jt1Var2.K(1807112122);
                            int iH = bVar3.h(new ww9(0L, 0L, ob4.A, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                            try {
                                bVar3.c(nr1.f(jt1Var2, R.string.intercom_youll_be_notified_here_and_by_email));
                                bVar3.c(" ");
                                g2b g2bVar = g2b.a;
                                bVar3.e(iH);
                                jt1Var2.B();
                                bVar3.c(ticketDetailContentState3.getUserEmail());
                                iw iwVarI = bVar3.i();
                                jt1Var2.B();
                                mia.c(iwVarI, null, ah5.a(intercomTheme2, jt1Var2, i12), 0L, null, 0L, null, cka.b(22), 0, false, 0, 0, null, null, type04, jt1Var2, 0, 48, 260090);
                                jt1 jt1Var3 = jt1Var2;
                                jt1Var3.I();
                                ox6.a aVar9 = aVar6;
                                b47.b(jt1Var3, ir9.d(aVar9, 24.0f));
                                jt1Var3.K(-711350793);
                                if (!ticketDetailContentState3.getTicketAttributes().isEmpty()) {
                                    ox6 ox6VarH2 = eo7.k(aVar9, 12.0f, 0.0f, 2).H(ir9.c);
                                    boolean z10 = false;
                                    aj1 aj1VarA4 = yi1.a(kVar2, aVar7, jt1Var3, 0);
                                    int iHashCode6 = Long.hashCode(jt1Var3.v());
                                    kw7 kw7VarY3 = jt1Var3.y();
                                    ox6 ox6VarC7 = it1.c(jt1Var3, ox6VarH2);
                                    if (jt1Var3.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var3.q();
                                    if (jt1Var3.l()) {
                                        jt1Var3.k(aVar8);
                                    } else {
                                        jt1Var3.z();
                                    }
                                    rd7.d(jt1Var3, cVar2, aj1VarA4);
                                    rd7.d(jt1Var3, eVar2, kw7VarY3);
                                    g3.c(iHashCode6, jt1Var3, bVar2, jt1Var3, c0034a2);
                                    rd7.d(jt1Var3, dVar2, ox6VarC7);
                                    jt1Var3.K(1807143465);
                                    for (Ticket.TicketAttribute ticketAttribute : ticketDetailContentState3.getTicketAttributes()) {
                                        String name = ticketAttribute.getName();
                                        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                                        int i13 = IntercomTheme.$stable;
                                        ox6.a aVar10 = aVar9;
                                        mia.b(name, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04SemiBold(), jt1Var2, 0, 0, 131070);
                                        jt1Var3 = jt1Var2;
                                        b47.b(jt1Var3, ir9.d(aVar10, 2.0f));
                                        if (ticketAttribute instanceof Ticket.TicketAttribute.PrimitiveAttribute) {
                                            jt1Var3.K(2134715913);
                                            aVar4 = aVar10;
                                            mia.b(((Ticket.TicketAttribute.PrimitiveAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                            jt1Var3 = jt1Var2;
                                            jt1Var3.B();
                                        } else {
                                            aVar4 = aVar10;
                                            if (ticketAttribute instanceof Ticket.TicketAttribute.ListAttribute) {
                                                jt1Var3.K(2135020457);
                                                mia.b(((Ticket.TicketAttribute.ListAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                                jt1Var3 = jt1Var2;
                                                jt1Var3.B();
                                            } else {
                                                if (ticketAttribute instanceof Ticket.TicketAttribute.DateTimeAttribute) {
                                                    jt1Var3.K(2135335386);
                                                    String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(Long.parseLong(((Ticket.TicketAttribute.DateTimeAttribute) ticketAttribute).getValue()) * 1000, "dd-MM-yyy, HH:mm");
                                                    timeInMillisAsDate.getClass();
                                                    mia.b(timeInMillisAsDate, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                                    jt1Var3 = jt1Var2;
                                                    jt1Var3.B();
                                                } else {
                                                    if (ticketAttribute instanceof Ticket.TicketAttribute.FilesAttribute) {
                                                        jt1Var3.K(2135835354);
                                                        FIleAttachmentListKt.FileAttachmentList(null, ((Ticket.TicketAttribute.FilesAttribute) ticketAttribute).getValue(), jt1Var3, 0, 1);
                                                        jt1Var3.B();
                                                        z9 = false;
                                                    } else if (!(ticketAttribute instanceof Ticket.TicketAttribute.UnSupported)) {
                                                        jt1Var3.K(1592882332);
                                                        jt1Var3.B();
                                                        u.b();
                                                        return;
                                                    } else {
                                                        jt1Var3.K(2136019990);
                                                        z9 = false;
                                                        mia.b(((Ticket.TicketAttribute.UnSupported) ticketAttribute).getValue().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                                        jt1Var3 = jt1Var2;
                                                        jt1Var3.B();
                                                    }
                                                    aVar5 = aVar4;
                                                    f2 = 16.0f;
                                                }
                                                b47.b(jt1Var3, ir9.d(aVar5, f2));
                                                aVar9 = aVar5;
                                                z10 = z9;
                                            }
                                        }
                                        aVar5 = aVar4;
                                        f2 = 16.0f;
                                        z9 = false;
                                        b47.b(jt1Var3, ir9.d(aVar5, f2));
                                        aVar9 = aVar5;
                                        z10 = z9;
                                    }
                                    jt1Var3.B();
                                    jt1Var3.I();
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                            } catch (Throwable th) {
                                bVar3.e(iH);
                                throw th;
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4VarO, 12582918, 122);
                    bj4VarO = bj4VarO;
                    bj4VarO.K(1933740142);
                    if (ticketDetailContentState.getConversationButtonState().getShowButton()) {
                        b47.b(bj4VarO, new qs5(true, 1.0f));
                        ox6 ox6VarK = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 16.0f, 1);
                        aj1VarA2 = yi1.a(kVar, di.a.n, bj4VarO, 48);
                        iHashCode3 = Long.hashCode(bj4VarO.T);
                        kw7VarP3 = bj4VarO.P();
                        ox6VarC3 = it1.c(bj4VarO, ox6VarK);
                        if (j1bVar == null) {
                            ml5.c();
                            throw r21;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar2);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, cVar, aj1VarA2);
                        rd7.d(bj4VarO, eVar, kw7VarP3);
                        l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                        rd7.d(bj4VarO, dVar, ox6VarC3);
                        mia.b(nr1.f(bj4VarO, R.string.intercom_tickets_cta_text), ir9.c(aVar, 1.0f), 0L, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i7).getType04Point5(), ac4.b(intercomTheme, bj4VarO, i7), 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 130044);
                        b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                        ConversationButtonState conversationButtonState = ticketDetailContentState.getConversationButtonState();
                        IntercomButton.Style styleM570primaryStyleKlgxPg = IntercomButton.INSTANCE.m570primaryStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                        bj4VarO = bj4VarO;
                        String text = conversationButtonState.getText().getText(bj4VarO, StringProvider.$stable);
                        Integer iconRes = conversationButtonState.getIconRes();
                        bj4VarO.K(233200228);
                        if ((i8 & 896) == 256) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        ticketDetailContentState2 = ticketDetailContentState;
                        zJ = bj4VarO.j(ticketDetailContentState2) | z8;
                        objF3 = bj4VarO.f();
                        if (!zJ || objF3 == c0187a) {
                            oh4Var4 = oh4Var3;
                            objF3 = new mh4() { // from class: tla
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return TicketDetailContentKt.TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4Var4, ticketDetailContentState2);
                                }
                            };
                            bj4VarO.C(objF3);
                        } else {
                            oh4Var4 = oh4Var3;
                        }
                        bj4VarO.U(false);
                        IntercomButtonKt.IntercomButton(null, styleM570primaryStyleKlgxPg, text, iconRes, (mh4) objF3, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                        b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                        bj4VarO.U(true);
                    } else {
                        ticketDetailContentState2 = ticketDetailContentState;
                        oh4Var4 = oh4Var3;
                    }
                    bj4VarO.U(false);
                    bj4VarO.U(true);
                    oh4Var5 = oh4Var4;
                    ox6Var4 = ox6Var3;
                    z7 = z5;
                } else {
                    bj4VarO.u();
                    ox6Var4 = ox6Var2;
                    oh4Var5 = oh4Var2;
                    z7 = z2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: ula
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TicketDetailContentKt.TicketDetailContent$lambda$18(ox6Var4, ticketDetailContentState2, oh4Var5, z7, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i3 & 1171) == 1170) {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var2 = aVar;
                }
                c0187a = jt1.a.a;
                i6 = 1;
                if (i10 != 0) {
                    bj4VarO.K(1639440163);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new b29(i6);
                        bj4VarO.C(objF5);
                    }
                    oh4Var2 = (oh4) objF5;
                    bj4VarO.U(false);
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                Object[] objArr2 = new Object[0];
                bj4VarO.K(1639443041);
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objF = bj4VarO.f();
                if (z4) {
                    objF = new mh4() { // from class: sla
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TicketDetailContentKt.TicketDetailContent$lambda$3$lambda$2(z3);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: sla
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TicketDetailContentKt.TicketDetailContent$lambda$3$lambda$2(z3);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr2, (mh4) objF, bj4VarO, 0);
                bj4VarO.K(1639447110);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = bl7.i(new y43(-56.0f));
                    bj4VarO.C(objF2);
                }
                h37Var2 = (h37) objF2;
                objB = aa0.b(bj4VarO, false, 1639449312);
                z5 = z3;
                if (objB == c0187a) {
                    objB = bl7.i(Float.valueOf(0.0f));
                    bj4VarO.C(objB);
                }
                h37Var3 = (h37) objB;
                bj4VarO.U(false);
                bj4VarO.K(1639450743);
                cardStateTicketDetailContent$lambda$4 = TicketDetailContent$lambda$4(h37Var);
                cardState = CardState.SubmissionCard;
                if (cardStateTicketDetailContent$lambda$4 == cardState) {
                    bj4VarO.K(1639454260);
                    zJ2 = bj4VarO.J(h37Var);
                    objF4 = bj4VarO.f();
                    if (zJ2) {
                        objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(h37Var2, h37Var3, h37Var, null);
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(h37Var2, h37Var3, h37Var, null);
                        bj4VarO.C(objF4);
                    }
                    z6 = false;
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF4, null);
                } else {
                    z6 = false;
                }
                bj4VarO.U(z6);
                ox6 ox6VarH2 = q69.h(ox6Var2.H(ir9.b), q69.f(bj4VarO), 14);
                sp0.a aVar4 = di.a.m;
                kVar = c30.c;
                aj1VarA = yi1.a(kVar, aVar4, bj4VarO, 0);
                ox6Var3 = ox6Var2;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH2);
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
                intercomTheme = IntercomTheme.INSTANCE;
                i7 = IntercomTheme.$stable;
                oh4Var3 = oh4Var2;
                i8 = i3;
                ox6 ox6VarC5 = gi0.c(aVar, kk.a(intercomTheme, bj4VarO, i7), al8.a);
                az3Var = ir9.c;
                ox6 ox6VarA2 = sv.a(ir9.e(ox6VarC5.H(az3Var), 194.0f, 0.0f, 2), xv.c(0, 0, null, 7));
                fl6VarD = dv0.d(di.a.e, false);
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
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                TicketTimelineCardState ticketTimelineCardState2 = ticketDetailContentState.getTicketTimelineCardState();
                if (TicketDetailContent$lambda$4(h37Var) == CardState.TimelineCard) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                TicketTimelineCardKt.TicketTimelineCard(ticketTimelineCardState2, yq5.b(aVar, ((Number) xt.b(f, xv.b(0.0f, 0.0f, null, 7), bj4VarO, 48).getValue()).floatValue()), bj4VarO, 0, 0);
                if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                    fTicketDetailContent$lambda$10 = TicketDetailContent$lambda$10(h37Var3);
                } else {
                    fTicketDetailContent$lambda$10 = 0.0f;
                }
                if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                    aa3Var = null;
                    a04VarB = xv.c(1000, 0, null, 6);
                } else {
                    aa3Var = null;
                    a04VarB = xv.b(0.0f, 0.0f, null, 7);
                }
                TicketSubmissionCard(zf7.b(0.0f, ((y43) xt.a(TicketDetailContent$lambda$7(h37Var2), xv.c(1000, 0, aa3Var, 6), bj4VarO, 48, 12).getValue()).t, yq5.b(aVar, ((Number) xt.b(fTicketDetailContent$lambda$10, a04VarB, bj4VarO, 0).getValue()).floatValue())), bj4VarO, 0, 0);
                bj4VarO.U(true);
                r21 = aa3Var;
                v5a.a(az3Var, null, intercomTheme.getColors(bj4VarO, i7).getBase().m712getBase0d7_KjU(), 0L, 0.0f, 0.0f, null, gr1.b(925724611, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$3$2
                    public final void invoke(jt1 jt1Var2, int i11) {
                        ox6.a aVar5;
                        boolean z9;
                        ox6.a aVar6;
                        float f2;
                        if ((i11 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        ox6.a aVar7 = ox6.a.t;
                        ox6 ox6VarI = eo7.i(aVar7, 16.0f);
                        TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState;
                        c30.k kVar2 = c30.c;
                        sp0.a aVar8 = di.a.m;
                        aj1 aj1VarA3 = yi1.a(kVar2, aVar8, jt1Var2, 0);
                        int iHashCode4 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC6 = it1.c(jt1Var2, ox6VarI);
                        bt1.c.getClass();
                        qr5.a aVar9 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar9);
                        } else {
                            jt1Var2.z();
                        }
                        bt1.a.c cVar2 = bt1.a.f;
                        rd7.d(jt1Var2, cVar2, aj1VarA3);
                        bt1.a.e eVar2 = bt1.a.e;
                        rd7.d(jt1Var2, eVar2, kw7VarY);
                        Integer numValueOf3 = Integer.valueOf(iHashCode4);
                        bt1.a.b bVar2 = bt1.a.g;
                        rd7.d(jt1Var2, bVar2, numValueOf3);
                        bt1.a.C0034a c0034a2 = bt1.a.h;
                        rd7.c(jt1Var2, c0034a2);
                        bt1.a.d dVar2 = bt1.a.d;
                        rd7.d(jt1Var2, dVar2, ox6VarC6);
                        ox6 ox6VarA3 = uma.a(aVar7, ay8.b(8.0f));
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i12 = IntercomTheme.$stable;
                        ox6 ox6VarI2 = eo7.i(ir9.c(gi0.c(ox6VarA3, intercomTheme2.getColors(jt1Var2, i12).m757getBubbleBackground0d7_KjU(), al8.a), 1.0f), 12.0f);
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode5 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY2 = jt1Var2.y();
                        ox6 ox6VarC7 = it1.c(jt1Var2, ox6VarI2);
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar9);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, cVar2, ny8VarA);
                        rd7.d(jt1Var2, eVar2, kw7VarY2);
                        g3.c(iHashCode5, jt1Var2, bVar2, jt1Var2, c0034a2);
                        rd7.d(jt1Var2, dVar2, ox6VarC7);
                        m65.b(is7.a(R.drawable.intercom_ticket_notification, jt1Var2, 0), null, ir9.j(eo7.m(aVar7, 0.0f, 4.0f, 0.0f, 0.0f, 13), 16.0f), intercomTheme2.getColors(jt1Var2, i12).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                        b47.b(jt1Var2, ir9.n(aVar7, 16.0f));
                        wja type04 = intercomTheme2.getTypography(jt1Var2, i12).getType04();
                        jt1Var2.K(1807110638);
                        iw.b bVar3 = new iw.b();
                        jt1Var2.K(1807112122);
                        int iH = bVar3.h(new ww9(0L, 0L, ob4.A, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                        try {
                            bVar3.c(nr1.f(jt1Var2, R.string.intercom_youll_be_notified_here_and_by_email));
                            bVar3.c(" ");
                            g2b g2bVar = g2b.a;
                            bVar3.e(iH);
                            jt1Var2.B();
                            bVar3.c(ticketDetailContentState3.getUserEmail());
                            iw iwVarI = bVar3.i();
                            jt1Var2.B();
                            mia.c(iwVarI, null, ah5.a(intercomTheme2, jt1Var2, i12), 0L, null, 0L, null, cka.b(22), 0, false, 0, 0, null, null, type04, jt1Var2, 0, 48, 260090);
                            jt1 jt1Var3 = jt1Var2;
                            jt1Var3.I();
                            ox6.a aVar10 = aVar7;
                            b47.b(jt1Var3, ir9.d(aVar10, 24.0f));
                            jt1Var3.K(-711350793);
                            if (!ticketDetailContentState3.getTicketAttributes().isEmpty()) {
                                ox6 ox6VarH3 = eo7.k(aVar10, 12.0f, 0.0f, 2).H(ir9.c);
                                boolean z10 = false;
                                aj1 aj1VarA4 = yi1.a(kVar2, aVar8, jt1Var3, 0);
                                int iHashCode6 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC8 = it1.c(jt1Var3, ox6VarH3);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar9);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar2, aj1VarA4);
                                rd7.d(jt1Var3, eVar2, kw7VarY3);
                                g3.c(iHashCode6, jt1Var3, bVar2, jt1Var3, c0034a2);
                                rd7.d(jt1Var3, dVar2, ox6VarC8);
                                jt1Var3.K(1807143465);
                                for (Ticket.TicketAttribute ticketAttribute : ticketDetailContentState3.getTicketAttributes()) {
                                    String name = ticketAttribute.getName();
                                    IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                                    int i13 = IntercomTheme.$stable;
                                    ox6.a aVar11 = aVar10;
                                    mia.b(name, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04SemiBold(), jt1Var2, 0, 0, 131070);
                                    jt1Var3 = jt1Var2;
                                    b47.b(jt1Var3, ir9.d(aVar11, 2.0f));
                                    if (ticketAttribute instanceof Ticket.TicketAttribute.PrimitiveAttribute) {
                                        jt1Var3.K(2134715913);
                                        aVar5 = aVar11;
                                        mia.b(((Ticket.TicketAttribute.PrimitiveAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                        jt1Var3 = jt1Var2;
                                        jt1Var3.B();
                                    } else {
                                        aVar5 = aVar11;
                                        if (ticketAttribute instanceof Ticket.TicketAttribute.ListAttribute) {
                                            jt1Var3.K(2135020457);
                                            mia.b(((Ticket.TicketAttribute.ListAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                            jt1Var3 = jt1Var2;
                                            jt1Var3.B();
                                        } else {
                                            if (ticketAttribute instanceof Ticket.TicketAttribute.DateTimeAttribute) {
                                                jt1Var3.K(2135335386);
                                                String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(Long.parseLong(((Ticket.TicketAttribute.DateTimeAttribute) ticketAttribute).getValue()) * 1000, "dd-MM-yyy, HH:mm");
                                                timeInMillisAsDate.getClass();
                                                mia.b(timeInMillisAsDate, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                                jt1Var3 = jt1Var2;
                                                jt1Var3.B();
                                            } else {
                                                if (ticketAttribute instanceof Ticket.TicketAttribute.FilesAttribute) {
                                                    jt1Var3.K(2135835354);
                                                    FIleAttachmentListKt.FileAttachmentList(null, ((Ticket.TicketAttribute.FilesAttribute) ticketAttribute).getValue(), jt1Var3, 0, 1);
                                                    jt1Var3.B();
                                                    z9 = false;
                                                } else if (!(ticketAttribute instanceof Ticket.TicketAttribute.UnSupported)) {
                                                    jt1Var3.K(1592882332);
                                                    jt1Var3.B();
                                                    u.b();
                                                    return;
                                                } else {
                                                    jt1Var3.K(2136019990);
                                                    z9 = false;
                                                    mia.b(((Ticket.TicketAttribute.UnSupported) ticketAttribute).getValue().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                                    jt1Var3 = jt1Var2;
                                                    jt1Var3.B();
                                                }
                                                aVar6 = aVar5;
                                                f2 = 16.0f;
                                            }
                                            b47.b(jt1Var3, ir9.d(aVar6, f2));
                                            aVar10 = aVar6;
                                            z10 = z9;
                                        }
                                    }
                                    aVar6 = aVar5;
                                    f2 = 16.0f;
                                    z9 = false;
                                    b47.b(jt1Var3, ir9.d(aVar6, f2));
                                    aVar10 = aVar6;
                                    z10 = z9;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                        } catch (Throwable th) {
                            bVar3.e(iH);
                            throw th;
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 12582918, 122);
                bj4VarO = bj4VarO;
                bj4VarO.K(1933740142);
                if (ticketDetailContentState.getConversationButtonState().getShowButton()) {
                    b47.b(bj4VarO, new qs5(true, 1.0f));
                    ox6 ox6VarK2 = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 16.0f, 1);
                    aj1VarA2 = yi1.a(kVar, di.a.n, bj4VarO, 48);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarK2);
                    if (j1bVar == null) {
                        ml5.c();
                        throw r21;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    mia.b(nr1.f(bj4VarO, R.string.intercom_tickets_cta_text), ir9.c(aVar, 1.0f), 0L, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i7).getType04Point5(), ac4.b(intercomTheme, bj4VarO, i7), 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 130044);
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    ConversationButtonState conversationButtonState2 = ticketDetailContentState.getConversationButtonState();
                    IntercomButton.Style styleM570primaryStyleKlgxPg2 = IntercomButton.INSTANCE.m570primaryStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                    bj4VarO = bj4VarO;
                    String text2 = conversationButtonState2.getText().getText(bj4VarO, StringProvider.$stable);
                    Integer iconRes2 = conversationButtonState2.getIconRes();
                    bj4VarO.K(233200228);
                    if ((i8 & 896) == 256) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    ticketDetailContentState2 = ticketDetailContentState;
                    zJ = bj4VarO.j(ticketDetailContentState2) | z8;
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        oh4Var4 = oh4Var3;
                        objF3 = new mh4() { // from class: tla
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TicketDetailContentKt.TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4Var4, ticketDetailContentState2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        oh4Var4 = oh4Var3;
                        objF3 = new mh4() { // from class: tla
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TicketDetailContentKt.TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4Var4, ticketDetailContentState2);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    IntercomButtonKt.IntercomButton(null, styleM570primaryStyleKlgxPg2, text2, iconRes2, (mh4) objF3, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.U(true);
                } else {
                    ticketDetailContentState2 = ticketDetailContentState;
                    oh4Var4 = oh4Var3;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var5 = oh4Var4;
                ox6Var4 = ox6Var3;
                z7 = z5;
            } else {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var2 = aVar;
                }
                c0187a = jt1.a.a;
                i6 = 1;
                if (i10 != 0) {
                    bj4VarO.K(1639440163);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new b29(i6);
                        bj4VarO.C(objF5);
                    }
                    oh4Var2 = (oh4) objF5;
                    bj4VarO.U(false);
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                Object[] objArr3 = new Object[0];
                bj4VarO.K(1639443041);
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objF = bj4VarO.f();
                if (z4) {
                    objF = new mh4() { // from class: sla
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TicketDetailContentKt.TicketDetailContent$lambda$3$lambda$2(z3);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: sla
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TicketDetailContentKt.TicketDetailContent$lambda$3$lambda$2(z3);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr3, (mh4) objF, bj4VarO, 0);
                bj4VarO.K(1639447110);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = bl7.i(new y43(-56.0f));
                    bj4VarO.C(objF2);
                }
                h37Var2 = (h37) objF2;
                objB = aa0.b(bj4VarO, false, 1639449312);
                z5 = z3;
                if (objB == c0187a) {
                    objB = bl7.i(Float.valueOf(0.0f));
                    bj4VarO.C(objB);
                }
                h37Var3 = (h37) objB;
                bj4VarO.U(false);
                bj4VarO.K(1639450743);
                cardStateTicketDetailContent$lambda$4 = TicketDetailContent$lambda$4(h37Var);
                cardState = CardState.SubmissionCard;
                if (cardStateTicketDetailContent$lambda$4 == cardState) {
                    bj4VarO.K(1639454260);
                    zJ2 = bj4VarO.J(h37Var);
                    objF4 = bj4VarO.f();
                    if (zJ2) {
                        objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(h37Var2, h37Var3, h37Var, null);
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(h37Var2, h37Var3, h37Var, null);
                        bj4VarO.C(objF4);
                    }
                    z6 = false;
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF4, null);
                } else {
                    z6 = false;
                }
                bj4VarO.U(z6);
                ox6 ox6VarH3 = q69.h(ox6Var2.H(ir9.b), q69.f(bj4VarO), 14);
                sp0.a aVar5 = di.a.m;
                kVar = c30.c;
                aj1VarA = yi1.a(kVar, aVar5, bj4VarO, 0);
                ox6Var3 = ox6Var2;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH3);
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
                intercomTheme = IntercomTheme.INSTANCE;
                i7 = IntercomTheme.$stable;
                oh4Var3 = oh4Var2;
                i8 = i3;
                ox6 ox6VarC6 = gi0.c(aVar, kk.a(intercomTheme, bj4VarO, i7), al8.a);
                az3Var = ir9.c;
                ox6 ox6VarA3 = sv.a(ir9.e(ox6VarC6.H(az3Var), 194.0f, 0.0f, 2), xv.c(0, 0, null, 7));
                fl6VarD = dv0.d(di.a.e, false);
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
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                TicketTimelineCardState ticketTimelineCardState3 = ticketDetailContentState.getTicketTimelineCardState();
                if (TicketDetailContent$lambda$4(h37Var) == CardState.TimelineCard) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                TicketTimelineCardKt.TicketTimelineCard(ticketTimelineCardState3, yq5.b(aVar, ((Number) xt.b(f, xv.b(0.0f, 0.0f, null, 7), bj4VarO, 48).getValue()).floatValue()), bj4VarO, 0, 0);
                if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                    fTicketDetailContent$lambda$10 = TicketDetailContent$lambda$10(h37Var3);
                } else {
                    fTicketDetailContent$lambda$10 = 0.0f;
                }
                if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                    aa3Var = null;
                    a04VarB = xv.c(1000, 0, null, 6);
                } else {
                    aa3Var = null;
                    a04VarB = xv.b(0.0f, 0.0f, null, 7);
                }
                TicketSubmissionCard(zf7.b(0.0f, ((y43) xt.a(TicketDetailContent$lambda$7(h37Var2), xv.c(1000, 0, aa3Var, 6), bj4VarO, 48, 12).getValue()).t, yq5.b(aVar, ((Number) xt.b(fTicketDetailContent$lambda$10, a04VarB, bj4VarO, 0).getValue()).floatValue())), bj4VarO, 0, 0);
                bj4VarO.U(true);
                r21 = aa3Var;
                v5a.a(az3Var, null, intercomTheme.getColors(bj4VarO, i7).getBase().m712getBase0d7_KjU(), 0L, 0.0f, 0.0f, null, gr1.b(925724611, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$3$2
                    public final void invoke(jt1 jt1Var2, int i11) {
                        ox6.a aVar6;
                        boolean z9;
                        ox6.a aVar7;
                        float f2;
                        if ((i11 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        ox6.a aVar8 = ox6.a.t;
                        ox6 ox6VarI = eo7.i(aVar8, 16.0f);
                        TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState;
                        c30.k kVar2 = c30.c;
                        sp0.a aVar9 = di.a.m;
                        aj1 aj1VarA3 = yi1.a(kVar2, aVar9, jt1Var2, 0);
                        int iHashCode4 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC7 = it1.c(jt1Var2, ox6VarI);
                        bt1.c.getClass();
                        qr5.a aVar10 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar10);
                        } else {
                            jt1Var2.z();
                        }
                        bt1.a.c cVar2 = bt1.a.f;
                        rd7.d(jt1Var2, cVar2, aj1VarA3);
                        bt1.a.e eVar2 = bt1.a.e;
                        rd7.d(jt1Var2, eVar2, kw7VarY);
                        Integer numValueOf4 = Integer.valueOf(iHashCode4);
                        bt1.a.b bVar2 = bt1.a.g;
                        rd7.d(jt1Var2, bVar2, numValueOf4);
                        bt1.a.C0034a c0034a2 = bt1.a.h;
                        rd7.c(jt1Var2, c0034a2);
                        bt1.a.d dVar2 = bt1.a.d;
                        rd7.d(jt1Var2, dVar2, ox6VarC7);
                        ox6 ox6VarA4 = uma.a(aVar8, ay8.b(8.0f));
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i12 = IntercomTheme.$stable;
                        ox6 ox6VarI2 = eo7.i(ir9.c(gi0.c(ox6VarA4, intercomTheme2.getColors(jt1Var2, i12).m757getBubbleBackground0d7_KjU(), al8.a), 1.0f), 12.0f);
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode5 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY2 = jt1Var2.y();
                        ox6 ox6VarC8 = it1.c(jt1Var2, ox6VarI2);
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar10);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, cVar2, ny8VarA);
                        rd7.d(jt1Var2, eVar2, kw7VarY2);
                        g3.c(iHashCode5, jt1Var2, bVar2, jt1Var2, c0034a2);
                        rd7.d(jt1Var2, dVar2, ox6VarC8);
                        m65.b(is7.a(R.drawable.intercom_ticket_notification, jt1Var2, 0), null, ir9.j(eo7.m(aVar8, 0.0f, 4.0f, 0.0f, 0.0f, 13), 16.0f), intercomTheme2.getColors(jt1Var2, i12).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                        b47.b(jt1Var2, ir9.n(aVar8, 16.0f));
                        wja type04 = intercomTheme2.getTypography(jt1Var2, i12).getType04();
                        jt1Var2.K(1807110638);
                        iw.b bVar3 = new iw.b();
                        jt1Var2.K(1807112122);
                        int iH = bVar3.h(new ww9(0L, 0L, ob4.A, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                        try {
                            bVar3.c(nr1.f(jt1Var2, R.string.intercom_youll_be_notified_here_and_by_email));
                            bVar3.c(" ");
                            g2b g2bVar = g2b.a;
                            bVar3.e(iH);
                            jt1Var2.B();
                            bVar3.c(ticketDetailContentState3.getUserEmail());
                            iw iwVarI = bVar3.i();
                            jt1Var2.B();
                            mia.c(iwVarI, null, ah5.a(intercomTheme2, jt1Var2, i12), 0L, null, 0L, null, cka.b(22), 0, false, 0, 0, null, null, type04, jt1Var2, 0, 48, 260090);
                            jt1 jt1Var3 = jt1Var2;
                            jt1Var3.I();
                            ox6.a aVar11 = aVar8;
                            b47.b(jt1Var3, ir9.d(aVar11, 24.0f));
                            jt1Var3.K(-711350793);
                            if (!ticketDetailContentState3.getTicketAttributes().isEmpty()) {
                                ox6 ox6VarH4 = eo7.k(aVar11, 12.0f, 0.0f, 2).H(ir9.c);
                                boolean z10 = false;
                                aj1 aj1VarA4 = yi1.a(kVar2, aVar9, jt1Var3, 0);
                                int iHashCode6 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC9 = it1.c(jt1Var3, ox6VarH4);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar10);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar2, aj1VarA4);
                                rd7.d(jt1Var3, eVar2, kw7VarY3);
                                g3.c(iHashCode6, jt1Var3, bVar2, jt1Var3, c0034a2);
                                rd7.d(jt1Var3, dVar2, ox6VarC9);
                                jt1Var3.K(1807143465);
                                for (Ticket.TicketAttribute ticketAttribute : ticketDetailContentState3.getTicketAttributes()) {
                                    String name = ticketAttribute.getName();
                                    IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                                    int i13 = IntercomTheme.$stable;
                                    ox6.a aVar12 = aVar11;
                                    mia.b(name, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04SemiBold(), jt1Var2, 0, 0, 131070);
                                    jt1Var3 = jt1Var2;
                                    b47.b(jt1Var3, ir9.d(aVar12, 2.0f));
                                    if (ticketAttribute instanceof Ticket.TicketAttribute.PrimitiveAttribute) {
                                        jt1Var3.K(2134715913);
                                        aVar6 = aVar12;
                                        mia.b(((Ticket.TicketAttribute.PrimitiveAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                        jt1Var3 = jt1Var2;
                                        jt1Var3.B();
                                    } else {
                                        aVar6 = aVar12;
                                        if (ticketAttribute instanceof Ticket.TicketAttribute.ListAttribute) {
                                            jt1Var3.K(2135020457);
                                            mia.b(((Ticket.TicketAttribute.ListAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                            jt1Var3 = jt1Var2;
                                            jt1Var3.B();
                                        } else {
                                            if (ticketAttribute instanceof Ticket.TicketAttribute.DateTimeAttribute) {
                                                jt1Var3.K(2135335386);
                                                String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(Long.parseLong(((Ticket.TicketAttribute.DateTimeAttribute) ticketAttribute).getValue()) * 1000, "dd-MM-yyy, HH:mm");
                                                timeInMillisAsDate.getClass();
                                                mia.b(timeInMillisAsDate, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                                jt1Var3 = jt1Var2;
                                                jt1Var3.B();
                                            } else {
                                                if (ticketAttribute instanceof Ticket.TicketAttribute.FilesAttribute) {
                                                    jt1Var3.K(2135835354);
                                                    FIleAttachmentListKt.FileAttachmentList(null, ((Ticket.TicketAttribute.FilesAttribute) ticketAttribute).getValue(), jt1Var3, 0, 1);
                                                    jt1Var3.B();
                                                    z9 = false;
                                                } else if (!(ticketAttribute instanceof Ticket.TicketAttribute.UnSupported)) {
                                                    jt1Var3.K(1592882332);
                                                    jt1Var3.B();
                                                    u.b();
                                                    return;
                                                } else {
                                                    jt1Var3.K(2136019990);
                                                    z9 = false;
                                                    mia.b(((Ticket.TicketAttribute.UnSupported) ticketAttribute).getValue().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                                    jt1Var3 = jt1Var2;
                                                    jt1Var3.B();
                                                }
                                                aVar7 = aVar6;
                                                f2 = 16.0f;
                                            }
                                            b47.b(jt1Var3, ir9.d(aVar7, f2));
                                            aVar11 = aVar7;
                                            z10 = z9;
                                        }
                                    }
                                    aVar7 = aVar6;
                                    f2 = 16.0f;
                                    z9 = false;
                                    b47.b(jt1Var3, ir9.d(aVar7, f2));
                                    aVar11 = aVar7;
                                    z10 = z9;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                        } catch (Throwable th) {
                            bVar3.e(iH);
                            throw th;
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 12582918, 122);
                bj4VarO = bj4VarO;
                bj4VarO.K(1933740142);
                if (ticketDetailContentState.getConversationButtonState().getShowButton()) {
                    b47.b(bj4VarO, new qs5(true, 1.0f));
                    ox6 ox6VarK3 = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 16.0f, 1);
                    aj1VarA2 = yi1.a(kVar, di.a.n, bj4VarO, 48);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarK3);
                    if (j1bVar == null) {
                        ml5.c();
                        throw r21;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    mia.b(nr1.f(bj4VarO, R.string.intercom_tickets_cta_text), ir9.c(aVar, 1.0f), 0L, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i7).getType04Point5(), ac4.b(intercomTheme, bj4VarO, i7), 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 130044);
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    ConversationButtonState conversationButtonState3 = ticketDetailContentState.getConversationButtonState();
                    IntercomButton.Style styleM570primaryStyleKlgxPg3 = IntercomButton.INSTANCE.m570primaryStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                    bj4VarO = bj4VarO;
                    String text3 = conversationButtonState3.getText().getText(bj4VarO, StringProvider.$stable);
                    Integer iconRes3 = conversationButtonState3.getIconRes();
                    bj4VarO.K(233200228);
                    if ((i8 & 896) == 256) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    ticketDetailContentState2 = ticketDetailContentState;
                    zJ = bj4VarO.j(ticketDetailContentState2) | z8;
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        oh4Var4 = oh4Var3;
                        objF3 = new mh4() { // from class: tla
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TicketDetailContentKt.TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4Var4, ticketDetailContentState2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        oh4Var4 = oh4Var3;
                        objF3 = new mh4() { // from class: tla
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TicketDetailContentKt.TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4Var4, ticketDetailContentState2);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    IntercomButtonKt.IntercomButton(null, styleM570primaryStyleKlgxPg3, text3, iconRes3, (mh4) objF3, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.U(true);
                } else {
                    ticketDetailContentState2 = ticketDetailContentState;
                    oh4Var4 = oh4Var3;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var5 = oh4Var4;
                ox6Var4 = ox6Var3;
                z7 = z5;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ula
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketDetailContentKt.TicketDetailContent$lambda$18(ox6Var4, ticketDetailContentState2, oh4Var5, z7, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        oh4Var2 = oh4Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (bj4VarO.c(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 1171) == 1170) {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var2 = aVar;
                }
                c0187a = jt1.a.a;
                i6 = 1;
                if (i10 != 0) {
                    bj4VarO.K(1639440163);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new b29(i6);
                        bj4VarO.C(objF5);
                    }
                    oh4Var2 = (oh4) objF5;
                    bj4VarO.U(false);
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                Object[] objArr4 = new Object[0];
                bj4VarO.K(1639443041);
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objF = bj4VarO.f();
                if (z4) {
                    objF = new mh4() { // from class: sla
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TicketDetailContentKt.TicketDetailContent$lambda$3$lambda$2(z3);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: sla
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TicketDetailContentKt.TicketDetailContent$lambda$3$lambda$2(z3);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr4, (mh4) objF, bj4VarO, 0);
                bj4VarO.K(1639447110);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = bl7.i(new y43(-56.0f));
                    bj4VarO.C(objF2);
                }
                h37Var2 = (h37) objF2;
                objB = aa0.b(bj4VarO, false, 1639449312);
                z5 = z3;
                if (objB == c0187a) {
                    objB = bl7.i(Float.valueOf(0.0f));
                    bj4VarO.C(objB);
                }
                h37Var3 = (h37) objB;
                bj4VarO.U(false);
                bj4VarO.K(1639450743);
                cardStateTicketDetailContent$lambda$4 = TicketDetailContent$lambda$4(h37Var);
                cardState = CardState.SubmissionCard;
                if (cardStateTicketDetailContent$lambda$4 == cardState) {
                    bj4VarO.K(1639454260);
                    zJ2 = bj4VarO.J(h37Var);
                    objF4 = bj4VarO.f();
                    if (zJ2) {
                        objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(h37Var2, h37Var3, h37Var, null);
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(h37Var2, h37Var3, h37Var, null);
                        bj4VarO.C(objF4);
                    }
                    z6 = false;
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF4, null);
                } else {
                    z6 = false;
                }
                bj4VarO.U(z6);
                ox6 ox6VarH4 = q69.h(ox6Var2.H(ir9.b), q69.f(bj4VarO), 14);
                sp0.a aVar6 = di.a.m;
                kVar = c30.c;
                aj1VarA = yi1.a(kVar, aVar6, bj4VarO, 0);
                ox6Var3 = ox6Var2;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH4);
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
                Integer numValueOf4 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf4);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                intercomTheme = IntercomTheme.INSTANCE;
                i7 = IntercomTheme.$stable;
                oh4Var3 = oh4Var2;
                i8 = i3;
                ox6 ox6VarC7 = gi0.c(aVar, kk.a(intercomTheme, bj4VarO, i7), al8.a);
                az3Var = ir9.c;
                ox6 ox6VarA4 = sv.a(ir9.e(ox6VarC7.H(az3Var), 194.0f, 0.0f, 2), xv.c(0, 0, null, 7));
                fl6VarD = dv0.d(di.a.e, false);
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
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                TicketTimelineCardState ticketTimelineCardState4 = ticketDetailContentState.getTicketTimelineCardState();
                if (TicketDetailContent$lambda$4(h37Var) == CardState.TimelineCard) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                TicketTimelineCardKt.TicketTimelineCard(ticketTimelineCardState4, yq5.b(aVar, ((Number) xt.b(f, xv.b(0.0f, 0.0f, null, 7), bj4VarO, 48).getValue()).floatValue()), bj4VarO, 0, 0);
                if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                    fTicketDetailContent$lambda$10 = TicketDetailContent$lambda$10(h37Var3);
                } else {
                    fTicketDetailContent$lambda$10 = 0.0f;
                }
                if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                    aa3Var = null;
                    a04VarB = xv.c(1000, 0, null, 6);
                } else {
                    aa3Var = null;
                    a04VarB = xv.b(0.0f, 0.0f, null, 7);
                }
                TicketSubmissionCard(zf7.b(0.0f, ((y43) xt.a(TicketDetailContent$lambda$7(h37Var2), xv.c(1000, 0, aa3Var, 6), bj4VarO, 48, 12).getValue()).t, yq5.b(aVar, ((Number) xt.b(fTicketDetailContent$lambda$10, a04VarB, bj4VarO, 0).getValue()).floatValue())), bj4VarO, 0, 0);
                bj4VarO.U(true);
                r21 = aa3Var;
                v5a.a(az3Var, null, intercomTheme.getColors(bj4VarO, i7).getBase().m712getBase0d7_KjU(), 0L, 0.0f, 0.0f, null, gr1.b(925724611, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$3$2
                    public final void invoke(jt1 jt1Var2, int i11) {
                        ox6.a aVar7;
                        boolean z9;
                        ox6.a aVar8;
                        float f2;
                        if ((i11 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        ox6.a aVar9 = ox6.a.t;
                        ox6 ox6VarI = eo7.i(aVar9, 16.0f);
                        TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState;
                        c30.k kVar2 = c30.c;
                        sp0.a aVar10 = di.a.m;
                        aj1 aj1VarA3 = yi1.a(kVar2, aVar10, jt1Var2, 0);
                        int iHashCode4 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC8 = it1.c(jt1Var2, ox6VarI);
                        bt1.c.getClass();
                        qr5.a aVar11 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar11);
                        } else {
                            jt1Var2.z();
                        }
                        bt1.a.c cVar2 = bt1.a.f;
                        rd7.d(jt1Var2, cVar2, aj1VarA3);
                        bt1.a.e eVar2 = bt1.a.e;
                        rd7.d(jt1Var2, eVar2, kw7VarY);
                        Integer numValueOf5 = Integer.valueOf(iHashCode4);
                        bt1.a.b bVar2 = bt1.a.g;
                        rd7.d(jt1Var2, bVar2, numValueOf5);
                        bt1.a.C0034a c0034a2 = bt1.a.h;
                        rd7.c(jt1Var2, c0034a2);
                        bt1.a.d dVar2 = bt1.a.d;
                        rd7.d(jt1Var2, dVar2, ox6VarC8);
                        ox6 ox6VarA5 = uma.a(aVar9, ay8.b(8.0f));
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i12 = IntercomTheme.$stable;
                        ox6 ox6VarI2 = eo7.i(ir9.c(gi0.c(ox6VarA5, intercomTheme2.getColors(jt1Var2, i12).m757getBubbleBackground0d7_KjU(), al8.a), 1.0f), 12.0f);
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode5 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY2 = jt1Var2.y();
                        ox6 ox6VarC9 = it1.c(jt1Var2, ox6VarI2);
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar11);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, cVar2, ny8VarA);
                        rd7.d(jt1Var2, eVar2, kw7VarY2);
                        g3.c(iHashCode5, jt1Var2, bVar2, jt1Var2, c0034a2);
                        rd7.d(jt1Var2, dVar2, ox6VarC9);
                        m65.b(is7.a(R.drawable.intercom_ticket_notification, jt1Var2, 0), null, ir9.j(eo7.m(aVar9, 0.0f, 4.0f, 0.0f, 0.0f, 13), 16.0f), intercomTheme2.getColors(jt1Var2, i12).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                        b47.b(jt1Var2, ir9.n(aVar9, 16.0f));
                        wja type04 = intercomTheme2.getTypography(jt1Var2, i12).getType04();
                        jt1Var2.K(1807110638);
                        iw.b bVar3 = new iw.b();
                        jt1Var2.K(1807112122);
                        int iH = bVar3.h(new ww9(0L, 0L, ob4.A, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                        try {
                            bVar3.c(nr1.f(jt1Var2, R.string.intercom_youll_be_notified_here_and_by_email));
                            bVar3.c(" ");
                            g2b g2bVar = g2b.a;
                            bVar3.e(iH);
                            jt1Var2.B();
                            bVar3.c(ticketDetailContentState3.getUserEmail());
                            iw iwVarI = bVar3.i();
                            jt1Var2.B();
                            mia.c(iwVarI, null, ah5.a(intercomTheme2, jt1Var2, i12), 0L, null, 0L, null, cka.b(22), 0, false, 0, 0, null, null, type04, jt1Var2, 0, 48, 260090);
                            jt1 jt1Var3 = jt1Var2;
                            jt1Var3.I();
                            ox6.a aVar12 = aVar9;
                            b47.b(jt1Var3, ir9.d(aVar12, 24.0f));
                            jt1Var3.K(-711350793);
                            if (!ticketDetailContentState3.getTicketAttributes().isEmpty()) {
                                ox6 ox6VarH5 = eo7.k(aVar12, 12.0f, 0.0f, 2).H(ir9.c);
                                boolean z10 = false;
                                aj1 aj1VarA4 = yi1.a(kVar2, aVar10, jt1Var3, 0);
                                int iHashCode6 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC10 = it1.c(jt1Var3, ox6VarH5);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar11);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar2, aj1VarA4);
                                rd7.d(jt1Var3, eVar2, kw7VarY3);
                                g3.c(iHashCode6, jt1Var3, bVar2, jt1Var3, c0034a2);
                                rd7.d(jt1Var3, dVar2, ox6VarC10);
                                jt1Var3.K(1807143465);
                                for (Ticket.TicketAttribute ticketAttribute : ticketDetailContentState3.getTicketAttributes()) {
                                    String name = ticketAttribute.getName();
                                    IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                                    int i13 = IntercomTheme.$stable;
                                    ox6.a aVar13 = aVar12;
                                    mia.b(name, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04SemiBold(), jt1Var2, 0, 0, 131070);
                                    jt1Var3 = jt1Var2;
                                    b47.b(jt1Var3, ir9.d(aVar13, 2.0f));
                                    if (ticketAttribute instanceof Ticket.TicketAttribute.PrimitiveAttribute) {
                                        jt1Var3.K(2134715913);
                                        aVar7 = aVar13;
                                        mia.b(((Ticket.TicketAttribute.PrimitiveAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                        jt1Var3 = jt1Var2;
                                        jt1Var3.B();
                                    } else {
                                        aVar7 = aVar13;
                                        if (ticketAttribute instanceof Ticket.TicketAttribute.ListAttribute) {
                                            jt1Var3.K(2135020457);
                                            mia.b(((Ticket.TicketAttribute.ListAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                            jt1Var3 = jt1Var2;
                                            jt1Var3.B();
                                        } else {
                                            if (ticketAttribute instanceof Ticket.TicketAttribute.DateTimeAttribute) {
                                                jt1Var3.K(2135335386);
                                                String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(Long.parseLong(((Ticket.TicketAttribute.DateTimeAttribute) ticketAttribute).getValue()) * 1000, "dd-MM-yyy, HH:mm");
                                                timeInMillisAsDate.getClass();
                                                mia.b(timeInMillisAsDate, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                                jt1Var3 = jt1Var2;
                                                jt1Var3.B();
                                            } else {
                                                if (ticketAttribute instanceof Ticket.TicketAttribute.FilesAttribute) {
                                                    jt1Var3.K(2135835354);
                                                    FIleAttachmentListKt.FileAttachmentList(null, ((Ticket.TicketAttribute.FilesAttribute) ticketAttribute).getValue(), jt1Var3, 0, 1);
                                                    jt1Var3.B();
                                                    z9 = false;
                                                } else if (!(ticketAttribute instanceof Ticket.TicketAttribute.UnSupported)) {
                                                    jt1Var3.K(1592882332);
                                                    jt1Var3.B();
                                                    u.b();
                                                    return;
                                                } else {
                                                    jt1Var3.K(2136019990);
                                                    z9 = false;
                                                    mia.b(((Ticket.TicketAttribute.UnSupported) ticketAttribute).getValue().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                                    jt1Var3 = jt1Var2;
                                                    jt1Var3.B();
                                                }
                                                aVar8 = aVar7;
                                                f2 = 16.0f;
                                            }
                                            b47.b(jt1Var3, ir9.d(aVar8, f2));
                                            aVar12 = aVar8;
                                            z10 = z9;
                                        }
                                    }
                                    aVar8 = aVar7;
                                    f2 = 16.0f;
                                    z9 = false;
                                    b47.b(jt1Var3, ir9.d(aVar8, f2));
                                    aVar12 = aVar8;
                                    z10 = z9;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                        } catch (Throwable th) {
                            bVar3.e(iH);
                            throw th;
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 12582918, 122);
                bj4VarO = bj4VarO;
                bj4VarO.K(1933740142);
                if (ticketDetailContentState.getConversationButtonState().getShowButton()) {
                    b47.b(bj4VarO, new qs5(true, 1.0f));
                    ox6 ox6VarK4 = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 16.0f, 1);
                    aj1VarA2 = yi1.a(kVar, di.a.n, bj4VarO, 48);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarK4);
                    if (j1bVar == null) {
                        ml5.c();
                        throw r21;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    mia.b(nr1.f(bj4VarO, R.string.intercom_tickets_cta_text), ir9.c(aVar, 1.0f), 0L, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i7).getType04Point5(), ac4.b(intercomTheme, bj4VarO, i7), 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 130044);
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    ConversationButtonState conversationButtonState4 = ticketDetailContentState.getConversationButtonState();
                    IntercomButton.Style styleM570primaryStyleKlgxPg4 = IntercomButton.INSTANCE.m570primaryStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                    bj4VarO = bj4VarO;
                    String text4 = conversationButtonState4.getText().getText(bj4VarO, StringProvider.$stable);
                    Integer iconRes4 = conversationButtonState4.getIconRes();
                    bj4VarO.K(233200228);
                    if ((i8 & 896) == 256) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    ticketDetailContentState2 = ticketDetailContentState;
                    zJ = bj4VarO.j(ticketDetailContentState2) | z8;
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        oh4Var4 = oh4Var3;
                        objF3 = new mh4() { // from class: tla
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TicketDetailContentKt.TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4Var4, ticketDetailContentState2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        oh4Var4 = oh4Var3;
                        objF3 = new mh4() { // from class: tla
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TicketDetailContentKt.TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4Var4, ticketDetailContentState2);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    IntercomButtonKt.IntercomButton(null, styleM570primaryStyleKlgxPg4, text4, iconRes4, (mh4) objF3, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.U(true);
                } else {
                    ticketDetailContentState2 = ticketDetailContentState;
                    oh4Var4 = oh4Var3;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var5 = oh4Var4;
                ox6Var4 = ox6Var3;
                z7 = z5;
            } else {
                aVar = ox6.a.t;
                if (i9 != 0) {
                    ox6Var2 = aVar;
                }
                c0187a = jt1.a.a;
                i6 = 1;
                if (i10 != 0) {
                    bj4VarO.K(1639440163);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new b29(i6);
                        bj4VarO.C(objF5);
                    }
                    oh4Var2 = (oh4) objF5;
                    bj4VarO.U(false);
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                Object[] objArr5 = new Object[0];
                bj4VarO.K(1639443041);
                if ((i3 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objF = bj4VarO.f();
                if (z4) {
                    objF = new mh4() { // from class: sla
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TicketDetailContentKt.TicketDetailContent$lambda$3$lambda$2(z3);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: sla
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TicketDetailContentKt.TicketDetailContent$lambda$3$lambda$2(z3);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr5, (mh4) objF, bj4VarO, 0);
                bj4VarO.K(1639447110);
                objF2 = bj4VarO.f();
                if (objF2 == c0187a) {
                    objF2 = bl7.i(new y43(-56.0f));
                    bj4VarO.C(objF2);
                }
                h37Var2 = (h37) objF2;
                objB = aa0.b(bj4VarO, false, 1639449312);
                z5 = z3;
                if (objB == c0187a) {
                    objB = bl7.i(Float.valueOf(0.0f));
                    bj4VarO.C(objB);
                }
                h37Var3 = (h37) objB;
                bj4VarO.U(false);
                bj4VarO.K(1639450743);
                cardStateTicketDetailContent$lambda$4 = TicketDetailContent$lambda$4(h37Var);
                cardState = CardState.SubmissionCard;
                if (cardStateTicketDetailContent$lambda$4 == cardState) {
                    bj4VarO.K(1639454260);
                    zJ2 = bj4VarO.J(h37Var);
                    objF4 = bj4VarO.f();
                    if (zJ2) {
                        objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(h37Var2, h37Var3, h37Var, null);
                        bj4VarO.C(objF4);
                    } else {
                        objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(h37Var2, h37Var3, h37Var, null);
                        bj4VarO.C(objF4);
                    }
                    z6 = false;
                    bj4VarO.U(false);
                    wd3.d(bj4VarO, (ci4) objF4, null);
                } else {
                    z6 = false;
                }
                bj4VarO.U(z6);
                ox6 ox6VarH5 = q69.h(ox6Var2.H(ir9.b), q69.f(bj4VarO), 14);
                sp0.a aVar7 = di.a.m;
                kVar = c30.c;
                aj1VarA = yi1.a(kVar, aVar7, bj4VarO, 0);
                ox6Var3 = ox6Var2;
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH5);
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
                Integer numValueOf5 = Integer.valueOf(iHashCode);
                bVar = bt1.a.g;
                rd7.d(bj4VarO, bVar, numValueOf5);
                c0034a = bt1.a.h;
                rd7.c(bj4VarO, c0034a);
                dVar = bt1.a.d;
                rd7.d(bj4VarO, dVar, ox6VarC);
                intercomTheme = IntercomTheme.INSTANCE;
                i7 = IntercomTheme.$stable;
                oh4Var3 = oh4Var2;
                i8 = i3;
                ox6 ox6VarC8 = gi0.c(aVar, kk.a(intercomTheme, bj4VarO, i7), al8.a);
                az3Var = ir9.c;
                ox6 ox6VarA5 = sv.a(ir9.e(ox6VarC8.H(az3Var), 194.0f, 0.0f, 2), xv.c(0, 0, null, 7));
                fl6VarD = dv0.d(di.a.e, false);
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
                rd7.d(bj4VarO, cVar, fl6VarD);
                rd7.d(bj4VarO, eVar, kw7VarP2);
                l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC2);
                TicketTimelineCardState ticketTimelineCardState5 = ticketDetailContentState.getTicketTimelineCardState();
                if (TicketDetailContent$lambda$4(h37Var) == CardState.TimelineCard) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                TicketTimelineCardKt.TicketTimelineCard(ticketTimelineCardState5, yq5.b(aVar, ((Number) xt.b(f, xv.b(0.0f, 0.0f, null, 7), bj4VarO, 48).getValue()).floatValue()), bj4VarO, 0, 0);
                if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                    fTicketDetailContent$lambda$10 = TicketDetailContent$lambda$10(h37Var3);
                } else {
                    fTicketDetailContent$lambda$10 = 0.0f;
                }
                if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                    aa3Var = null;
                    a04VarB = xv.c(1000, 0, null, 6);
                } else {
                    aa3Var = null;
                    a04VarB = xv.b(0.0f, 0.0f, null, 7);
                }
                TicketSubmissionCard(zf7.b(0.0f, ((y43) xt.a(TicketDetailContent$lambda$7(h37Var2), xv.c(1000, 0, aa3Var, 6), bj4VarO, 48, 12).getValue()).t, yq5.b(aVar, ((Number) xt.b(fTicketDetailContent$lambda$10, a04VarB, bj4VarO, 0).getValue()).floatValue())), bj4VarO, 0, 0);
                bj4VarO.U(true);
                r21 = aa3Var;
                v5a.a(az3Var, null, intercomTheme.getColors(bj4VarO, i7).getBase().m712getBase0d7_KjU(), 0L, 0.0f, 0.0f, null, gr1.b(925724611, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$3$2
                    public final void invoke(jt1 jt1Var2, int i11) {
                        ox6.a aVar8;
                        boolean z9;
                        ox6.a aVar9;
                        float f2;
                        if ((i11 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        ox6.a aVar10 = ox6.a.t;
                        ox6 ox6VarI = eo7.i(aVar10, 16.0f);
                        TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState;
                        c30.k kVar2 = c30.c;
                        sp0.a aVar11 = di.a.m;
                        aj1 aj1VarA3 = yi1.a(kVar2, aVar11, jt1Var2, 0);
                        int iHashCode4 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC9 = it1.c(jt1Var2, ox6VarI);
                        bt1.c.getClass();
                        qr5.a aVar12 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar12);
                        } else {
                            jt1Var2.z();
                        }
                        bt1.a.c cVar2 = bt1.a.f;
                        rd7.d(jt1Var2, cVar2, aj1VarA3);
                        bt1.a.e eVar2 = bt1.a.e;
                        rd7.d(jt1Var2, eVar2, kw7VarY);
                        Integer numValueOf6 = Integer.valueOf(iHashCode4);
                        bt1.a.b bVar2 = bt1.a.g;
                        rd7.d(jt1Var2, bVar2, numValueOf6);
                        bt1.a.C0034a c0034a2 = bt1.a.h;
                        rd7.c(jt1Var2, c0034a2);
                        bt1.a.d dVar2 = bt1.a.d;
                        rd7.d(jt1Var2, dVar2, ox6VarC9);
                        ox6 ox6VarA6 = uma.a(aVar10, ay8.b(8.0f));
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        int i12 = IntercomTheme.$stable;
                        ox6 ox6VarI2 = eo7.i(ir9.c(gi0.c(ox6VarA6, intercomTheme2.getColors(jt1Var2, i12).m757getBubbleBackground0d7_KjU(), al8.a), 1.0f), 12.0f);
                        ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                        int iHashCode5 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY2 = jt1Var2.y();
                        ox6 ox6VarC10 = it1.c(jt1Var2, ox6VarI2);
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar12);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, cVar2, ny8VarA);
                        rd7.d(jt1Var2, eVar2, kw7VarY2);
                        g3.c(iHashCode5, jt1Var2, bVar2, jt1Var2, c0034a2);
                        rd7.d(jt1Var2, dVar2, ox6VarC10);
                        m65.b(is7.a(R.drawable.intercom_ticket_notification, jt1Var2, 0), null, ir9.j(eo7.m(aVar10, 0.0f, 4.0f, 0.0f, 0.0f, 13), 16.0f), intercomTheme2.getColors(jt1Var2, i12).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                        b47.b(jt1Var2, ir9.n(aVar10, 16.0f));
                        wja type04 = intercomTheme2.getTypography(jt1Var2, i12).getType04();
                        jt1Var2.K(1807110638);
                        iw.b bVar3 = new iw.b();
                        jt1Var2.K(1807112122);
                        int iH = bVar3.h(new ww9(0L, 0L, ob4.A, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                        try {
                            bVar3.c(nr1.f(jt1Var2, R.string.intercom_youll_be_notified_here_and_by_email));
                            bVar3.c(" ");
                            g2b g2bVar = g2b.a;
                            bVar3.e(iH);
                            jt1Var2.B();
                            bVar3.c(ticketDetailContentState3.getUserEmail());
                            iw iwVarI = bVar3.i();
                            jt1Var2.B();
                            mia.c(iwVarI, null, ah5.a(intercomTheme2, jt1Var2, i12), 0L, null, 0L, null, cka.b(22), 0, false, 0, 0, null, null, type04, jt1Var2, 0, 48, 260090);
                            jt1 jt1Var3 = jt1Var2;
                            jt1Var3.I();
                            ox6.a aVar13 = aVar10;
                            b47.b(jt1Var3, ir9.d(aVar13, 24.0f));
                            jt1Var3.K(-711350793);
                            if (!ticketDetailContentState3.getTicketAttributes().isEmpty()) {
                                ox6 ox6VarH6 = eo7.k(aVar13, 12.0f, 0.0f, 2).H(ir9.c);
                                boolean z10 = false;
                                aj1 aj1VarA4 = yi1.a(kVar2, aVar11, jt1Var3, 0);
                                int iHashCode6 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC11 = it1.c(jt1Var3, ox6VarH6);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar12);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar2, aj1VarA4);
                                rd7.d(jt1Var3, eVar2, kw7VarY3);
                                g3.c(iHashCode6, jt1Var3, bVar2, jt1Var3, c0034a2);
                                rd7.d(jt1Var3, dVar2, ox6VarC11);
                                jt1Var3.K(1807143465);
                                for (Ticket.TicketAttribute ticketAttribute : ticketDetailContentState3.getTicketAttributes()) {
                                    String name = ticketAttribute.getName();
                                    IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                                    int i13 = IntercomTheme.$stable;
                                    ox6.a aVar14 = aVar13;
                                    mia.b(name, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04SemiBold(), jt1Var2, 0, 0, 131070);
                                    jt1Var3 = jt1Var2;
                                    b47.b(jt1Var3, ir9.d(aVar14, 2.0f));
                                    if (ticketAttribute instanceof Ticket.TicketAttribute.PrimitiveAttribute) {
                                        jt1Var3.K(2134715913);
                                        aVar8 = aVar14;
                                        mia.b(((Ticket.TicketAttribute.PrimitiveAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                        jt1Var3 = jt1Var2;
                                        jt1Var3.B();
                                    } else {
                                        aVar8 = aVar14;
                                        if (ticketAttribute instanceof Ticket.TicketAttribute.ListAttribute) {
                                            jt1Var3.K(2135020457);
                                            mia.b(((Ticket.TicketAttribute.ListAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                            jt1Var3 = jt1Var2;
                                            jt1Var3.B();
                                        } else {
                                            if (ticketAttribute instanceof Ticket.TicketAttribute.DateTimeAttribute) {
                                                jt1Var3.K(2135335386);
                                                String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(Long.parseLong(((Ticket.TicketAttribute.DateTimeAttribute) ticketAttribute).getValue()) * 1000, "dd-MM-yyy, HH:mm");
                                                timeInMillisAsDate.getClass();
                                                mia.b(timeInMillisAsDate, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                                jt1Var3 = jt1Var2;
                                                jt1Var3.B();
                                            } else {
                                                if (ticketAttribute instanceof Ticket.TicketAttribute.FilesAttribute) {
                                                    jt1Var3.K(2135835354);
                                                    FIleAttachmentListKt.FileAttachmentList(null, ((Ticket.TicketAttribute.FilesAttribute) ticketAttribute).getValue(), jt1Var3, 0, 1);
                                                    jt1Var3.B();
                                                    z9 = false;
                                                } else if (!(ticketAttribute instanceof Ticket.TicketAttribute.UnSupported)) {
                                                    jt1Var3.K(1592882332);
                                                    jt1Var3.B();
                                                    u.b();
                                                    return;
                                                } else {
                                                    jt1Var3.K(2136019990);
                                                    z9 = false;
                                                    mia.b(((Ticket.TicketAttribute.UnSupported) ticketAttribute).getValue().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                                    jt1Var3 = jt1Var2;
                                                    jt1Var3.B();
                                                }
                                                aVar9 = aVar8;
                                                f2 = 16.0f;
                                            }
                                            b47.b(jt1Var3, ir9.d(aVar9, f2));
                                            aVar13 = aVar9;
                                            z10 = z9;
                                        }
                                    }
                                    aVar9 = aVar8;
                                    f2 = 16.0f;
                                    z9 = false;
                                    b47.b(jt1Var3, ir9.d(aVar9, f2));
                                    aVar13 = aVar9;
                                    z10 = z9;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                        } catch (Throwable th) {
                            bVar3.e(iH);
                            throw th;
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 12582918, 122);
                bj4VarO = bj4VarO;
                bj4VarO.K(1933740142);
                if (ticketDetailContentState.getConversationButtonState().getShowButton()) {
                    b47.b(bj4VarO, new qs5(true, 1.0f));
                    ox6 ox6VarK5 = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 16.0f, 1);
                    aj1VarA2 = yi1.a(kVar, di.a.n, bj4VarO, 48);
                    iHashCode3 = Long.hashCode(bj4VarO.T);
                    kw7VarP3 = bj4VarO.P();
                    ox6VarC3 = it1.c(bj4VarO, ox6VarK5);
                    if (j1bVar == null) {
                        ml5.c();
                        throw r21;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar2);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, cVar, aj1VarA2);
                    rd7.d(bj4VarO, eVar, kw7VarP3);
                    l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                    rd7.d(bj4VarO, dVar, ox6VarC3);
                    mia.b(nr1.f(bj4VarO, R.string.intercom_tickets_cta_text), ir9.c(aVar, 1.0f), 0L, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i7).getType04Point5(), ac4.b(intercomTheme, bj4VarO, i7), 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 130044);
                    b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                    ConversationButtonState conversationButtonState5 = ticketDetailContentState.getConversationButtonState();
                    IntercomButton.Style styleM570primaryStyleKlgxPg5 = IntercomButton.INSTANCE.m570primaryStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                    bj4VarO = bj4VarO;
                    String text5 = conversationButtonState5.getText().getText(bj4VarO, StringProvider.$stable);
                    Integer iconRes5 = conversationButtonState5.getIconRes();
                    bj4VarO.K(233200228);
                    if ((i8 & 896) == 256) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    ticketDetailContentState2 = ticketDetailContentState;
                    zJ = bj4VarO.j(ticketDetailContentState2) | z8;
                    objF3 = bj4VarO.f();
                    if (zJ) {
                        oh4Var4 = oh4Var3;
                        objF3 = new mh4() { // from class: tla
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TicketDetailContentKt.TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4Var4, ticketDetailContentState2);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        oh4Var4 = oh4Var3;
                        objF3 = new mh4() { // from class: tla
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TicketDetailContentKt.TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4Var4, ticketDetailContentState2);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    IntercomButtonKt.IntercomButton(null, styleM570primaryStyleKlgxPg5, text5, iconRes5, (mh4) objF3, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                    b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                    bj4VarO.U(true);
                } else {
                    ticketDetailContentState2 = ticketDetailContentState;
                    oh4Var4 = oh4Var3;
                }
                bj4VarO.U(false);
                bj4VarO.U(true);
                oh4Var5 = oh4Var4;
                ox6Var4 = ox6Var3;
                z7 = z5;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: ula
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TicketDetailContentKt.TicketDetailContent$lambda$18(ox6Var4, ticketDetailContentState2, oh4Var5, z7, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) == 1170) {
            aVar = ox6.a.t;
            if (i9 != 0) {
                ox6Var2 = aVar;
            }
            c0187a = jt1.a.a;
            i6 = 1;
            if (i10 != 0) {
                bj4VarO.K(1639440163);
                objF5 = bj4VarO.f();
                if (objF5 == c0187a) {
                    objF5 = new b29(i6);
                    bj4VarO.C(objF5);
                }
                oh4Var2 = (oh4) objF5;
                bj4VarO.U(false);
            }
            if (i4 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            Object[] objArr6 = new Object[0];
            bj4VarO.K(1639443041);
            if ((i3 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            objF = bj4VarO.f();
            if (z4) {
                objF = new mh4() { // from class: sla
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TicketDetailContentKt.TicketDetailContent$lambda$3$lambda$2(z3);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: sla
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TicketDetailContentKt.TicketDetailContent$lambda$3$lambda$2(z3);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            h37Var = (h37) mm8.d(objArr6, (mh4) objF, bj4VarO, 0);
            bj4VarO.K(1639447110);
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = bl7.i(new y43(-56.0f));
                bj4VarO.C(objF2);
            }
            h37Var2 = (h37) objF2;
            objB = aa0.b(bj4VarO, false, 1639449312);
            z5 = z3;
            if (objB == c0187a) {
                objB = bl7.i(Float.valueOf(0.0f));
                bj4VarO.C(objB);
            }
            h37Var3 = (h37) objB;
            bj4VarO.U(false);
            bj4VarO.K(1639450743);
            cardStateTicketDetailContent$lambda$4 = TicketDetailContent$lambda$4(h37Var);
            cardState = CardState.SubmissionCard;
            if (cardStateTicketDetailContent$lambda$4 == cardState) {
                bj4VarO.K(1639454260);
                zJ2 = bj4VarO.J(h37Var);
                objF4 = bj4VarO.f();
                if (zJ2) {
                    objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(h37Var2, h37Var3, h37Var, null);
                    bj4VarO.C(objF4);
                } else {
                    objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(h37Var2, h37Var3, h37Var, null);
                    bj4VarO.C(objF4);
                }
                z6 = false;
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF4, null);
            } else {
                z6 = false;
            }
            bj4VarO.U(z6);
            ox6 ox6VarH6 = q69.h(ox6Var2.H(ir9.b), q69.f(bj4VarO), 14);
            sp0.a aVar8 = di.a.m;
            kVar = c30.c;
            aj1VarA = yi1.a(kVar, aVar8, bj4VarO, 0);
            ox6Var3 = ox6Var2;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarH6);
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
            Integer numValueOf6 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf6);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            intercomTheme = IntercomTheme.INSTANCE;
            i7 = IntercomTheme.$stable;
            oh4Var3 = oh4Var2;
            i8 = i3;
            ox6 ox6VarC9 = gi0.c(aVar, kk.a(intercomTheme, bj4VarO, i7), al8.a);
            az3Var = ir9.c;
            ox6 ox6VarA6 = sv.a(ir9.e(ox6VarC9.H(az3Var), 194.0f, 0.0f, 2), xv.c(0, 0, null, 7));
            fl6VarD = dv0.d(di.a.e, false);
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
            rd7.d(bj4VarO, cVar, fl6VarD);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            TicketTimelineCardState ticketTimelineCardState6 = ticketDetailContentState.getTicketTimelineCardState();
            if (TicketDetailContent$lambda$4(h37Var) == CardState.TimelineCard) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            TicketTimelineCardKt.TicketTimelineCard(ticketTimelineCardState6, yq5.b(aVar, ((Number) xt.b(f, xv.b(0.0f, 0.0f, null, 7), bj4VarO, 48).getValue()).floatValue()), bj4VarO, 0, 0);
            if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                fTicketDetailContent$lambda$10 = TicketDetailContent$lambda$10(h37Var3);
            } else {
                fTicketDetailContent$lambda$10 = 0.0f;
            }
            if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                aa3Var = null;
                a04VarB = xv.c(1000, 0, null, 6);
            } else {
                aa3Var = null;
                a04VarB = xv.b(0.0f, 0.0f, null, 7);
            }
            TicketSubmissionCard(zf7.b(0.0f, ((y43) xt.a(TicketDetailContent$lambda$7(h37Var2), xv.c(1000, 0, aa3Var, 6), bj4VarO, 48, 12).getValue()).t, yq5.b(aVar, ((Number) xt.b(fTicketDetailContent$lambda$10, a04VarB, bj4VarO, 0).getValue()).floatValue())), bj4VarO, 0, 0);
            bj4VarO.U(true);
            r21 = aa3Var;
            v5a.a(az3Var, null, intercomTheme.getColors(bj4VarO, i7).getBase().m712getBase0d7_KjU(), 0L, 0.0f, 0.0f, null, gr1.b(925724611, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$3$2
                public final void invoke(jt1 jt1Var2, int i11) {
                    ox6.a aVar9;
                    boolean z9;
                    ox6.a aVar10;
                    float f2;
                    if ((i11 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ox6.a aVar11 = ox6.a.t;
                    ox6 ox6VarI = eo7.i(aVar11, 16.0f);
                    TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState;
                    c30.k kVar2 = c30.c;
                    sp0.a aVar12 = di.a.m;
                    aj1 aj1VarA3 = yi1.a(kVar2, aVar12, jt1Var2, 0);
                    int iHashCode4 = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC10 = it1.c(jt1Var2, ox6VarI);
                    bt1.c.getClass();
                    qr5.a aVar13 = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar13);
                    } else {
                        jt1Var2.z();
                    }
                    bt1.a.c cVar2 = bt1.a.f;
                    rd7.d(jt1Var2, cVar2, aj1VarA3);
                    bt1.a.e eVar2 = bt1.a.e;
                    rd7.d(jt1Var2, eVar2, kw7VarY);
                    Integer numValueOf7 = Integer.valueOf(iHashCode4);
                    bt1.a.b bVar2 = bt1.a.g;
                    rd7.d(jt1Var2, bVar2, numValueOf7);
                    bt1.a.C0034a c0034a2 = bt1.a.h;
                    rd7.c(jt1Var2, c0034a2);
                    bt1.a.d dVar2 = bt1.a.d;
                    rd7.d(jt1Var2, dVar2, ox6VarC10);
                    ox6 ox6VarA7 = uma.a(aVar11, ay8.b(8.0f));
                    IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                    int i12 = IntercomTheme.$stable;
                    ox6 ox6VarI2 = eo7.i(ir9.c(gi0.c(ox6VarA7, intercomTheme2.getColors(jt1Var2, i12).m757getBubbleBackground0d7_KjU(), al8.a), 1.0f), 12.0f);
                    ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                    int iHashCode5 = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY2 = jt1Var2.y();
                    ox6 ox6VarC11 = it1.c(jt1Var2, ox6VarI2);
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar13);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, cVar2, ny8VarA);
                    rd7.d(jt1Var2, eVar2, kw7VarY2);
                    g3.c(iHashCode5, jt1Var2, bVar2, jt1Var2, c0034a2);
                    rd7.d(jt1Var2, dVar2, ox6VarC11);
                    m65.b(is7.a(R.drawable.intercom_ticket_notification, jt1Var2, 0), null, ir9.j(eo7.m(aVar11, 0.0f, 4.0f, 0.0f, 0.0f, 13), 16.0f), intercomTheme2.getColors(jt1Var2, i12).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                    b47.b(jt1Var2, ir9.n(aVar11, 16.0f));
                    wja type04 = intercomTheme2.getTypography(jt1Var2, i12).getType04();
                    jt1Var2.K(1807110638);
                    iw.b bVar3 = new iw.b();
                    jt1Var2.K(1807112122);
                    int iH = bVar3.h(new ww9(0L, 0L, ob4.A, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                    try {
                        bVar3.c(nr1.f(jt1Var2, R.string.intercom_youll_be_notified_here_and_by_email));
                        bVar3.c(" ");
                        g2b g2bVar = g2b.a;
                        bVar3.e(iH);
                        jt1Var2.B();
                        bVar3.c(ticketDetailContentState3.getUserEmail());
                        iw iwVarI = bVar3.i();
                        jt1Var2.B();
                        mia.c(iwVarI, null, ah5.a(intercomTheme2, jt1Var2, i12), 0L, null, 0L, null, cka.b(22), 0, false, 0, 0, null, null, type04, jt1Var2, 0, 48, 260090);
                        jt1 jt1Var3 = jt1Var2;
                        jt1Var3.I();
                        ox6.a aVar14 = aVar11;
                        b47.b(jt1Var3, ir9.d(aVar14, 24.0f));
                        jt1Var3.K(-711350793);
                        if (!ticketDetailContentState3.getTicketAttributes().isEmpty()) {
                            ox6 ox6VarH7 = eo7.k(aVar14, 12.0f, 0.0f, 2).H(ir9.c);
                            boolean z10 = false;
                            aj1 aj1VarA4 = yi1.a(kVar2, aVar12, jt1Var3, 0);
                            int iHashCode6 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY3 = jt1Var3.y();
                            ox6 ox6VarC12 = it1.c(jt1Var3, ox6VarH7);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar13);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar2, aj1VarA4);
                            rd7.d(jt1Var3, eVar2, kw7VarY3);
                            g3.c(iHashCode6, jt1Var3, bVar2, jt1Var3, c0034a2);
                            rd7.d(jt1Var3, dVar2, ox6VarC12);
                            jt1Var3.K(1807143465);
                            for (Ticket.TicketAttribute ticketAttribute : ticketDetailContentState3.getTicketAttributes()) {
                                String name = ticketAttribute.getName();
                                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                                int i13 = IntercomTheme.$stable;
                                ox6.a aVar15 = aVar14;
                                mia.b(name, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04SemiBold(), jt1Var2, 0, 0, 131070);
                                jt1Var3 = jt1Var2;
                                b47.b(jt1Var3, ir9.d(aVar15, 2.0f));
                                if (ticketAttribute instanceof Ticket.TicketAttribute.PrimitiveAttribute) {
                                    jt1Var3.K(2134715913);
                                    aVar9 = aVar15;
                                    mia.b(((Ticket.TicketAttribute.PrimitiveAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                    jt1Var3 = jt1Var2;
                                    jt1Var3.B();
                                } else {
                                    aVar9 = aVar15;
                                    if (ticketAttribute instanceof Ticket.TicketAttribute.ListAttribute) {
                                        jt1Var3.K(2135020457);
                                        mia.b(((Ticket.TicketAttribute.ListAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                        jt1Var3 = jt1Var2;
                                        jt1Var3.B();
                                    } else {
                                        if (ticketAttribute instanceof Ticket.TicketAttribute.DateTimeAttribute) {
                                            jt1Var3.K(2135335386);
                                            String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(Long.parseLong(((Ticket.TicketAttribute.DateTimeAttribute) ticketAttribute).getValue()) * 1000, "dd-MM-yyy, HH:mm");
                                            timeInMillisAsDate.getClass();
                                            mia.b(timeInMillisAsDate, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                            jt1Var3 = jt1Var2;
                                            jt1Var3.B();
                                        } else {
                                            if (ticketAttribute instanceof Ticket.TicketAttribute.FilesAttribute) {
                                                jt1Var3.K(2135835354);
                                                FIleAttachmentListKt.FileAttachmentList(null, ((Ticket.TicketAttribute.FilesAttribute) ticketAttribute).getValue(), jt1Var3, 0, 1);
                                                jt1Var3.B();
                                                z9 = false;
                                            } else if (!(ticketAttribute instanceof Ticket.TicketAttribute.UnSupported)) {
                                                jt1Var3.K(1592882332);
                                                jt1Var3.B();
                                                u.b();
                                                return;
                                            } else {
                                                jt1Var3.K(2136019990);
                                                z9 = false;
                                                mia.b(((Ticket.TicketAttribute.UnSupported) ticketAttribute).getValue().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                                jt1Var3 = jt1Var2;
                                                jt1Var3.B();
                                            }
                                            aVar10 = aVar9;
                                            f2 = 16.0f;
                                        }
                                        b47.b(jt1Var3, ir9.d(aVar10, f2));
                                        aVar14 = aVar10;
                                        z10 = z9;
                                    }
                                }
                                aVar10 = aVar9;
                                f2 = 16.0f;
                                z9 = false;
                                b47.b(jt1Var3, ir9.d(aVar10, f2));
                                aVar14 = aVar10;
                                z10 = z9;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                        }
                        jt1Var3.B();
                        jt1Var3.I();
                    } catch (Throwable th) {
                        bVar3.e(iH);
                        throw th;
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 12582918, 122);
            bj4VarO = bj4VarO;
            bj4VarO.K(1933740142);
            if (ticketDetailContentState.getConversationButtonState().getShowButton()) {
                b47.b(bj4VarO, new qs5(true, 1.0f));
                ox6 ox6VarK6 = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 16.0f, 1);
                aj1VarA2 = yi1.a(kVar, di.a.n, bj4VarO, 48);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarK6);
                if (j1bVar == null) {
                    ml5.c();
                    throw r21;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                mia.b(nr1.f(bj4VarO, R.string.intercom_tickets_cta_text), ir9.c(aVar, 1.0f), 0L, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i7).getType04Point5(), ac4.b(intercomTheme, bj4VarO, i7), 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 130044);
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                ConversationButtonState conversationButtonState6 = ticketDetailContentState.getConversationButtonState();
                IntercomButton.Style styleM570primaryStyleKlgxPg6 = IntercomButton.INSTANCE.m570primaryStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                bj4VarO = bj4VarO;
                String text6 = conversationButtonState6.getText().getText(bj4VarO, StringProvider.$stable);
                Integer iconRes6 = conversationButtonState6.getIconRes();
                bj4VarO.K(233200228);
                if ((i8 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                ticketDetailContentState2 = ticketDetailContentState;
                zJ = bj4VarO.j(ticketDetailContentState2) | z8;
                objF3 = bj4VarO.f();
                if (zJ) {
                    oh4Var4 = oh4Var3;
                    objF3 = new mh4() { // from class: tla
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TicketDetailContentKt.TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4Var4, ticketDetailContentState2);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    oh4Var4 = oh4Var3;
                    objF3 = new mh4() { // from class: tla
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TicketDetailContentKt.TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4Var4, ticketDetailContentState2);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                IntercomButtonKt.IntercomButton(null, styleM570primaryStyleKlgxPg6, text6, iconRes6, (mh4) objF3, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                bj4VarO.U(true);
            } else {
                ticketDetailContentState2 = ticketDetailContentState;
                oh4Var4 = oh4Var3;
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            oh4Var5 = oh4Var4;
            ox6Var4 = ox6Var3;
            z7 = z5;
        } else {
            aVar = ox6.a.t;
            if (i9 != 0) {
                ox6Var2 = aVar;
            }
            c0187a = jt1.a.a;
            i6 = 1;
            if (i10 != 0) {
                bj4VarO.K(1639440163);
                objF5 = bj4VarO.f();
                if (objF5 == c0187a) {
                    objF5 = new b29(i6);
                    bj4VarO.C(objF5);
                }
                oh4Var2 = (oh4) objF5;
                bj4VarO.U(false);
            }
            if (i4 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            Object[] objArr7 = new Object[0];
            bj4VarO.K(1639443041);
            if ((i3 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            objF = bj4VarO.f();
            if (z4) {
                objF = new mh4() { // from class: sla
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TicketDetailContentKt.TicketDetailContent$lambda$3$lambda$2(z3);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: sla
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TicketDetailContentKt.TicketDetailContent$lambda$3$lambda$2(z3);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            h37Var = (h37) mm8.d(objArr7, (mh4) objF, bj4VarO, 0);
            bj4VarO.K(1639447110);
            objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = bl7.i(new y43(-56.0f));
                bj4VarO.C(objF2);
            }
            h37Var2 = (h37) objF2;
            objB = aa0.b(bj4VarO, false, 1639449312);
            z5 = z3;
            if (objB == c0187a) {
                objB = bl7.i(Float.valueOf(0.0f));
                bj4VarO.C(objB);
            }
            h37Var3 = (h37) objB;
            bj4VarO.U(false);
            bj4VarO.K(1639450743);
            cardStateTicketDetailContent$lambda$4 = TicketDetailContent$lambda$4(h37Var);
            cardState = CardState.SubmissionCard;
            if (cardStateTicketDetailContent$lambda$4 == cardState) {
                bj4VarO.K(1639454260);
                zJ2 = bj4VarO.J(h37Var);
                objF4 = bj4VarO.f();
                if (zJ2) {
                    objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(h37Var2, h37Var3, h37Var, null);
                    bj4VarO.C(objF4);
                } else {
                    objF4 = new TicketDetailContentKt$TicketDetailContent$2$1(h37Var2, h37Var3, h37Var, null);
                    bj4VarO.C(objF4);
                }
                z6 = false;
                bj4VarO.U(false);
                wd3.d(bj4VarO, (ci4) objF4, null);
            } else {
                z6 = false;
            }
            bj4VarO.U(z6);
            ox6 ox6VarH7 = q69.h(ox6Var2.H(ir9.b), q69.f(bj4VarO), 14);
            sp0.a aVar9 = di.a.m;
            kVar = c30.c;
            aj1VarA = yi1.a(kVar, aVar9, bj4VarO, 0);
            ox6Var3 = ox6Var2;
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarH7);
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
            Integer numValueOf7 = Integer.valueOf(iHashCode);
            bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf7);
            c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            intercomTheme = IntercomTheme.INSTANCE;
            i7 = IntercomTheme.$stable;
            oh4Var3 = oh4Var2;
            i8 = i3;
            ox6 ox6VarC10 = gi0.c(aVar, kk.a(intercomTheme, bj4VarO, i7), al8.a);
            az3Var = ir9.c;
            ox6 ox6VarA7 = sv.a(ir9.e(ox6VarC10.H(az3Var), 194.0f, 0.0f, 2), xv.c(0, 0, null, 7));
            fl6VarD = dv0.d(di.a.e, false);
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
            rd7.d(bj4VarO, cVar, fl6VarD);
            rd7.d(bj4VarO, eVar, kw7VarP2);
            l02.a(iHashCode2, bj4VarO, bVar, bj4VarO, c0034a);
            rd7.d(bj4VarO, dVar, ox6VarC2);
            TicketTimelineCardState ticketTimelineCardState7 = ticketDetailContentState.getTicketTimelineCardState();
            if (TicketDetailContent$lambda$4(h37Var) == CardState.TimelineCard) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            TicketTimelineCardKt.TicketTimelineCard(ticketTimelineCardState7, yq5.b(aVar, ((Number) xt.b(f, xv.b(0.0f, 0.0f, null, 7), bj4VarO, 48).getValue()).floatValue()), bj4VarO, 0, 0);
            if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                fTicketDetailContent$lambda$10 = TicketDetailContent$lambda$10(h37Var3);
            } else {
                fTicketDetailContent$lambda$10 = 0.0f;
            }
            if (TicketDetailContent$lambda$4(h37Var) == cardState) {
                aa3Var = null;
                a04VarB = xv.c(1000, 0, null, 6);
            } else {
                aa3Var = null;
                a04VarB = xv.b(0.0f, 0.0f, null, 7);
            }
            TicketSubmissionCard(zf7.b(0.0f, ((y43) xt.a(TicketDetailContent$lambda$7(h37Var2), xv.c(1000, 0, aa3Var, 6), bj4VarO, 48, 12).getValue()).t, yq5.b(aVar, ((Number) xt.b(fTicketDetailContent$lambda$10, a04VarB, bj4VarO, 0).getValue()).floatValue())), bj4VarO, 0, 0);
            bj4VarO.U(true);
            r21 = aa3Var;
            v5a.a(az3Var, null, intercomTheme.getColors(bj4VarO, i7).getBase().m712getBase0d7_KjU(), 0L, 0.0f, 0.0f, null, gr1.b(925724611, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$3$2
                public final void invoke(jt1 jt1Var2, int i11) {
                    ox6.a aVar10;
                    boolean z9;
                    ox6.a aVar11;
                    float f2;
                    if ((i11 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    ox6.a aVar12 = ox6.a.t;
                    ox6 ox6VarI = eo7.i(aVar12, 16.0f);
                    TicketDetailState.TicketDetailContentState ticketDetailContentState3 = ticketDetailContentState;
                    c30.k kVar2 = c30.c;
                    sp0.a aVar13 = di.a.m;
                    aj1 aj1VarA3 = yi1.a(kVar2, aVar13, jt1Var2, 0);
                    int iHashCode4 = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY = jt1Var2.y();
                    ox6 ox6VarC11 = it1.c(jt1Var2, ox6VarI);
                    bt1.c.getClass();
                    qr5.a aVar14 = bt1.a.b;
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar14);
                    } else {
                        jt1Var2.z();
                    }
                    bt1.a.c cVar2 = bt1.a.f;
                    rd7.d(jt1Var2, cVar2, aj1VarA3);
                    bt1.a.e eVar2 = bt1.a.e;
                    rd7.d(jt1Var2, eVar2, kw7VarY);
                    Integer numValueOf8 = Integer.valueOf(iHashCode4);
                    bt1.a.b bVar2 = bt1.a.g;
                    rd7.d(jt1Var2, bVar2, numValueOf8);
                    bt1.a.C0034a c0034a2 = bt1.a.h;
                    rd7.c(jt1Var2, c0034a2);
                    bt1.a.d dVar2 = bt1.a.d;
                    rd7.d(jt1Var2, dVar2, ox6VarC11);
                    ox6 ox6VarA8 = uma.a(aVar12, ay8.b(8.0f));
                    IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                    int i12 = IntercomTheme.$stable;
                    ox6 ox6VarI2 = eo7.i(ir9.c(gi0.c(ox6VarA8, intercomTheme2.getColors(jt1Var2, i12).m757getBubbleBackground0d7_KjU(), al8.a), 1.0f), 12.0f);
                    ny8 ny8VarA = ly8.a(c30.a, di.a.k, jt1Var2, 48);
                    int iHashCode5 = Long.hashCode(jt1Var2.v());
                    kw7 kw7VarY2 = jt1Var2.y();
                    ox6 ox6VarC12 = it1.c(jt1Var2, ox6VarI2);
                    if (jt1Var2.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var2.q();
                    if (jt1Var2.l()) {
                        jt1Var2.k(aVar14);
                    } else {
                        jt1Var2.z();
                    }
                    rd7.d(jt1Var2, cVar2, ny8VarA);
                    rd7.d(jt1Var2, eVar2, kw7VarY2);
                    g3.c(iHashCode5, jt1Var2, bVar2, jt1Var2, c0034a2);
                    rd7.d(jt1Var2, dVar2, ox6VarC12);
                    m65.b(is7.a(R.drawable.intercom_ticket_notification, jt1Var2, 0), null, ir9.j(eo7.m(aVar12, 0.0f, 4.0f, 0.0f, 0.0f, 13), 16.0f), intercomTheme2.getColors(jt1Var2, i12).getIcon().m806getDefault0d7_KjU(), jt1Var2, 440, 0);
                    b47.b(jt1Var2, ir9.n(aVar12, 16.0f));
                    wja type04 = intercomTheme2.getTypography(jt1Var2, i12).getType04();
                    jt1Var2.K(1807110638);
                    iw.b bVar3 = new iw.b();
                    jt1Var2.K(1807112122);
                    int iH = bVar3.h(new ww9(0L, 0L, ob4.A, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531));
                    try {
                        bVar3.c(nr1.f(jt1Var2, R.string.intercom_youll_be_notified_here_and_by_email));
                        bVar3.c(" ");
                        g2b g2bVar = g2b.a;
                        bVar3.e(iH);
                        jt1Var2.B();
                        bVar3.c(ticketDetailContentState3.getUserEmail());
                        iw iwVarI = bVar3.i();
                        jt1Var2.B();
                        mia.c(iwVarI, null, ah5.a(intercomTheme2, jt1Var2, i12), 0L, null, 0L, null, cka.b(22), 0, false, 0, 0, null, null, type04, jt1Var2, 0, 48, 260090);
                        jt1 jt1Var3 = jt1Var2;
                        jt1Var3.I();
                        ox6.a aVar15 = aVar12;
                        b47.b(jt1Var3, ir9.d(aVar15, 24.0f));
                        jt1Var3.K(-711350793);
                        if (!ticketDetailContentState3.getTicketAttributes().isEmpty()) {
                            ox6 ox6VarH8 = eo7.k(aVar15, 12.0f, 0.0f, 2).H(ir9.c);
                            boolean z10 = false;
                            aj1 aj1VarA4 = yi1.a(kVar2, aVar13, jt1Var3, 0);
                            int iHashCode6 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY3 = jt1Var3.y();
                            ox6 ox6VarC13 = it1.c(jt1Var3, ox6VarH8);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar14);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar2, aj1VarA4);
                            rd7.d(jt1Var3, eVar2, kw7VarY3);
                            g3.c(iHashCode6, jt1Var3, bVar2, jt1Var3, c0034a2);
                            rd7.d(jt1Var3, dVar2, ox6VarC13);
                            jt1Var3.K(1807143465);
                            for (Ticket.TicketAttribute ticketAttribute : ticketDetailContentState3.getTicketAttributes()) {
                                String name = ticketAttribute.getName();
                                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                                int i13 = IntercomTheme.$stable;
                                ox6.a aVar16 = aVar15;
                                mia.b(name, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04SemiBold(), jt1Var2, 0, 0, 131070);
                                jt1Var3 = jt1Var2;
                                b47.b(jt1Var3, ir9.d(aVar16, 2.0f));
                                if (ticketAttribute instanceof Ticket.TicketAttribute.PrimitiveAttribute) {
                                    jt1Var3.K(2134715913);
                                    aVar10 = aVar16;
                                    mia.b(((Ticket.TicketAttribute.PrimitiveAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                    jt1Var3 = jt1Var2;
                                    jt1Var3.B();
                                } else {
                                    aVar10 = aVar16;
                                    if (ticketAttribute instanceof Ticket.TicketAttribute.ListAttribute) {
                                        jt1Var3.K(2135020457);
                                        mia.b(((Ticket.TicketAttribute.ListAttribute) ticketAttribute).getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                        jt1Var3 = jt1Var2;
                                        jt1Var3.B();
                                    } else {
                                        if (ticketAttribute instanceof Ticket.TicketAttribute.DateTimeAttribute) {
                                            jt1Var3.K(2135335386);
                                            String timeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(Long.parseLong(((Ticket.TicketAttribute.DateTimeAttribute) ticketAttribute).getValue()) * 1000, "dd-MM-yyy, HH:mm");
                                            timeInMillisAsDate.getClass();
                                            mia.b(timeInMillisAsDate, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                            jt1Var3 = jt1Var2;
                                            jt1Var3.B();
                                        } else {
                                            if (ticketAttribute instanceof Ticket.TicketAttribute.FilesAttribute) {
                                                jt1Var3.K(2135835354);
                                                FIleAttachmentListKt.FileAttachmentList(null, ((Ticket.TicketAttribute.FilesAttribute) ticketAttribute).getValue(), jt1Var3, 0, 1);
                                                jt1Var3.B();
                                                z9 = false;
                                            } else if (!(ticketAttribute instanceof Ticket.TicketAttribute.UnSupported)) {
                                                jt1Var3.K(1592882332);
                                                jt1Var3.B();
                                                u.b();
                                                return;
                                            } else {
                                                jt1Var3.K(2136019990);
                                                z9 = false;
                                                mia.b(((Ticket.TicketAttribute.UnSupported) ticketAttribute).getValue().toString(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(jt1Var3, i13).getType04(), jt1Var2, 0, 0, 131070);
                                                jt1Var3 = jt1Var2;
                                                jt1Var3.B();
                                            }
                                            aVar11 = aVar10;
                                            f2 = 16.0f;
                                        }
                                        b47.b(jt1Var3, ir9.d(aVar11, f2));
                                        aVar15 = aVar11;
                                        z10 = z9;
                                    }
                                }
                                aVar11 = aVar10;
                                f2 = 16.0f;
                                z9 = false;
                                b47.b(jt1Var3, ir9.d(aVar11, f2));
                                aVar15 = aVar11;
                                z10 = z9;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                        }
                        jt1Var3.B();
                        jt1Var3.I();
                    } catch (Throwable th) {
                        bVar3.e(iH);
                        throw th;
                    }
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 12582918, 122);
            bj4VarO = bj4VarO;
            bj4VarO.K(1933740142);
            if (ticketDetailContentState.getConversationButtonState().getShowButton()) {
                b47.b(bj4VarO, new qs5(true, 1.0f));
                ox6 ox6VarK7 = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 16.0f, 1);
                aj1VarA2 = yi1.a(kVar, di.a.n, bj4VarO, 48);
                iHashCode3 = Long.hashCode(bj4VarO.T);
                kw7VarP3 = bj4VarO.P();
                ox6VarC3 = it1.c(bj4VarO, ox6VarK7);
                if (j1bVar == null) {
                    ml5.c();
                    throw r21;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar2);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, cVar, aj1VarA2);
                rd7.d(bj4VarO, eVar, kw7VarP3);
                l02.a(iHashCode3, bj4VarO, bVar, bj4VarO, c0034a);
                rd7.d(bj4VarO, dVar, ox6VarC3);
                mia.b(nr1.f(bj4VarO, R.string.intercom_tickets_cta_text), ir9.c(aVar, 1.0f), 0L, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i7).getType04Point5(), ac4.b(intercomTheme, bj4VarO, i7), 0L, null, null, 0L, 0L, null, null, 16777214), bj4VarO, 48, 0, 130044);
                b47.b(bj4VarO, ir9.d(aVar, 8.0f));
                ConversationButtonState conversationButtonState7 = ticketDetailContentState.getConversationButtonState();
                IntercomButton.Style styleM570primaryStyleKlgxPg7 = IntercomButton.INSTANCE.m570primaryStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                bj4VarO = bj4VarO;
                String text7 = conversationButtonState7.getText().getText(bj4VarO, StringProvider.$stable);
                Integer iconRes7 = conversationButtonState7.getIconRes();
                bj4VarO.K(233200228);
                if ((i8 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                ticketDetailContentState2 = ticketDetailContentState;
                zJ = bj4VarO.j(ticketDetailContentState2) | z8;
                objF3 = bj4VarO.f();
                if (zJ) {
                    oh4Var4 = oh4Var3;
                    objF3 = new mh4() { // from class: tla
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TicketDetailContentKt.TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4Var4, ticketDetailContentState2);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    oh4Var4 = oh4Var3;
                    objF3 = new mh4() { // from class: tla
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TicketDetailContentKt.TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4Var4, ticketDetailContentState2);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                IntercomButtonKt.IntercomButton(null, styleM570primaryStyleKlgxPg7, text7, iconRes7, (mh4) objF3, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                b47.b(bj4VarO, ir9.d(aVar, 16.0f));
                bj4VarO.U(true);
            } else {
                ticketDetailContentState2 = ticketDetailContentState;
                oh4Var4 = oh4Var3;
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            oh4Var5 = oh4Var4;
            ox6Var4 = ox6Var3;
            z7 = z5;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ula
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketDetailContentKt.TicketDetailContent$lambda$18(ox6Var4, ticketDetailContentState2, oh4Var5, z7, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketDetailContent$lambda$1$lambda$0(String str) {
        return g2b.a;
    }

    private static final float TicketDetailContent$lambda$10(h37<Float> h37Var) {
        return h37Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TicketDetailContent$lambda$11(h37<Float> h37Var, float f) {
        h37Var.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketDetailContent$lambda$17$lambda$16$lambda$15$lambda$14(oh4 oh4Var, TicketDetailState.TicketDetailContentState ticketDetailContentState) {
        oh4Var.invoke(ticketDetailContentState.getConversationId());
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketDetailContent$lambda$18(ox6 ox6Var, TicketDetailState.TicketDetailContentState ticketDetailContentState, oh4 oh4Var, boolean z, int i, int i2, jt1 jt1Var, int i3) {
        TicketDetailContent(ox6Var, ticketDetailContentState, oh4Var, z, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h37 TicketDetailContent$lambda$3$lambda$2(boolean z) {
        return bl7.i(z ? CardState.SubmissionCard : CardState.TimelineCard);
    }

    private static final CardState TicketDetailContent$lambda$4(h37<CardState> h37Var) {
        return h37Var.getValue();
    }

    private static final float TicketDetailContent$lambda$7(h37<y43> h37Var) {
        return h37Var.getValue().t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TicketDetailContent$lambda$8(h37<y43> h37Var, float f) {
        h37Var.setValue(new y43(f));
    }

    @IntercomPreviews
    public static final void TicketPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1759013677);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m513getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new dw3(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketPreview$lambda$22(int i, jt1 jt1Var, int i2) {
        TicketPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TicketPreviewSubmittedCard(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(2122497154);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m514getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new za2(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketPreviewSubmittedCard$lambda$23(int i, jt1 jt1Var, int i2) {
        TicketPreviewSubmittedCard(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TicketSubmissionCard(ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        bj4 bj4VarO = jt1Var.o(-2022209692);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = i | (bj4VarO.J(ox6Var2) ? 4 : 2);
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i3 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6Var3 = i4 != 0 ? aVar : ox6Var2;
            c30.h hVar = new c30.h(16.0f, true, new a30());
            ox6 ox6VarI = eo7.i(ox6Var3, 16.0f);
            aj1 aj1VarA = yi1.a(hVar, di.a.n, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarI);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            m65.b(is7.a(R.drawable.intercom_submitted, bj4VarO, 0), null, ir9.j(aVar, 48.0f), u7d.d(4279072050L), bj4VarO, 3512, 0);
            String strF = nr1.f(bj4VarO, R.string.intercom_tickets_created_confirmation_header);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i5 = IntercomTheme.$stable;
            mia.b(strF, null, gh5.a(intercomTheme, bj4VarO, i5), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i5).getType04(), bj4VarO, 0, 0, 130042);
            mia.b(nr1.f(bj4VarO, R.string.intercom_tickets_submitted_confirmation_paragraph), null, gh5.a(intercomTheme, bj4VarO, i5), 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(bj4VarO, i5).getType04(), bj4VarO, 0, 0, 130042);
            bj4VarO = bj4VarO;
            bj4VarO.U(true);
            ox6Var2 = ox6Var3;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: vla
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TicketDetailContentKt.TicketSubmissionCard$lambda$20(ox6Var2, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketSubmissionCard$lambda$20(ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        TicketSubmissionCard(ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TicketSubmissionCardPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-981393609);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m512getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new k6a(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TicketSubmissionCardPreview$lambda$21(int i, jt1 jt1Var, int i2) {
        TicketSubmissionCardPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final TicketDetailState.TicketDetailContentState getSampleTicketDetailState() {
        return sampleTicketDetailState;
    }
}
