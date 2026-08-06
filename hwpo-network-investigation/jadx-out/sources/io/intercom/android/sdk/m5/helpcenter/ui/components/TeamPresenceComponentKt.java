package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aj1;
import defpackage.al8;
import defpackage.ay8;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.c73;
import defpackage.ci4;
import defpackage.cu7;
import defpackage.d73;
import defpackage.di;
import defpackage.dv0;
import defpackage.eo7;
import defpackage.fk8;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.i12;
import defpackage.ir9;
import defpackage.it1;
import defpackage.j1b;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.l02;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.oh4;
import defpackage.op4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.r01;
import defpackage.rd7;
import defpackage.s01;
import defpackage.u7d;
import defpackage.uma;
import defpackage.vp;
import defpackage.wja;
import defpackage.xj8;
import defpackage.xp;
import defpackage.y30;
import defpackage.yi1;
import defpackage.z63;
import defpackage.zf7;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomButton;
import io.intercom.android.sdk.ui.component.IntercomButtonKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresenceComponentKt {
    private static final ArticleViewState.TeamPresenceState mockTeamPresenceState;

    static {
        int i = R.string.intercom_the_team_can_help_if_needed;
        mockTeamPresenceState = new ArticleViewState.TeamPresenceState(null, null, Integer.valueOf(i), R.string.intercom_send_us_a_message, R.drawable.intercom_new_conversation_send_button, -16777216, "article", MetricTracker.Context.STYLE_HUMAN, false, new OpenMessengerResponse.NewConversationData.Cta("Send us a message", "The team can help if needed", OpenMessengerResponse.IconType.PAPER_PLANE));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x02be  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x0139  */
    /* JADX WARN: Code duplicated, block: B:66:0x0150  */
    /* JADX WARN: Code duplicated, block: B:70:0x0165  */
    /* JADX WARN: Code duplicated, block: B:73:0x017a  */
    /* JADX WARN: Code duplicated, block: B:75:0x018e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0190  */
    /* JADX WARN: Code duplicated, block: B:79:0x0198 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x019a  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x0208 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x020d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0243  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a3  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void TeamPresenceComponent(final ArticleViewState.TeamPresenceState teamPresenceState, boolean z, TeamPresenceButtonStyle teamPresenceButtonStyle, jt1 jt1Var, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        TeamPresenceButtonStyle teamPresenceButtonStyle2;
        int i5;
        int i6;
        boolean z3;
        TeamPresenceButtonStyle teamPresenceButtonStyle3;
        Context context;
        ox6.a aVar;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        String strF;
        Integer numValueOf;
        String strF2;
        TeamPresenceButtonStyle teamPresenceButtonStyle4;
        ox6.a aVar3;
        boolean z4;
        boolean z5;
        Object objF;
        boolean z6;
        boolean z7;
        bj4 bj4Var;
        TeamPresenceButtonStyle teamPresenceButtonStyle5;
        final boolean z8;
        final TeamPresenceButtonStyle teamPresenceButtonStyle6;
        boolean z9;
        boolean z10;
        Object objF2;
        Integer icon;
        xj8 xj8VarW;
        teamPresenceState.getClass();
        bj4 bj4VarO = jt1Var.o(-696298916);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(teamPresenceState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= bj4VarO.c(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    teamPresenceButtonStyle2 = teamPresenceButtonStyle;
                    if (bj4VarO.J(teamPresenceButtonStyle2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) == 146 || !bj4VarO.r()) {
                    i6 = 1;
                    if (i7 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i4 != 0) {
                        teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                    } else {
                        teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    aVar = ox6.a.t;
                    ox6 ox6VarK = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 24.0f, 1);
                    aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarK);
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
                    rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-937558243);
                    if (z3) {
                        IntercomDividerKt.IntercomDivider(eo7.m(ir9.n(aVar, 100.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), bj4VarO, 6, 0);
                    }
                    bj4VarO.U(false);
                    strF = nr1.f(bj4VarO, teamPresenceState.getMessageButtonText());
                    numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                    Integer subtitleText = teamPresenceState.getSubtitleText();
                    bj4VarO.K(-937545761);
                    strF2 = subtitleText != null ? nr1.f(bj4VarO, subtitleText.intValue()) : null;
                    bj4VarO.U(false);
                    if (teamPresenceState.getCtaData() != null) {
                        strF = teamPresenceState.getCtaData().getText();
                        icon = teamPresenceState.getCtaData().getIcon().getIcon();
                        if (icon != null) {
                            numValueOf = icon;
                        }
                        strF2 = teamPresenceState.getCtaData().getSubtitle();
                    }
                    bj4VarO.K(-937533382);
                    if (teamPresenceState.getConversationState() != null) {
                        strF = nr1.f(bj4VarO, teamPresenceState.getConversationState().getMessageButtonText());
                    }
                    bj4VarO.U(false);
                    teamPresenceButtonStyle4 = TeamPresenceButtonStyle.PRIMARY;
                    jt1.a.C0187a c0187a = jt1.a.a;
                    if (teamPresenceButtonStyle3 == teamPresenceButtonStyle4) {
                        bj4VarO.K(1001451744);
                        bj4VarO.K(-937522146);
                        boolean zJ = bj4VarO.j(context);
                        if ((i3 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = z9 | zJ;
                        objF2 = bj4VarO.f();
                        if (z10 || objF2 == c0187a) {
                            objF2 = new y30(i6, teamPresenceState, context);
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(strF, null, numValueOf, (mh4) objF2, bj4VarO, 0, 2);
                        bj4Var = bj4VarO;
                        bj4Var.U(false);
                        aVar3 = aVar;
                        z7 = false;
                        z6 = true;
                    } else {
                        String str = strF;
                        Integer num = numValueOf;
                        bj4VarO.K(1001651663);
                        aVar3 = aVar;
                        IntercomButton.Style styleM569outlinedStyleKlgxPg = IntercomButton.INSTANCE.m569outlinedStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                        bj4VarO.K(-937514178);
                        boolean zJ2 = bj4VarO.j(context);
                        if ((i3 & 14) == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z5 = zJ2 | z4;
                        objF = bj4VarO.f();
                        if (!z5 || objF == c0187a) {
                            z6 = true;
                            objF = new fk8(1 == true ? 1 : 0, teamPresenceState, context);
                            bj4VarO.C(objF);
                        } else {
                            z6 = true;
                        }
                        mh4 mh4Var = (mh4) objF;
                        z7 = false;
                        bj4VarO.U(false);
                        IntercomButtonKt.IntercomButton(null, styleM569outlinedStyleKlgxPg, str, num, mh4Var, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                        bj4Var = bj4VarO;
                        bj4Var.U(false);
                    }
                    b47.b(bj4Var, ir9.d(aVar3, 16.0f));
                    bj4Var.K(-937510359);
                    if (strF2 != null) {
                        bj4 bj4Var2 = bj4Var;
                        teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
                        mia.b(strF2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04Point5(), u7d.d(4285887861L), 0L, null, null, 0L, 0L, null, null, 16777214), bj4Var2, 0, 0, 131070);
                        bj4Var = bj4Var2;
                    } else {
                        teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
                    }
                    bj4Var.U(z7);
                    bj4Var.U(z6);
                    z8 = z3;
                    teamPresenceButtonStyle6 = teamPresenceButtonStyle5;
                } else {
                    bj4VarO.u();
                    z8 = z2;
                    teamPresenceButtonStyle6 = teamPresenceButtonStyle2;
                    bj4Var = bj4VarO;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: kaa
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$6(teamPresenceState, z8, teamPresenceButtonStyle6, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            teamPresenceButtonStyle2 = teamPresenceButtonStyle;
            if ((i3 & 147) == 146) {
                i6 = 1;
                if (i7 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                } else {
                    teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                aVar = ox6.a.t;
                ox6 ox6VarK2 = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 24.0f, 1);
                aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK2);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-937558243);
                if (z3) {
                    IntercomDividerKt.IntercomDivider(eo7.m(ir9.n(aVar, 100.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), bj4VarO, 6, 0);
                }
                bj4VarO.U(false);
                strF = nr1.f(bj4VarO, teamPresenceState.getMessageButtonText());
                numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                Integer subtitleText2 = teamPresenceState.getSubtitleText();
                bj4VarO.K(-937545761);
                if (subtitleText2 != null) {
                }
                bj4VarO.U(false);
                if (teamPresenceState.getCtaData() != null) {
                    strF = teamPresenceState.getCtaData().getText();
                    icon = teamPresenceState.getCtaData().getIcon().getIcon();
                    if (icon != null) {
                        numValueOf = icon;
                    }
                    strF2 = teamPresenceState.getCtaData().getSubtitle();
                }
                bj4VarO.K(-937533382);
                if (teamPresenceState.getConversationState() != null) {
                    strF = nr1.f(bj4VarO, teamPresenceState.getConversationState().getMessageButtonText());
                }
                bj4VarO.U(false);
                teamPresenceButtonStyle4 = TeamPresenceButtonStyle.PRIMARY;
                jt1.a.C0187a c0187a2 = jt1.a.a;
                if (teamPresenceButtonStyle3 == teamPresenceButtonStyle4) {
                    bj4VarO.K(1001451744);
                    bj4VarO.K(-937522146);
                    boolean zJ3 = bj4VarO.j(context);
                    if ((i3 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z9 | zJ3;
                    objF2 = bj4VarO.f();
                    if (z10) {
                        objF2 = new y30(i6, teamPresenceState, context);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new y30(i6, teamPresenceState, context);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    IntercomPrimaryButtonKt.IntercomPrimaryButton(strF, null, numValueOf, (mh4) objF2, bj4VarO, 0, 2);
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    aVar3 = aVar;
                    z7 = false;
                    z6 = true;
                } else {
                    String str2 = strF;
                    Integer num2 = numValueOf;
                    bj4VarO.K(1001651663);
                    aVar3 = aVar;
                    IntercomButton.Style styleM569outlinedStyleKlgxPg2 = IntercomButton.INSTANCE.m569outlinedStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                    bj4VarO.K(-937514178);
                    boolean zJ4 = bj4VarO.j(context);
                    if ((i3 & 14) == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ4 | z4;
                    objF = bj4VarO.f();
                    if (z5) {
                        z6 = true;
                        objF = new fk8(1 == true ? 1 : 0, teamPresenceState, context);
                        bj4VarO.C(objF);
                    } else {
                        z6 = true;
                        objF = new fk8(1 == true ? 1 : 0, teamPresenceState, context);
                        bj4VarO.C(objF);
                    }
                    mh4 mh4Var2 = (mh4) objF;
                    z7 = false;
                    bj4VarO.U(false);
                    IntercomButtonKt.IntercomButton(null, styleM569outlinedStyleKlgxPg2, str2, num2, mh4Var2, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                }
                b47.b(bj4Var, ir9.d(aVar3, 16.0f));
                bj4Var.K(-937510359);
                if (strF2 != null) {
                    bj4 bj4Var3 = bj4Var;
                    teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
                    mia.b(strF2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04Point5(), u7d.d(4285887861L), 0L, null, null, 0L, 0L, null, null, 16777214), bj4Var3, 0, 0, 131070);
                    bj4Var = bj4Var3;
                } else {
                    teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
                }
                bj4Var.U(z7);
                bj4Var.U(z6);
                z8 = z3;
                teamPresenceButtonStyle6 = teamPresenceButtonStyle5;
            } else {
                i6 = 1;
                if (i7 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                } else {
                    teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                aVar = ox6.a.t;
                ox6 ox6VarK3 = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 24.0f, 1);
                aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK3);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-937558243);
                if (z3) {
                    IntercomDividerKt.IntercomDivider(eo7.m(ir9.n(aVar, 100.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), bj4VarO, 6, 0);
                }
                bj4VarO.U(false);
                strF = nr1.f(bj4VarO, teamPresenceState.getMessageButtonText());
                numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                Integer subtitleText3 = teamPresenceState.getSubtitleText();
                bj4VarO.K(-937545761);
                if (subtitleText3 != null) {
                }
                bj4VarO.U(false);
                if (teamPresenceState.getCtaData() != null) {
                    strF = teamPresenceState.getCtaData().getText();
                    icon = teamPresenceState.getCtaData().getIcon().getIcon();
                    if (icon != null) {
                        numValueOf = icon;
                    }
                    strF2 = teamPresenceState.getCtaData().getSubtitle();
                }
                bj4VarO.K(-937533382);
                if (teamPresenceState.getConversationState() != null) {
                    strF = nr1.f(bj4VarO, teamPresenceState.getConversationState().getMessageButtonText());
                }
                bj4VarO.U(false);
                teamPresenceButtonStyle4 = TeamPresenceButtonStyle.PRIMARY;
                jt1.a.C0187a c0187a3 = jt1.a.a;
                if (teamPresenceButtonStyle3 == teamPresenceButtonStyle4) {
                    bj4VarO.K(1001451744);
                    bj4VarO.K(-937522146);
                    boolean zJ5 = bj4VarO.j(context);
                    if ((i3 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z9 | zJ5;
                    objF2 = bj4VarO.f();
                    if (z10) {
                        objF2 = new y30(i6, teamPresenceState, context);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new y30(i6, teamPresenceState, context);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    IntercomPrimaryButtonKt.IntercomPrimaryButton(strF, null, numValueOf, (mh4) objF2, bj4VarO, 0, 2);
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    aVar3 = aVar;
                    z7 = false;
                    z6 = true;
                } else {
                    String str3 = strF;
                    Integer num3 = numValueOf;
                    bj4VarO.K(1001651663);
                    aVar3 = aVar;
                    IntercomButton.Style styleM569outlinedStyleKlgxPg3 = IntercomButton.INSTANCE.m569outlinedStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                    bj4VarO.K(-937514178);
                    boolean zJ6 = bj4VarO.j(context);
                    if ((i3 & 14) == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ6 | z4;
                    objF = bj4VarO.f();
                    if (z5) {
                        z6 = true;
                        objF = new fk8(1 == true ? 1 : 0, teamPresenceState, context);
                        bj4VarO.C(objF);
                    } else {
                        z6 = true;
                        objF = new fk8(1 == true ? 1 : 0, teamPresenceState, context);
                        bj4VarO.C(objF);
                    }
                    mh4 mh4Var3 = (mh4) objF;
                    z7 = false;
                    bj4VarO.U(false);
                    IntercomButtonKt.IntercomButton(null, styleM569outlinedStyleKlgxPg3, str3, num3, mh4Var3, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                }
                b47.b(bj4Var, ir9.d(aVar3, 16.0f));
                bj4Var.K(-937510359);
                if (strF2 != null) {
                    bj4 bj4Var4 = bj4Var;
                    teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
                    mia.b(strF2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04Point5(), u7d.d(4285887861L), 0L, null, null, 0L, 0L, null, null, 16777214), bj4Var4, 0, 0, 131070);
                    bj4Var = bj4Var4;
                } else {
                    teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
                }
                bj4Var.U(z7);
                bj4Var.U(z6);
                z8 = z3;
                teamPresenceButtonStyle6 = teamPresenceButtonStyle5;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: kaa
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TeamPresenceComponentKt.TeamPresenceComponent$lambda$6(teamPresenceState, z8, teamPresenceButtonStyle6, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                teamPresenceButtonStyle2 = teamPresenceButtonStyle;
                if (bj4VarO.J(teamPresenceButtonStyle2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 147) == 146) {
                i6 = 1;
                if (i7 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                } else {
                    teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                aVar = ox6.a.t;
                ox6 ox6VarK4 = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 24.0f, 1);
                aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK4);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-937558243);
                if (z3) {
                    IntercomDividerKt.IntercomDivider(eo7.m(ir9.n(aVar, 100.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), bj4VarO, 6, 0);
                }
                bj4VarO.U(false);
                strF = nr1.f(bj4VarO, teamPresenceState.getMessageButtonText());
                numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                Integer subtitleText4 = teamPresenceState.getSubtitleText();
                bj4VarO.K(-937545761);
                if (subtitleText4 != null) {
                }
                bj4VarO.U(false);
                if (teamPresenceState.getCtaData() != null) {
                    strF = teamPresenceState.getCtaData().getText();
                    icon = teamPresenceState.getCtaData().getIcon().getIcon();
                    if (icon != null) {
                        numValueOf = icon;
                    }
                    strF2 = teamPresenceState.getCtaData().getSubtitle();
                }
                bj4VarO.K(-937533382);
                if (teamPresenceState.getConversationState() != null) {
                    strF = nr1.f(bj4VarO, teamPresenceState.getConversationState().getMessageButtonText());
                }
                bj4VarO.U(false);
                teamPresenceButtonStyle4 = TeamPresenceButtonStyle.PRIMARY;
                jt1.a.C0187a c0187a4 = jt1.a.a;
                if (teamPresenceButtonStyle3 == teamPresenceButtonStyle4) {
                    bj4VarO.K(1001451744);
                    bj4VarO.K(-937522146);
                    boolean zJ7 = bj4VarO.j(context);
                    if ((i3 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z9 | zJ7;
                    objF2 = bj4VarO.f();
                    if (z10) {
                        objF2 = new y30(i6, teamPresenceState, context);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new y30(i6, teamPresenceState, context);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    IntercomPrimaryButtonKt.IntercomPrimaryButton(strF, null, numValueOf, (mh4) objF2, bj4VarO, 0, 2);
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    aVar3 = aVar;
                    z7 = false;
                    z6 = true;
                } else {
                    String str4 = strF;
                    Integer num4 = numValueOf;
                    bj4VarO.K(1001651663);
                    aVar3 = aVar;
                    IntercomButton.Style styleM569outlinedStyleKlgxPg4 = IntercomButton.INSTANCE.m569outlinedStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                    bj4VarO.K(-937514178);
                    boolean zJ8 = bj4VarO.j(context);
                    if ((i3 & 14) == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ8 | z4;
                    objF = bj4VarO.f();
                    if (z5) {
                        z6 = true;
                        objF = new fk8(1 == true ? 1 : 0, teamPresenceState, context);
                        bj4VarO.C(objF);
                    } else {
                        z6 = true;
                        objF = new fk8(1 == true ? 1 : 0, teamPresenceState, context);
                        bj4VarO.C(objF);
                    }
                    mh4 mh4Var4 = (mh4) objF;
                    z7 = false;
                    bj4VarO.U(false);
                    IntercomButtonKt.IntercomButton(null, styleM569outlinedStyleKlgxPg4, str4, num4, mh4Var4, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                }
                b47.b(bj4Var, ir9.d(aVar3, 16.0f));
                bj4Var.K(-937510359);
                if (strF2 != null) {
                    bj4 bj4Var5 = bj4Var;
                    teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
                    mia.b(strF2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04Point5(), u7d.d(4285887861L), 0L, null, null, 0L, 0L, null, null, 16777214), bj4Var5, 0, 0, 131070);
                    bj4Var = bj4Var5;
                } else {
                    teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
                }
                bj4Var.U(z7);
                bj4Var.U(z6);
                z8 = z3;
                teamPresenceButtonStyle6 = teamPresenceButtonStyle5;
            } else {
                i6 = 1;
                if (i7 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i4 != 0) {
                    teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                } else {
                    teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                aVar = ox6.a.t;
                ox6 ox6VarK5 = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 24.0f, 1);
                aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarK5);
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
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-937558243);
                if (z3) {
                    IntercomDividerKt.IntercomDivider(eo7.m(ir9.n(aVar, 100.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), bj4VarO, 6, 0);
                }
                bj4VarO.U(false);
                strF = nr1.f(bj4VarO, teamPresenceState.getMessageButtonText());
                numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                Integer subtitleText5 = teamPresenceState.getSubtitleText();
                bj4VarO.K(-937545761);
                if (subtitleText5 != null) {
                }
                bj4VarO.U(false);
                if (teamPresenceState.getCtaData() != null) {
                    strF = teamPresenceState.getCtaData().getText();
                    icon = teamPresenceState.getCtaData().getIcon().getIcon();
                    if (icon != null) {
                        numValueOf = icon;
                    }
                    strF2 = teamPresenceState.getCtaData().getSubtitle();
                }
                bj4VarO.K(-937533382);
                if (teamPresenceState.getConversationState() != null) {
                    strF = nr1.f(bj4VarO, teamPresenceState.getConversationState().getMessageButtonText());
                }
                bj4VarO.U(false);
                teamPresenceButtonStyle4 = TeamPresenceButtonStyle.PRIMARY;
                jt1.a.C0187a c0187a5 = jt1.a.a;
                if (teamPresenceButtonStyle3 == teamPresenceButtonStyle4) {
                    bj4VarO.K(1001451744);
                    bj4VarO.K(-937522146);
                    boolean zJ9 = bj4VarO.j(context);
                    if ((i3 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z9 | zJ9;
                    objF2 = bj4VarO.f();
                    if (z10) {
                        objF2 = new y30(i6, teamPresenceState, context);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new y30(i6, teamPresenceState, context);
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    IntercomPrimaryButtonKt.IntercomPrimaryButton(strF, null, numValueOf, (mh4) objF2, bj4VarO, 0, 2);
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                    aVar3 = aVar;
                    z7 = false;
                    z6 = true;
                } else {
                    String str5 = strF;
                    Integer num5 = numValueOf;
                    bj4VarO.K(1001651663);
                    aVar3 = aVar;
                    IntercomButton.Style styleM569outlinedStyleKlgxPg5 = IntercomButton.INSTANCE.m569outlinedStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                    bj4VarO.K(-937514178);
                    boolean zJ10 = bj4VarO.j(context);
                    if ((i3 & 14) == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zJ10 | z4;
                    objF = bj4VarO.f();
                    if (z5) {
                        z6 = true;
                        objF = new fk8(1 == true ? 1 : 0, teamPresenceState, context);
                        bj4VarO.C(objF);
                    } else {
                        z6 = true;
                        objF = new fk8(1 == true ? 1 : 0, teamPresenceState, context);
                        bj4VarO.C(objF);
                    }
                    mh4 mh4Var5 = (mh4) objF;
                    z7 = false;
                    bj4VarO.U(false);
                    IntercomButtonKt.IntercomButton(null, styleM569outlinedStyleKlgxPg5, str5, num5, mh4Var5, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                    bj4Var = bj4VarO;
                    bj4Var.U(false);
                }
                b47.b(bj4Var, ir9.d(aVar3, 16.0f));
                bj4Var.K(-937510359);
                if (strF2 != null) {
                    bj4 bj4Var6 = bj4Var;
                    teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
                    mia.b(strF2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04Point5(), u7d.d(4285887861L), 0L, null, null, 0L, 0L, null, null, 16777214), bj4Var6, 0, 0, 131070);
                    bj4Var = bj4Var6;
                } else {
                    teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
                }
                bj4Var.U(z7);
                bj4Var.U(z6);
                z8 = z3;
                teamPresenceButtonStyle6 = teamPresenceButtonStyle5;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: kaa
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TeamPresenceComponentKt.TeamPresenceComponent$lambda$6(teamPresenceState, z8, teamPresenceButtonStyle6, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        teamPresenceButtonStyle2 = teamPresenceButtonStyle;
        if ((i3 & 147) == 146) {
            i6 = 1;
            if (i7 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i4 != 0) {
                teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
            } else {
                teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            aVar = ox6.a.t;
            ox6 ox6VarK6 = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 24.0f, 1);
            aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarK6);
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(-937558243);
            if (z3) {
                IntercomDividerKt.IntercomDivider(eo7.m(ir9.n(aVar, 100.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), bj4VarO, 6, 0);
            }
            bj4VarO.U(false);
            strF = nr1.f(bj4VarO, teamPresenceState.getMessageButtonText());
            numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
            Integer subtitleText6 = teamPresenceState.getSubtitleText();
            bj4VarO.K(-937545761);
            if (subtitleText6 != null) {
            }
            bj4VarO.U(false);
            if (teamPresenceState.getCtaData() != null) {
                strF = teamPresenceState.getCtaData().getText();
                icon = teamPresenceState.getCtaData().getIcon().getIcon();
                if (icon != null) {
                    numValueOf = icon;
                }
                strF2 = teamPresenceState.getCtaData().getSubtitle();
            }
            bj4VarO.K(-937533382);
            if (teamPresenceState.getConversationState() != null) {
                strF = nr1.f(bj4VarO, teamPresenceState.getConversationState().getMessageButtonText());
            }
            bj4VarO.U(false);
            teamPresenceButtonStyle4 = TeamPresenceButtonStyle.PRIMARY;
            jt1.a.C0187a c0187a6 = jt1.a.a;
            if (teamPresenceButtonStyle3 == teamPresenceButtonStyle4) {
                bj4VarO.K(1001451744);
                bj4VarO.K(-937522146);
                boolean zJ11 = bj4VarO.j(context);
                if ((i3 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z9 | zJ11;
                objF2 = bj4VarO.f();
                if (z10) {
                    objF2 = new y30(i6, teamPresenceState, context);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new y30(i6, teamPresenceState, context);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                IntercomPrimaryButtonKt.IntercomPrimaryButton(strF, null, numValueOf, (mh4) objF2, bj4VarO, 0, 2);
                bj4Var = bj4VarO;
                bj4Var.U(false);
                aVar3 = aVar;
                z7 = false;
                z6 = true;
            } else {
                String str6 = strF;
                Integer num6 = numValueOf;
                bj4VarO.K(1001651663);
                aVar3 = aVar;
                IntercomButton.Style styleM569outlinedStyleKlgxPg6 = IntercomButton.INSTANCE.m569outlinedStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                bj4VarO.K(-937514178);
                boolean zJ12 = bj4VarO.j(context);
                if ((i3 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zJ12 | z4;
                objF = bj4VarO.f();
                if (z5) {
                    z6 = true;
                    objF = new fk8(1 == true ? 1 : 0, teamPresenceState, context);
                    bj4VarO.C(objF);
                } else {
                    z6 = true;
                    objF = new fk8(1 == true ? 1 : 0, teamPresenceState, context);
                    bj4VarO.C(objF);
                }
                mh4 mh4Var6 = (mh4) objF;
                z7 = false;
                bj4VarO.U(false);
                IntercomButtonKt.IntercomButton(null, styleM569outlinedStyleKlgxPg6, str6, num6, mh4Var6, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                bj4Var = bj4VarO;
                bj4Var.U(false);
            }
            b47.b(bj4Var, ir9.d(aVar3, 16.0f));
            bj4Var.K(-937510359);
            if (strF2 != null) {
                bj4 bj4Var7 = bj4Var;
                teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
                mia.b(strF2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04Point5(), u7d.d(4285887861L), 0L, null, null, 0L, 0L, null, null, 16777214), bj4Var7, 0, 0, 131070);
                bj4Var = bj4Var7;
            } else {
                teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
            }
            bj4Var.U(z7);
            bj4Var.U(z6);
            z8 = z3;
            teamPresenceButtonStyle6 = teamPresenceButtonStyle5;
        } else {
            i6 = 1;
            if (i7 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (i4 != 0) {
                teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
            } else {
                teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            aVar = ox6.a.t;
            ox6 ox6VarK7 = eo7.k(ir9.c(aVar, 1.0f), 0.0f, 24.0f, 1);
            aj1VarA = yi1.a(c30.c, di.a.n, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarK7);
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
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(-937558243);
            if (z3) {
                IntercomDividerKt.IntercomDivider(eo7.m(ir9.n(aVar, 100.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), bj4VarO, 6, 0);
            }
            bj4VarO.U(false);
            strF = nr1.f(bj4VarO, teamPresenceState.getMessageButtonText());
            numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
            Integer subtitleText7 = teamPresenceState.getSubtitleText();
            bj4VarO.K(-937545761);
            if (subtitleText7 != null) {
            }
            bj4VarO.U(false);
            if (teamPresenceState.getCtaData() != null) {
                strF = teamPresenceState.getCtaData().getText();
                icon = teamPresenceState.getCtaData().getIcon().getIcon();
                if (icon != null) {
                    numValueOf = icon;
                }
                strF2 = teamPresenceState.getCtaData().getSubtitle();
            }
            bj4VarO.K(-937533382);
            if (teamPresenceState.getConversationState() != null) {
                strF = nr1.f(bj4VarO, teamPresenceState.getConversationState().getMessageButtonText());
            }
            bj4VarO.U(false);
            teamPresenceButtonStyle4 = TeamPresenceButtonStyle.PRIMARY;
            jt1.a.C0187a c0187a7 = jt1.a.a;
            if (teamPresenceButtonStyle3 == teamPresenceButtonStyle4) {
                bj4VarO.K(1001451744);
                bj4VarO.K(-937522146);
                boolean zJ13 = bj4VarO.j(context);
                if ((i3 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z9 | zJ13;
                objF2 = bj4VarO.f();
                if (z10) {
                    objF2 = new y30(i6, teamPresenceState, context);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new y30(i6, teamPresenceState, context);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                IntercomPrimaryButtonKt.IntercomPrimaryButton(strF, null, numValueOf, (mh4) objF2, bj4VarO, 0, 2);
                bj4Var = bj4VarO;
                bj4Var.U(false);
                aVar3 = aVar;
                z7 = false;
                z6 = true;
            } else {
                String str7 = strF;
                Integer num7 = numValueOf;
                bj4VarO.K(1001651663);
                aVar3 = aVar;
                IntercomButton.Style styleM569outlinedStyleKlgxPg7 = IntercomButton.INSTANCE.m569outlinedStyleKlgxPg(0L, 0L, null, bj4VarO, IntercomButton.$stable << 9, 7);
                bj4VarO.K(-937514178);
                boolean zJ14 = bj4VarO.j(context);
                if ((i3 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zJ14 | z4;
                objF = bj4VarO.f();
                if (z5) {
                    z6 = true;
                    objF = new fk8(1 == true ? 1 : 0, teamPresenceState, context);
                    bj4VarO.C(objF);
                } else {
                    z6 = true;
                    objF = new fk8(1 == true ? 1 : 0, teamPresenceState, context);
                    bj4VarO.C(objF);
                }
                mh4 mh4Var7 = (mh4) objF;
                z7 = false;
                bj4VarO.U(false);
                IntercomButtonKt.IntercomButton(null, styleM569outlinedStyleKlgxPg7, str7, num7, mh4Var7, bj4VarO, IntercomButton.Style.$stable << 3, 1);
                bj4Var = bj4VarO;
                bj4Var.U(false);
            }
            b47.b(bj4Var, ir9.d(aVar3, 16.0f));
            bj4Var.K(-937510359);
            if (strF2 != null) {
                bj4 bj4Var8 = bj4Var;
                teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
                mia.b(strF2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(IntercomTheme.INSTANCE.getTypography(bj4Var, IntercomTheme.$stable).getType04Point5(), u7d.d(4285887861L), 0L, null, null, 0L, 0L, null, null, 16777214), bj4Var8, 0, 0, 131070);
                bj4Var = bj4Var8;
            } else {
                teamPresenceButtonStyle5 = teamPresenceButtonStyle3;
            }
            bj4Var.U(z7);
            bj4Var.U(z6);
            z8 = z3;
            teamPresenceButtonStyle6 = teamPresenceButtonStyle5;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: kaa
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TeamPresenceComponentKt.TeamPresenceComponent$lambda$6(teamPresenceState, z8, teamPresenceButtonStyle6, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeamPresenceComponent$lambda$5$lambda$2$lambda$1(ArticleViewState.TeamPresenceState teamPresenceState, Context context) {
        TeamPresenceComponent$onClick(context, teamPresenceState);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeamPresenceComponent$lambda$5$lambda$4$lambda$3(ArticleViewState.TeamPresenceState teamPresenceState, Context context) {
        TeamPresenceComponent$onClick(context, teamPresenceState);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeamPresenceComponent$lambda$6(ArticleViewState.TeamPresenceState teamPresenceState, boolean z, TeamPresenceButtonStyle teamPresenceButtonStyle, int i, int i2, jt1 jt1Var, int i3) {
        TeamPresenceComponent(teamPresenceState, z, teamPresenceButtonStyle, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final void TeamPresenceComponent$onClick(Context context, ArticleViewState.TeamPresenceState teamPresenceState) {
        Injector.get().getMetricTracker().clickedNewConversation(teamPresenceState.getMetricPlace(), teamPresenceState.getMetricContext(), teamPresenceState.isFromSearchBrowse());
        if (teamPresenceState.getConversationState() != null) {
            ConversationScreenOpenerKt.openComposer$default(context, null, false, null, teamPresenceState.getConversationState().getConversationId(), 14, null);
        } else if (teamPresenceState.getArticleMetadata() != null) {
            ConversationScreenOpenerKt.openComposer$default(context, null, false, teamPresenceState.getArticleMetadata(), null, 22, null);
        } else {
            ConversationScreenOpenerKt.openComposer$default(context, null, false, null, null, 30, null);
        }
    }

    public static final void TeamPresenceComponentWithBubble(ArticleViewState.TeamPresenceState teamPresenceState, jt1 jt1Var, final int i) {
        int i2;
        final ArticleViewState.TeamPresenceState teamPresenceState2 = teamPresenceState;
        teamPresenceState2.getClass();
        bj4 bj4VarO = jt1Var.o(1539837505);
        j1b j1bVar = bj4VarO.a;
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(teamPresenceState2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            float f = ((Configuration) bj4VarO.F(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            final long jM757getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m757getBubbleBackground0d7_KjU();
            boolean z = false;
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = it1.c(bj4VarO, aVar);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
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
            bt1.a.c cVar = bt1.a.f;
            rd7.d(bj4VarO, cVar, aj1VarA);
            bt1.a.e eVar = bt1.a.e;
            rd7.d(bj4VarO, eVar, kw7VarP);
            Integer numValueOf = Integer.valueOf(iHashCode);
            bt1.a.b bVar = bt1.a.g;
            rd7.d(bj4VarO, bVar, numValueOf);
            bt1.a.C0034a c0034a = bt1.a.h;
            rd7.c(bj4VarO, c0034a);
            bt1.a.d dVar = bt1.a.d;
            rd7.d(bj4VarO, dVar, ox6VarC);
            bj4VarO.K(-745953431);
            Integer subtitleText = teamPresenceState2.getSubtitleText();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (subtitleText != null) {
                ox6 ox6VarB = zf7.b((f / 2.0f) - 60.0f, 0.0f, aVar);
                bj4VarO.K(-745947382);
                boolean zI = bj4VarO.i(jM757getBubbleBackground0d7_KjU);
                Object objF = bj4VarO.f();
                if (zI || objF == c0187a) {
                    objF = new oh4() { // from class: haa
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$13$lambda$9$lambda$8(jM757getBubbleBackground0d7_KjU, (s01) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                z = false;
                bj4VarO.U(false);
                b47.b(bj4VarO, ir9.j(z63.d(ox6VarB, (oh4) objF), 16.0f));
            }
            bj4VarO.U(z);
            ox6 ox6VarA = uma.a(eo7.m(aVar, 24.0f, 0.0f, 24.0f, 24.0f, 2), ay8.b(8.0f));
            boolean z2 = teamPresenceState.getSubtitleText() != null;
            bj4VarO.K(-745925551);
            boolean zI2 = bj4VarO.i(jM757getBubbleBackground0d7_KjU);
            Object objF2 = bj4VarO.f();
            if (zI2 || objF2 == c0187a) {
                objF2 = new oh4() { // from class: iaa
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$13$lambda$11$lambda$10(jM757getBubbleBackground0d7_KjU, (ox6) obj);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            ox6 ox6VarIfTrue = ModifierExtensionsKt.ifTrue(ox6VarA, z2, (oh4) objF2);
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iHashCode2 = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP2 = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarIfTrue);
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
            teamPresenceState2 = teamPresenceState;
            TeamPresenceComponent(teamPresenceState2, false, TeamPresenceButtonStyle.PRIMARY, bj4VarO, (i2 & 14) | 432, 0);
            bj4VarO.U(true);
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: jaa
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$14(teamPresenceState2, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ox6 TeamPresenceComponentWithBubble$lambda$13$lambda$11$lambda$10(long j, ox6 ox6Var) {
        ox6Var.getClass();
        return gi0.c(ox6Var, j, al8.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c73 TeamPresenceComponentWithBubble$lambda$13$lambda$9$lambda$8(final long j, s01 s01Var) {
        s01Var.getClass();
        final vp vpVarA = xp.a();
        vpVarA.i(0.0f, Float.intBitsToFloat((int) (s01Var.t.c() & 4294967295L)));
        vpVarA.n(Float.intBitsToFloat((int) (s01Var.t.c() >> 32)) / 2.0f, Float.intBitsToFloat((int) (s01Var.t.c() & 4294967295L)) / 2.0f);
        vpVarA.n(Float.intBitsToFloat((int) (s01Var.t.c() >> 32)), Float.intBitsToFloat((int) (s01Var.t.c() & 4294967295L)));
        vpVarA.close();
        return s01Var.e(new r01(new oh4() { // from class: laa
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                return TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$13$lambda$9$lambda$8$lambda$7(vpVarA, j, (d73) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeamPresenceComponentWithBubble$lambda$13$lambda$9$lambda$8$lambda$7(cu7 cu7Var, long j, d73 d73Var) {
        d73Var.getClass();
        d73.o0(d73Var, cu7Var, j, null, null, 60);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeamPresenceComponentWithBubble$lambda$14(ArticleViewState.TeamPresenceState teamPresenceState, int i, jt1 jt1Var, int i2) {
        TeamPresenceComponentWithBubble(teamPresenceState, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TeamPresencePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-161512363);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamPresenceComponentKt.INSTANCE.m325getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new i12(i, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeamPresencePreview$lambda$16(int i, jt1 jt1Var, int i2) {
        TeamPresencePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TeamPresenceWithBubblePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1128132221);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamPresenceComponentKt.INSTANCE.m323getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new op4(i, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeamPresenceWithBubblePreview$lambda$15(int i, jt1 jt1Var, int i2) {
        TeamPresenceWithBubblePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
