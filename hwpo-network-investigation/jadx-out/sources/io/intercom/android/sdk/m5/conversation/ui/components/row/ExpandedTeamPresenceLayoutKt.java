package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a30;
import defpackage.ah5;
import defpackage.aj1;
import defpackage.b30;
import defpackage.b47;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cka;
import defpackage.di;
import defpackage.es7;
import defpackage.g2b;
import defpackage.gz3;
import defpackage.h27;
import defpackage.i27;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.j1b;
import defpackage.js7;
import defpackage.jt1;
import defpackage.kg0;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.m65;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.mq3;
import defpackage.nq3;
import defpackage.ny8;
import defpackage.ox6;
import defpackage.ph1;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.th1;
import defpackage.u;
import defpackage.uh1;
import defpackage.vaa;
import defpackage.we1;
import defpackage.wja;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ExpandedTeamPresenceLayoutKt {
    private static final float AvatarSize = 56.0f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AvatarType.values().length];
            try {
                iArr[AvatarType.FACEPILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarType.LAYERED_BUBBLES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarType.LOGO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AvatarType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Header.Expanded.Style.values().length];
            try {
                iArr2[Header.Expanded.Style.H1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Header.Expanded.Style.PARAGRAPH.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Header.Expanded.Style.INTRO.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Header.Expanded.Style.GREETING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0442  */
    /* JADX WARN: Code duplicated, block: B:102:0x0449  */
    /* JADX WARN: Code duplicated, block: B:103:0x044d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0479  */
    /* JADX WARN: Code duplicated, block: B:109:0x0496 A[LOOP:3: B:107:0x0490->B:109:0x0496, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:118:0x053e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0548  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c4 A[EDGE_INSN: B:122:0x02c4->B:69:0x02c4 BREAK  A[LOOP:0: B:66:0x024f->B:68:0x0257], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x052a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0142  */
    /* JADX WARN: Code duplicated, block: B:53:0x015c  */
    /* JADX WARN: Code duplicated, block: B:54:0x018e  */
    /* JADX WARN: Code duplicated, block: B:56:0x01af  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0208  */
    /* JADX WARN: Code duplicated, block: B:63:0x021d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0257 A[LOOP:0: B:66:0x024f->B:68:0x0257, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x02df  */
    /* JADX WARN: Code duplicated, block: B:73:0x0310  */
    /* JADX WARN: Code duplicated, block: B:75:0x0317  */
    /* JADX WARN: Code duplicated, block: B:76:0x031b  */
    /* JADX WARN: Code duplicated, block: B:80:0x034f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0361  */
    /* JADX WARN: Code duplicated, block: B:84:0x038c  */
    /* JADX WARN: Code duplicated, block: B:87:0x03b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:90:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:93:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:98:0x040a  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void ExpandedTeamPresenceLayout(final ExpandedTeamPresenceState expandedTeamPresenceState, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        final ox6 ox6Var2;
        ox6.a aVar;
        ox6 ox6Var3;
        sp0.a aVar2;
        aj1 aj1VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar3;
        Context context;
        int i4;
        ox6 ox6Var4;
        sp0.a aVar4;
        int i5;
        char c;
        js7 js7Var;
        ox6.a aVar5;
        bj4 bj4Var;
        char c2;
        Iterator<T> it;
        bj4 bj4Var2;
        float f;
        ox6.a aVar6;
        boolean z;
        boolean zIsEmpty;
        sp0.b bVar;
        bj4 bj4Var3;
        ny8 ny8VarA;
        int iHashCode2;
        kw7 kw7VarP2;
        ox6 ox6VarC2;
        qr5.a aVar7;
        ox6.a aVar8;
        ArrayList arrayList;
        Iterator<T> it2;
        ny8 ny8VarA2;
        int iHashCode3;
        kw7 kw7VarP3;
        ox6 ox6VarC3;
        qr5.a aVar9;
        final Context context2;
        Object objF;
        Object obj;
        Object obj2;
        boolean zJ;
        Object obj3;
        ox6.a aVar10;
        bj4 bj4Var4;
        bj4 bj4Var5;
        bj4 bj4Var6;
        xj8 xj8VarW;
        expandedTeamPresenceState.getClass();
        bj4 bj4VarO = jt1Var.o(-1694898660);
        j1b j1bVar = bj4VarO.a;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(expandedTeamPresenceState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !bj4VarO.r()) {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var3 = aVar;
                } else {
                    ox6Var3 = ox6Var2;
                }
                Context context3 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                c30.k kVar = c30.c;
                aVar2 = di.a.n;
                aj1VarA = yi1.a(kVar, aVar2, bj4VarO, 48);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var3);
                bt1.c.getClass();
                aVar3 = bt1.a.b;
                context = context3;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar3);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, aj1VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                i4 = WhenMappings.$EnumSwitchMapping$0[expandedTeamPresenceState.getAvatarType().ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        ox6Var4 = ox6Var3;
                        aVar4 = aVar2;
                        i5 = 0;
                        bj4VarO.K(-654655587);
                        if (expandedTeamPresenceState.getAvatars().size() == 1) {
                            bj4VarO.K(-654606390);
                            AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, AvatarSize), expandedTeamPresenceState.getAvatars().get(0), null, expandedTeamPresenceState.getDisplayActiveIndicator(), cka.b(24), null, bj4VarO, 24582, 36);
                            bj4 bj4Var7 = bj4VarO;
                            bj4Var7.U(false);
                            aVar10 = aVar;
                            bj4Var4 = bj4Var7;
                        } else {
                            bj4VarO.K(-654265855);
                            aVar10 = aVar;
                            AvatarGroupKt.m19AvatarGroupJ8mCjc(expandedTeamPresenceState.getAvatars(), aVar10, AvatarSize, cka.b(24), bj4VarO, 3504, 0);
                            bj4VarO.U(false);
                            bj4Var4 = bj4VarO;
                        }
                        bj4Var4.U(false);
                        g2b g2bVar = g2b.a;
                        aVar5 = aVar10;
                        bj4Var5 = bj4Var4;
                    } else if (i4 == 3) {
                        bj4VarO.K(-653933318);
                        aVar4 = aVar2;
                        ox6Var4 = ox6Var3;
                        i5 = 0;
                        AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, AvatarSize), expandedTeamPresenceState.getAvatars().get(0), null, expandedTeamPresenceState.getDisplayActiveIndicator(), cka.b(24), new uh1(uh1.j), bj4VarO, 221190, 4);
                        bj4 bj4Var8 = bj4VarO;
                        bj4Var8.U(false);
                        g2b g2bVar2 = g2b.a;
                        aVar5 = aVar;
                        bj4Var5 = bj4Var8;
                    } else {
                        if (i4 != 4) {
                            bj4VarO.K(-852429191);
                            bj4VarO.U(false);
                            u.b();
                            return;
                        }
                        bj4VarO.K(-653494885);
                        bj4VarO.U(false);
                        g2b g2bVar3 = g2b.a;
                        context = context;
                        j1bVar = j1bVar;
                        ox6Var4 = ox6Var3;
                        aVar4 = aVar2;
                        c = 2;
                        aVar5 = aVar;
                        i5 = 0;
                        bj4Var = bj4VarO;
                    }
                    c = 2;
                    bj4Var = bj4Var5;
                } else {
                    context = context;
                    j1bVar = j1bVar;
                    ox6Var4 = ox6Var3;
                    aVar4 = aVar2;
                    i5 = 0;
                    bj4VarO.K(-655467756);
                    Avatar avatar = ((AvatarWrapper) th1.y(expandedTeamPresenceState.getAvatars())).getAvatar();
                    if (expandedTeamPresenceState.getAvatars().size() >= 3) {
                        c = 2;
                        js7Var = new js7(expandedTeamPresenceState.getAvatars().get(1).getAvatar(), expandedTeamPresenceState.getAvatars().get(2).getAvatar());
                    } else {
                        c = 2;
                        if (expandedTeamPresenceState.getAvatars().size() == 2) {
                            js7Var = new js7(expandedTeamPresenceState.getAvatars().get(1).getAvatar(), null);
                        } else {
                            js7Var = new js7(null, null);
                        }
                    }
                    aVar5 = aVar;
                    BotAndHumansFacePileKt.m21BotAndHumansFacePilehGBTI10(aVar5, avatar, js7Var, AvatarSize, null, bj4VarO, 3078, 16);
                    bj4VarO.U(false);
                    g2b g2bVar4 = g2b.a;
                    bj4Var = bj4VarO;
                }
                c2 = 0;
                b47.b(bj4Var, ir9.d(aVar5, 12.0f));
                bj4Var.K(-852359896);
                it = expandedTeamPresenceState.getBody().iterator();
                bj4Var2 = bj4Var;
                while (true) {
                    f = 4.0f;
                    if (!it.hasNext()) {
                        break;
                    }
                    Header.Expanded.Body body = (Header.Expanded.Body) it.next();
                    b47.b(bj4Var2, ir9.d(aVar5, 4.0f));
                    bj4 bj4Var9 = bj4Var2;
                    mia.b(body.getText(), null, 0L, 0L, null, 0L, new vaa(3), 0L, 2, false, 2, 0, null, getTextStyleFor(body.getStyle(), body.getColor(), bj4Var2, i5, i5), bj4Var9, 0, 24960, 109566);
                    c2 = 0;
                    c = 2;
                    i5 = i5;
                    aVar5 = aVar5;
                    bj4Var2 = bj4Var9;
                }
                aVar6 = aVar5;
                z = i5;
                bj4Var2.U(z);
                bj4Var2.K(-852346650);
                zIsEmpty = expandedTeamPresenceState.getSocialAccounts().isEmpty();
                bVar = di.a.k;
                if (!zIsEmpty) {
                    b47.b(bj4Var2, ir9.d(aVar6, 12.0f));
                    ny8VarA2 = ly8.a(new c30.h(8.0f, true, new b30(aVar4)), bVar, bj4Var2, 54);
                    iHashCode3 = Long.hashCode(bj4Var2.T);
                    kw7VarP3 = bj4Var2.P();
                    ox6VarC3 = it1.c(bj4Var2, aVar6);
                    bt1.c.getClass();
                    aVar9 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var2.q();
                    if (bj4Var2.S) {
                        bj4Var2.k(aVar9);
                    } else {
                        bj4Var2.z();
                    }
                    rd7.d(bj4Var2, bt1.a.f, ny8VarA2);
                    rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                    rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                    rd7.c(bj4Var2, bt1.a.h);
                    rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                    bj4Var2.K(-457726390);
                    for (final Header.Expanded.SocialAccount socialAccount : expandedTeamPresenceState.getSocialAccounts()) {
                        if (xj5.a(socialAccount.getProvider(), "twitter")) {
                            es7 es7VarA = is7.a(R.drawable.intercom_twitter, bj4Var2, z ? 1 : 0);
                            String provider = socialAccount.getProvider();
                            long jM752getActionContrastWhite0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4Var2, IntercomTheme.$stable).m752getActionContrastWhite0d7_KjU();
                            ox6 ox6VarJ = ir9.j(aVar6, 16.0f);
                            bj4Var2.K(-144020278);
                            objF = bj4Var2.f();
                            obj = jt1.a.a;
                            if (objF == obj) {
                                obj2 = objF;
                                Object i27Var = new i27();
                                bj4Var2.C(i27Var);
                                obj2 = i27Var;
                            }
                            obj2 = objF;
                            h27 h27Var = (h27) obj2;
                            bj4Var2.U(z);
                            bj4Var2.K(-144016142);
                            context2 = context;
                            zJ = bj4Var2.J(socialAccount) | bj4Var2.j(context2);
                            Object objF2 = bj4Var2.f();
                            obj3 = objF2;
                            if (zJ || objF2 == obj) {
                                Object obj4 = new mh4() { // from class: kq3
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout$lambda$9$lambda$5$lambda$4$lambda$3$lambda$2(socialAccount, context2);
                                    }
                                };
                                bj4Var2.C(obj4);
                                obj3 = obj4;
                            }
                            bj4Var2.U(z);
                            m65.b(es7VarA, provider, we1.b(ox6VarJ, h27Var, null, false, null, (mh4) obj3, 28), jM752getActionContrastWhite0d7_KjU, bj4Var2, 8, 0);
                        } else {
                            context2 = context;
                        }
                        context = context2;
                    }
                    bj4Var2.U(z);
                    bj4Var2.U(true);
                }
                bj4Var2.U(z);
                bj4Var2.K(-852298704);
                bj4Var3 = bj4Var2;
                for (Header.Expanded.Footer footer : expandedTeamPresenceState.getFooters()) {
                    b47.b(bj4Var3, ir9.d(aVar6, f));
                    ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var3, 54);
                    iHashCode2 = Long.hashCode(bj4Var3.T);
                    kw7VarP2 = bj4Var3.P();
                    ox6VarC2 = it1.c(bj4Var3, aVar6);
                    bt1.c.getClass();
                    aVar7 = bt1.a.b;
                    if (j1bVar == null) {
                        ml5.c();
                        throw null;
                    }
                    bj4Var3.q();
                    if (bj4Var3.S) {
                        bj4Var3.k(aVar7);
                    } else {
                        bj4Var3.z();
                    }
                    rd7.d(bj4Var3, bt1.a.f, ny8VarA);
                    rd7.d(bj4Var3, bt1.a.e, kw7VarP2);
                    rd7.d(bj4Var3, bt1.a.g, Integer.valueOf(iHashCode2));
                    rd7.c(bj4Var3, bt1.a.h);
                    rd7.d(bj4Var3, bt1.a.d, ox6VarC2);
                    bj4Var3.K(-143995125);
                    if (footer.getAvatarDetails() != null) {
                        List<Avatar.Builder> avatars = footer.getAvatarDetails().getAvatars();
                        arrayList = new ArrayList(ph1.n(avatars, 10));
                        it2 = avatars.iterator();
                        while (it2.hasNext()) {
                            Avatar avatarBuild = ((Avatar.Builder) it2.next()).build();
                            avatarBuild.getClass();
                            arrayList.add(new AvatarWrapper(avatarBuild, z, 2, null));
                        }
                        ox6.a aVar11 = aVar6;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(arrayList, aVar11, 20.0f, 0L, bj4Var3, 432, 8);
                        aVar8 = aVar11;
                    } else {
                        aVar8 = aVar6;
                    }
                    bj4Var3.U(z);
                    bj4 bj4Var10 = bj4Var3;
                    mia.b(footer.getText(), null, 0L, 0L, null, 0L, new vaa(3), 0L, 2, false, 2, 0, null, getTextStyleFor(footer.getStyle(), footer.getColor(), bj4Var3, z ? 1 : 0, z ? 1 : 0), bj4Var10, 0, 24960, 109566);
                    bj4 bj4Var11 = bj4Var10;
                    bj4Var11.U(true);
                    f = f;
                    bVar = bVar;
                    aVar6 = aVar8;
                    bj4Var3 = bj4Var11;
                }
                bj4Var3.U(z);
                bj4Var3.U(true);
                ox6Var2 = ox6Var4;
                bj4Var6 = bj4Var3;
            } else {
                bj4VarO.u();
                bj4Var6 = bj4VarO;
            }
            xj8VarW = bj4Var6.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: lq3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj5, Object obj6) {
                        int iIntValue = ((Integer) obj6).intValue();
                        return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout$lambda$10(expandedTeamPresenceState, ox6Var2, i, i2, (jt1) obj5, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        if ((i3 & 19) == 18) {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            Context context4 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            c30.k kVar2 = c30.c;
            aVar2 = di.a.n;
            aj1VarA = yi1.a(kVar2, aVar2, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
            bt1.c.getClass();
            aVar3 = bt1.a.b;
            context = context4;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            i4 = WhenMappings.$EnumSwitchMapping$0[expandedTeamPresenceState.getAvatarType().ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    ox6Var4 = ox6Var3;
                    aVar4 = aVar2;
                    i5 = 0;
                    bj4VarO.K(-654655587);
                    if (expandedTeamPresenceState.getAvatars().size() == 1) {
                        bj4VarO.K(-654606390);
                        AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, AvatarSize), expandedTeamPresenceState.getAvatars().get(0), null, expandedTeamPresenceState.getDisplayActiveIndicator(), cka.b(24), null, bj4VarO, 24582, 36);
                        bj4 bj4Var12 = bj4VarO;
                        bj4Var12.U(false);
                        aVar10 = aVar;
                        bj4Var4 = bj4Var12;
                    } else {
                        bj4VarO.K(-654265855);
                        aVar10 = aVar;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(expandedTeamPresenceState.getAvatars(), aVar10, AvatarSize, cka.b(24), bj4VarO, 3504, 0);
                        bj4VarO.U(false);
                        bj4Var4 = bj4VarO;
                    }
                    bj4Var4.U(false);
                    g2b g2bVar5 = g2b.a;
                    aVar5 = aVar10;
                    bj4Var5 = bj4Var4;
                } else if (i4 == 3) {
                    bj4VarO.K(-653933318);
                    aVar4 = aVar2;
                    ox6Var4 = ox6Var3;
                    i5 = 0;
                    AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, AvatarSize), expandedTeamPresenceState.getAvatars().get(0), null, expandedTeamPresenceState.getDisplayActiveIndicator(), cka.b(24), new uh1(uh1.j), bj4VarO, 221190, 4);
                    bj4 bj4Var13 = bj4VarO;
                    bj4Var13.U(false);
                    g2b g2bVar6 = g2b.a;
                    aVar5 = aVar;
                    bj4Var5 = bj4Var13;
                } else {
                    if (i4 != 4) {
                        bj4VarO.K(-852429191);
                        bj4VarO.U(false);
                        u.b();
                        return;
                    }
                    bj4VarO.K(-653494885);
                    bj4VarO.U(false);
                    g2b g2bVar7 = g2b.a;
                    context = context;
                    j1bVar = j1bVar;
                    ox6Var4 = ox6Var3;
                    aVar4 = aVar2;
                    c = 2;
                    aVar5 = aVar;
                    i5 = 0;
                    bj4Var = bj4VarO;
                }
                c = 2;
                bj4Var = bj4Var5;
            } else {
                context = context;
                j1bVar = j1bVar;
                ox6Var4 = ox6Var3;
                aVar4 = aVar2;
                i5 = 0;
                bj4VarO.K(-655467756);
                Avatar avatar2 = ((AvatarWrapper) th1.y(expandedTeamPresenceState.getAvatars())).getAvatar();
                if (expandedTeamPresenceState.getAvatars().size() >= 3) {
                    c = 2;
                    js7Var = new js7(expandedTeamPresenceState.getAvatars().get(1).getAvatar(), expandedTeamPresenceState.getAvatars().get(2).getAvatar());
                } else {
                    c = 2;
                    if (expandedTeamPresenceState.getAvatars().size() == 2) {
                        js7Var = new js7(expandedTeamPresenceState.getAvatars().get(1).getAvatar(), null);
                    } else {
                        js7Var = new js7(null, null);
                    }
                }
                aVar5 = aVar;
                BotAndHumansFacePileKt.m21BotAndHumansFacePilehGBTI10(aVar5, avatar2, js7Var, AvatarSize, null, bj4VarO, 3078, 16);
                bj4VarO.U(false);
                g2b g2bVar8 = g2b.a;
                bj4Var = bj4VarO;
            }
            c2 = 0;
            b47.b(bj4Var, ir9.d(aVar5, 12.0f));
            bj4Var.K(-852359896);
            it = expandedTeamPresenceState.getBody().iterator();
            bj4Var2 = bj4Var;
            while (true) {
                f = 4.0f;
                if (!it.hasNext()) {
                    break;
                    break;
                }
                Header.Expanded.Body body2 = (Header.Expanded.Body) it.next();
                b47.b(bj4Var2, ir9.d(aVar5, 4.0f));
                bj4 bj4Var14 = bj4Var2;
                mia.b(body2.getText(), null, 0L, 0L, null, 0L, new vaa(3), 0L, 2, false, 2, 0, null, getTextStyleFor(body2.getStyle(), body2.getColor(), bj4Var2, i5, i5), bj4Var14, 0, 24960, 109566);
                c2 = 0;
                c = 2;
                i5 = i5;
                aVar5 = aVar5;
                bj4Var2 = bj4Var14;
            }
            aVar6 = aVar5;
            z = i5;
            bj4Var2.U(z);
            bj4Var2.K(-852346650);
            zIsEmpty = expandedTeamPresenceState.getSocialAccounts().isEmpty();
            bVar = di.a.k;
            if (!zIsEmpty) {
                b47.b(bj4Var2, ir9.d(aVar6, 12.0f));
                ny8VarA2 = ly8.a(new c30.h(8.0f, true, new b30(aVar4)), bVar, bj4Var2, 54);
                iHashCode3 = Long.hashCode(bj4Var2.T);
                kw7VarP3 = bj4Var2.P();
                ox6VarC3 = it1.c(bj4Var2, aVar6);
                bt1.c.getClass();
                aVar9 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var2.q();
                if (bj4Var2.S) {
                    bj4Var2.k(aVar9);
                } else {
                    bj4Var2.z();
                }
                rd7.d(bj4Var2, bt1.a.f, ny8VarA2);
                rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                rd7.c(bj4Var2, bt1.a.h);
                rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                bj4Var2.K(-457726390);
                while (r16.hasNext()) {
                    if (xj5.a(socialAccount.getProvider(), "twitter")) {
                        es7 es7VarA2 = is7.a(R.drawable.intercom_twitter, bj4Var2, z ? 1 : 0);
                        String provider2 = socialAccount.getProvider();
                        long jM752getActionContrastWhite0d7_KjU2 = IntercomTheme.INSTANCE.getColors(bj4Var2, IntercomTheme.$stable).m752getActionContrastWhite0d7_KjU();
                        ox6 ox6VarJ2 = ir9.j(aVar6, 16.0f);
                        bj4Var2.K(-144020278);
                        objF = bj4Var2.f();
                        obj = jt1.a.a;
                        if (objF == obj) {
                            obj2 = objF;
                            Object i27Var2 = new i27();
                            bj4Var2.C(i27Var2);
                            obj2 = i27Var2;
                        }
                        obj2 = objF;
                        h27 h27Var2 = (h27) obj2;
                        bj4Var2.U(z);
                        bj4Var2.K(-144016142);
                        context2 = context;
                        zJ = bj4Var2.J(socialAccount) | bj4Var2.j(context2);
                        Object objF3 = bj4Var2.f();
                        obj3 = objF3;
                        if (zJ) {
                            Object obj5 = new mh4() { // from class: kq3
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout$lambda$9$lambda$5$lambda$4$lambda$3$lambda$2(socialAccount, context2);
                                }
                            };
                            bj4Var2.C(obj5);
                            obj3 = obj5;
                        } else {
                            Object obj6 = new mh4() { // from class: kq3
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout$lambda$9$lambda$5$lambda$4$lambda$3$lambda$2(socialAccount, context2);
                                }
                            };
                            bj4Var2.C(obj6);
                            obj3 = obj6;
                        }
                        bj4Var2.U(z);
                        m65.b(es7VarA2, provider2, we1.b(ox6VarJ2, h27Var2, null, false, null, (mh4) obj3, 28), jM752getActionContrastWhite0d7_KjU2, bj4Var2, 8, 0);
                    } else {
                        context2 = context;
                    }
                    context = context2;
                }
                bj4Var2.U(z);
                bj4Var2.U(true);
            }
            bj4Var2.U(z);
            bj4Var2.K(-852298704);
            bj4Var3 = bj4Var2;
            while (r27.hasNext()) {
                b47.b(bj4Var3, ir9.d(aVar6, f));
                ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var3, 54);
                iHashCode2 = Long.hashCode(bj4Var3.T);
                kw7VarP2 = bj4Var3.P();
                ox6VarC2 = it1.c(bj4Var3, aVar6);
                bt1.c.getClass();
                aVar7 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var3.q();
                if (bj4Var3.S) {
                    bj4Var3.k(aVar7);
                } else {
                    bj4Var3.z();
                }
                rd7.d(bj4Var3, bt1.a.f, ny8VarA);
                rd7.d(bj4Var3, bt1.a.e, kw7VarP2);
                rd7.d(bj4Var3, bt1.a.g, Integer.valueOf(iHashCode2));
                rd7.c(bj4Var3, bt1.a.h);
                rd7.d(bj4Var3, bt1.a.d, ox6VarC2);
                bj4Var3.K(-143995125);
                if (footer.getAvatarDetails() != null) {
                    List<Avatar.Builder> avatars2 = footer.getAvatarDetails().getAvatars();
                    arrayList = new ArrayList(ph1.n(avatars2, 10));
                    it2 = avatars2.iterator();
                    while (it2.hasNext()) {
                        Avatar avatarBuild2 = ((Avatar.Builder) it2.next()).build();
                        avatarBuild2.getClass();
                        arrayList.add(new AvatarWrapper(avatarBuild2, z, 2, null));
                    }
                    ox6.a aVar12 = aVar6;
                    AvatarGroupKt.m19AvatarGroupJ8mCjc(arrayList, aVar12, 20.0f, 0L, bj4Var3, 432, 8);
                    aVar8 = aVar12;
                } else {
                    aVar8 = aVar6;
                }
                bj4Var3.U(z);
                bj4 bj4Var15 = bj4Var3;
                mia.b(footer.getText(), null, 0L, 0L, null, 0L, new vaa(3), 0L, 2, false, 2, 0, null, getTextStyleFor(footer.getStyle(), footer.getColor(), bj4Var3, z ? 1 : 0, z ? 1 : 0), bj4Var15, 0, 24960, 109566);
                bj4 bj4Var16 = bj4Var15;
                bj4Var16.U(true);
                f = f;
                bVar = bVar;
                aVar6 = aVar8;
                bj4Var3 = bj4Var16;
            }
            bj4Var3.U(z);
            bj4Var3.U(true);
            ox6Var2 = ox6Var4;
            bj4Var6 = bj4Var3;
        } else {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var3 = aVar;
            } else {
                ox6Var3 = ox6Var2;
            }
            Context context5 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            c30.k kVar3 = c30.c;
            aVar2 = di.a.n;
            aj1VarA = yi1.a(kVar3, aVar2, bj4VarO, 48);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var3);
            bt1.c.getClass();
            aVar3 = bt1.a.b;
            context = context5;
            if (j1bVar == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar3);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, aj1VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            i4 = WhenMappings.$EnumSwitchMapping$0[expandedTeamPresenceState.getAvatarType().ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    ox6Var4 = ox6Var3;
                    aVar4 = aVar2;
                    i5 = 0;
                    bj4VarO.K(-654655587);
                    if (expandedTeamPresenceState.getAvatars().size() == 1) {
                        bj4VarO.K(-654606390);
                        AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, AvatarSize), expandedTeamPresenceState.getAvatars().get(0), null, expandedTeamPresenceState.getDisplayActiveIndicator(), cka.b(24), null, bj4VarO, 24582, 36);
                        bj4 bj4Var17 = bj4VarO;
                        bj4Var17.U(false);
                        aVar10 = aVar;
                        bj4Var4 = bj4Var17;
                    } else {
                        bj4VarO.K(-654265855);
                        aVar10 = aVar;
                        AvatarGroupKt.m19AvatarGroupJ8mCjc(expandedTeamPresenceState.getAvatars(), aVar10, AvatarSize, cka.b(24), bj4VarO, 3504, 0);
                        bj4VarO.U(false);
                        bj4Var4 = bj4VarO;
                    }
                    bj4Var4.U(false);
                    g2b g2bVar9 = g2b.a;
                    aVar5 = aVar10;
                    bj4Var5 = bj4Var4;
                } else if (i4 == 3) {
                    bj4VarO.K(-653933318);
                    aVar4 = aVar2;
                    ox6Var4 = ox6Var3;
                    i5 = 0;
                    AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, AvatarSize), expandedTeamPresenceState.getAvatars().get(0), null, expandedTeamPresenceState.getDisplayActiveIndicator(), cka.b(24), new uh1(uh1.j), bj4VarO, 221190, 4);
                    bj4 bj4Var18 = bj4VarO;
                    bj4Var18.U(false);
                    g2b g2bVar10 = g2b.a;
                    aVar5 = aVar;
                    bj4Var5 = bj4Var18;
                } else {
                    if (i4 != 4) {
                        bj4VarO.K(-852429191);
                        bj4VarO.U(false);
                        u.b();
                        return;
                    }
                    bj4VarO.K(-653494885);
                    bj4VarO.U(false);
                    g2b g2bVar11 = g2b.a;
                    context = context;
                    j1bVar = j1bVar;
                    ox6Var4 = ox6Var3;
                    aVar4 = aVar2;
                    c = 2;
                    aVar5 = aVar;
                    i5 = 0;
                    bj4Var = bj4VarO;
                }
                c = 2;
                bj4Var = bj4Var5;
            } else {
                context = context;
                j1bVar = j1bVar;
                ox6Var4 = ox6Var3;
                aVar4 = aVar2;
                i5 = 0;
                bj4VarO.K(-655467756);
                Avatar avatar3 = ((AvatarWrapper) th1.y(expandedTeamPresenceState.getAvatars())).getAvatar();
                if (expandedTeamPresenceState.getAvatars().size() >= 3) {
                    c = 2;
                    js7Var = new js7(expandedTeamPresenceState.getAvatars().get(1).getAvatar(), expandedTeamPresenceState.getAvatars().get(2).getAvatar());
                } else {
                    c = 2;
                    if (expandedTeamPresenceState.getAvatars().size() == 2) {
                        js7Var = new js7(expandedTeamPresenceState.getAvatars().get(1).getAvatar(), null);
                    } else {
                        js7Var = new js7(null, null);
                    }
                }
                aVar5 = aVar;
                BotAndHumansFacePileKt.m21BotAndHumansFacePilehGBTI10(aVar5, avatar3, js7Var, AvatarSize, null, bj4VarO, 3078, 16);
                bj4VarO.U(false);
                g2b g2bVar12 = g2b.a;
                bj4Var = bj4VarO;
            }
            c2 = 0;
            b47.b(bj4Var, ir9.d(aVar5, 12.0f));
            bj4Var.K(-852359896);
            it = expandedTeamPresenceState.getBody().iterator();
            bj4Var2 = bj4Var;
            while (true) {
                f = 4.0f;
                if (!it.hasNext()) {
                    break;
                    break;
                }
                Header.Expanded.Body body3 = (Header.Expanded.Body) it.next();
                b47.b(bj4Var2, ir9.d(aVar5, 4.0f));
                bj4 bj4Var19 = bj4Var2;
                mia.b(body3.getText(), null, 0L, 0L, null, 0L, new vaa(3), 0L, 2, false, 2, 0, null, getTextStyleFor(body3.getStyle(), body3.getColor(), bj4Var2, i5, i5), bj4Var19, 0, 24960, 109566);
                c2 = 0;
                c = 2;
                i5 = i5;
                aVar5 = aVar5;
                bj4Var2 = bj4Var19;
            }
            aVar6 = aVar5;
            z = i5;
            bj4Var2.U(z);
            bj4Var2.K(-852346650);
            zIsEmpty = expandedTeamPresenceState.getSocialAccounts().isEmpty();
            bVar = di.a.k;
            if (!zIsEmpty) {
                b47.b(bj4Var2, ir9.d(aVar6, 12.0f));
                ny8VarA2 = ly8.a(new c30.h(8.0f, true, new b30(aVar4)), bVar, bj4Var2, 54);
                iHashCode3 = Long.hashCode(bj4Var2.T);
                kw7VarP3 = bj4Var2.P();
                ox6VarC3 = it1.c(bj4Var2, aVar6);
                bt1.c.getClass();
                aVar9 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var2.q();
                if (bj4Var2.S) {
                    bj4Var2.k(aVar9);
                } else {
                    bj4Var2.z();
                }
                rd7.d(bj4Var2, bt1.a.f, ny8VarA2);
                rd7.d(bj4Var2, bt1.a.e, kw7VarP3);
                rd7.d(bj4Var2, bt1.a.g, Integer.valueOf(iHashCode3));
                rd7.c(bj4Var2, bt1.a.h);
                rd7.d(bj4Var2, bt1.a.d, ox6VarC3);
                bj4Var2.K(-457726390);
                while (r16.hasNext()) {
                    if (xj5.a(socialAccount.getProvider(), "twitter")) {
                        es7 es7VarA3 = is7.a(R.drawable.intercom_twitter, bj4Var2, z ? 1 : 0);
                        String provider3 = socialAccount.getProvider();
                        long jM752getActionContrastWhite0d7_KjU3 = IntercomTheme.INSTANCE.getColors(bj4Var2, IntercomTheme.$stable).m752getActionContrastWhite0d7_KjU();
                        ox6 ox6VarJ3 = ir9.j(aVar6, 16.0f);
                        bj4Var2.K(-144020278);
                        objF = bj4Var2.f();
                        obj = jt1.a.a;
                        if (objF == obj) {
                            obj2 = objF;
                            Object i27Var3 = new i27();
                            bj4Var2.C(i27Var3);
                            obj2 = i27Var3;
                        }
                        obj2 = objF;
                        h27 h27Var3 = (h27) obj2;
                        bj4Var2.U(z);
                        bj4Var2.K(-144016142);
                        context2 = context;
                        zJ = bj4Var2.J(socialAccount) | bj4Var2.j(context2);
                        Object objF4 = bj4Var2.f();
                        obj3 = objF4;
                        if (zJ) {
                            Object obj7 = new mh4() { // from class: kq3
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout$lambda$9$lambda$5$lambda$4$lambda$3$lambda$2(socialAccount, context2);
                                }
                            };
                            bj4Var2.C(obj7);
                            obj3 = obj7;
                        } else {
                            Object obj8 = new mh4() { // from class: kq3
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout$lambda$9$lambda$5$lambda$4$lambda$3$lambda$2(socialAccount, context2);
                                }
                            };
                            bj4Var2.C(obj8);
                            obj3 = obj8;
                        }
                        bj4Var2.U(z);
                        m65.b(es7VarA3, provider3, we1.b(ox6VarJ3, h27Var3, null, false, null, (mh4) obj3, 28), jM752getActionContrastWhite0d7_KjU3, bj4Var2, 8, 0);
                    } else {
                        context2 = context;
                    }
                    context = context2;
                }
                bj4Var2.U(z);
                bj4Var2.U(true);
            }
            bj4Var2.U(z);
            bj4Var2.K(-852298704);
            bj4Var3 = bj4Var2;
            while (r27.hasNext()) {
                b47.b(bj4Var3, ir9.d(aVar6, f));
                ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), bVar, bj4Var3, 54);
                iHashCode2 = Long.hashCode(bj4Var3.T);
                kw7VarP2 = bj4Var3.P();
                ox6VarC2 = it1.c(bj4Var3, aVar6);
                bt1.c.getClass();
                aVar7 = bt1.a.b;
                if (j1bVar == null) {
                    ml5.c();
                    throw null;
                }
                bj4Var3.q();
                if (bj4Var3.S) {
                    bj4Var3.k(aVar7);
                } else {
                    bj4Var3.z();
                }
                rd7.d(bj4Var3, bt1.a.f, ny8VarA);
                rd7.d(bj4Var3, bt1.a.e, kw7VarP2);
                rd7.d(bj4Var3, bt1.a.g, Integer.valueOf(iHashCode2));
                rd7.c(bj4Var3, bt1.a.h);
                rd7.d(bj4Var3, bt1.a.d, ox6VarC2);
                bj4Var3.K(-143995125);
                if (footer.getAvatarDetails() != null) {
                    List<Avatar.Builder> avatars3 = footer.getAvatarDetails().getAvatars();
                    arrayList = new ArrayList(ph1.n(avatars3, 10));
                    it2 = avatars3.iterator();
                    while (it2.hasNext()) {
                        Avatar avatarBuild3 = ((Avatar.Builder) it2.next()).build();
                        avatarBuild3.getClass();
                        arrayList.add(new AvatarWrapper(avatarBuild3, z, 2, null));
                    }
                    ox6.a aVar13 = aVar6;
                    AvatarGroupKt.m19AvatarGroupJ8mCjc(arrayList, aVar13, 20.0f, 0L, bj4Var3, 432, 8);
                    aVar8 = aVar13;
                } else {
                    aVar8 = aVar6;
                }
                bj4Var3.U(z);
                bj4 bj4Var110 = bj4Var3;
                mia.b(footer.getText(), null, 0L, 0L, null, 0L, new vaa(3), 0L, 2, false, 2, 0, null, getTextStyleFor(footer.getStyle(), footer.getColor(), bj4Var3, z ? 1 : 0, z ? 1 : 0), bj4Var110, 0, 24960, 109566);
                bj4 bj4Var111 = bj4Var110;
                bj4Var111.U(true);
                f = f;
                bVar = bVar;
                aVar6 = aVar8;
                bj4Var3 = bj4Var111;
            }
            bj4Var3.U(z);
            bj4Var3.U(true);
            ox6Var2 = ox6Var4;
            bj4Var6 = bj4Var3;
        }
        xj8VarW = bj4Var6.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: lq3
                @Override // defpackage.ci4
                public final Object invoke(Object obj9, Object obj10) {
                    int iIntValue = ((Integer) obj10).intValue();
                    return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout$lambda$10(expandedTeamPresenceState, ox6Var2, i, i2, (jt1) obj9, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ExpandedTeamPresenceLayout$lambda$10(ExpandedTeamPresenceState expandedTeamPresenceState, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        ExpandedTeamPresenceLayout(expandedTeamPresenceState, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ExpandedTeamPresenceLayout$lambda$9$lambda$5$lambda$4$lambda$3$lambda$2(Header.Expanded.SocialAccount socialAccount, Context context) {
        LinkOpener.handleUrl(socialAccount.getProfileUrl(), context, Injector.get().getApi());
        return g2b.a;
    }

    @IntercomPreviews
    private static final void ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1042616954);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m228getLambda6$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new mq3(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin$lambda$13(int i, jt1 jt1Var, int i2) {
        ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void ExpandedTeamPresenceLayoutPreviewWithFin(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(467453596);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m224getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new nq3(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ExpandedTeamPresenceLayoutPreviewWithFin$lambda$11(int i, jt1 jt1Var, int i2) {
        ExpandedTeamPresenceLayoutPreviewWithFin(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    private static final void ExpandedTeamPresenceLayoutPreviewWithFinAndHumans(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(278476299);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m226getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new kg0(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ExpandedTeamPresenceLayoutPreviewWithFinAndHumans$lambda$12(int i, jt1 jt1Var, int i2) {
        ExpandedTeamPresenceLayoutPreviewWithFinAndHumans(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final wja getTextStyleFor(Header.Expanded.Style style, String str, jt1 jt1Var, int i, int i2) {
        wja type03;
        uh1 uh1Var;
        jt1Var.K(33871301);
        String str2 = (i2 & 2) != 0 ? null : str;
        int i3 = WhenMappings.$EnumSwitchMapping$1[style.ordinal()];
        if (i3 == 1) {
            jt1Var.K(1720557014);
            type03 = IntercomTheme.INSTANCE.getTypography(jt1Var, IntercomTheme.$stable).getType03();
            jt1Var.B();
        } else if (i3 == 2) {
            jt1Var.K(1720559895);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i4 = IntercomTheme.$stable;
            wja type04 = intercomTheme.getTypography(jt1Var, i4).getType04();
            uh1Var = str2 != null ? new uh1(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, null)) : null;
            type03 = wja.a(type04, uh1Var == null ? intercomTheme.getColors(jt1Var, i4).getText().m827getMuted0d7_KjU() : uh1Var.a, 0L, null, null, 0L, 0L, null, null, 16777214);
            jt1Var.B();
        } else if (i3 == 3) {
            jt1Var.K(1720565689);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i5 = IntercomTheme.$stable;
            wja type01 = intercomTheme2.getTypography(jt1Var, i5).getType01();
            uh1Var = str2 != null ? new uh1(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, null)) : null;
            type03 = wja.a(type01, uh1Var == null ? ah5.a(intercomTheme2, jt1Var, i5) : uh1Var.a, 0L, null, null, 0L, 0L, null, null, 16777214);
            jt1Var.B();
        } else if (i3 != 4) {
            jt1Var.K(1720576214);
            type03 = IntercomTheme.INSTANCE.getTypography(jt1Var, IntercomTheme.$stable).getType04();
            jt1Var.B();
        } else {
            jt1Var.K(1720571639);
            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
            int i6 = IntercomTheme.$stable;
            wja type02 = intercomTheme3.getTypography(jt1Var, i6).getType01();
            uh1Var = str2 != null ? new uh1(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, null)) : null;
            type03 = wja.a(type02, uh1Var == null ? intercomTheme3.getColors(jt1Var, i6).getText().m827getMuted0d7_KjU() : uh1Var.a, 0L, null, null, 0L, 0L, null, null, 16777214);
            jt1Var.B();
        }
        jt1Var.B();
        return type03;
    }
}
