package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ac4;
import defpackage.aj1;
import defpackage.bj1;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c15;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.th1;
import defpackage.wja;
import defpackage.xj8;
import defpackage.yi1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AskedAboutRowKt {
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
    public static final void AskedAboutRow(ox6 ox6Var, final Part part, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        part.getClass();
        bj4 bj4VarO = jt1Var.o(1277406973);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(part) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6.a aVar = ox6.a.t;
            ox6 ox6Var3 = i4 != 0 ? aVar : ox6Var2;
            final Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            ox6 ox6VarK = eo7.k(ox6Var3, 16.0f, 0.0f, 2);
            aj1 aj1VarA = yi1.a(c30.c, di.a.m, bj4VarO, 0);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarK);
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
            String strF = nr1.f(bj4VarO, R.string.intercom_asked_about);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i5 = IntercomTheme.$stable;
            ox6 ox6Var4 = ox6Var3;
            mia.b(strF, eo7.m(new c15(di.a.n), 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, wja.a(intercomTheme.getTypography(bj4VarO, i5).getType04Point5(), ac4.b(intercomTheme, bj4VarO, i5), 0L, null, null, 0L, 0L, null, null, 16744446), bj4VarO, 0, 0, 131068);
            bj4VarO = bj4VarO;
            List<Block> blocks = part.getBlocks();
            blocks.getClass();
            final Block block = (Block) th1.A(blocks);
            bj4VarO.K(-1827597377);
            if (block != null) {
                ox6 ox6VarC2 = ir9.c(aVar, 1.0f);
                IntercomCardStyle.Style styleM577conversationCardStylePEIptTM = IntercomCardStyle.INSTANCE.m577conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, bj4VarO, IntercomCardStyle.$stable << 15, 31);
                bj4VarO.K(1374196689);
                boolean zJ = bj4VarO.j(context) | bj4VarO.j(block);
                Object objF = bj4VarO.f();
                if (zJ || objF == jt1.a.a) {
                    objF = new mh4() { // from class: i40
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return AskedAboutRowKt.AskedAboutRow$lambda$3$lambda$2$lambda$1$lambda$0(context, block);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                IntercomCardKt.IntercomCard((mh4) objF, ox6VarC2, false, styleM577conversationCardStylePEIptTM, null, gr1.b(-1866574392, new ei4<bj1, jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt$AskedAboutRow$1$1$2
                    public final void invoke(bj1 bj1Var, jt1 jt1Var2, int i6) {
                        bj1Var.getClass();
                        if ((i6 & 17) == 16 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        ox6.a aVar3 = ox6.a.t;
                        ox6 ox6VarI = eo7.i(aVar3, 16.0f);
                        Block block2 = block;
                        aj1 aj1VarA2 = yi1.a(c30.c, di.a.m, jt1Var2, 0);
                        int iHashCode2 = Long.hashCode(jt1Var2.v());
                        kw7 kw7VarY = jt1Var2.y();
                        ox6 ox6VarC3 = it1.c(jt1Var2, ox6VarI);
                        bt1.c.getClass();
                        qr5.a aVar4 = bt1.a.b;
                        if (jt1Var2.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var2.q();
                        if (jt1Var2.l()) {
                            jt1Var2.k(aVar4);
                        } else {
                            jt1Var2.z();
                        }
                        rd7.d(jt1Var2, bt1.a.f, aj1VarA2);
                        rd7.d(jt1Var2, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var2, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(jt1Var2, bt1.a.h);
                        rd7.d(jt1Var2, bt1.a.d, ox6VarC3);
                        String title = block2.getTitle();
                        title.getClass();
                        mia.b(title, eo7.i(aVar3, 8.0f), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(jt1Var2, IntercomTheme.$stable).getType04SemiBold(), jt1Var2, 48, 0, 131068);
                        jt1Var2.I();
                    }

                    @Override // defpackage.ei4
                    public /* bridge */ /* synthetic */ g2b invoke(bj1 bj1Var, jt1 jt1Var2, Integer num) {
                        invoke(bj1Var, jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
                bj4VarO = bj4VarO;
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
            ox6Var2 = ox6Var4;
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: j40
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AskedAboutRowKt.AskedAboutRow$lambda$4(ox6Var2, part, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AskedAboutRow$lambda$3$lambda$2$lambda$1$lambda$0(Context context, Block block) {
        IntercomArticleActivity.Companion companion = IntercomArticleActivity.Companion;
        String articleId = block.getArticleId();
        articleId.getClass();
        context.startActivity(companion.buildIntent(context, new IntercomArticleActivity.ArticleActivityArguments(articleId, "conversation", false, true)));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AskedAboutRow$lambda$4(ox6 ox6Var, Part part, int i, int i2, jt1 jt1Var, int i3) {
        AskedAboutRow(ox6Var, part, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void AskedAboutRowPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(97963709);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AskedAboutRowKt.INSTANCE.m213getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: k40
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AskedAboutRowKt.AskedAboutRowPreview$lambda$5(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AskedAboutRowPreview$lambda$5(int i, jt1 jt1Var, int i2) {
        AskedAboutRowPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
