package io.intercom.android.sdk.survey.block;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.al8;
import defpackage.b50;
import defpackage.bj4;
import defpackage.ci4;
import defpackage.eo7;
import defpackage.fda;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.jt1;
import defpackage.lg1;
import defpackage.mia;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qa4;
import defpackage.ria;
import defpackage.u7d;
import defpackage.uh1;
import defpackage.wja;
import defpackage.ww9;
import defpackage.xj8;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.block.CodeBlockKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CodeBlockKt {
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void CodeBlock(final Block block, ox6 ox6Var, oh4<? super ria, g2b> oh4Var, jt1 jt1Var, final int i, final int i2) {
        Block block2;
        int i3;
        ox6 ox6Var2;
        int i4;
        oh4<? super ria, g2b> oh4Var2;
        int i5;
        ox6 ox6Var3;
        oh4<? super ria, g2b> oh4Var3;
        bj4 bj4Var;
        final ox6 ox6Var4;
        final oh4<? super ria, g2b> oh4Var4;
        Object objF;
        xj8 xj8VarW;
        block.getClass();
        bj4 bj4VarO = jt1Var.o(-1370899294);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            block2 = block;
        } else if ((i & 6) == 0) {
            block2 = block;
            i3 = (bj4VarO.j(block2) ? 4 : 2) | i;
        } else {
            block2 = block;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) == 146 || !bj4VarO.r()) {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        bj4VarO.K(1200357345);
                        objF = bj4VarO.f();
                        if (objF == jt1.a.a) {
                            objF = new b50(1);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        oh4Var3 = (oh4) objF;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    Spanned spannedFromHtml = Html.fromHtml(block2.getText(), 0);
                    spannedFromHtml.getClass();
                    bj4Var = bj4VarO;
                    mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), gi0.c(eo7.j(16.0f, 12.0f, ox6Var3), u7d.d(4285098354L), al8.a), uh1.e, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, oh4Var3, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), 0L, 0L, null, qa4.v, 0L, 0L, null, null, 16777183), bj4Var, 384, (i3 << 15) & 29360128, 131064);
                    ox6Var4 = ox6Var3;
                    oh4Var4 = oh4Var3;
                } else {
                    bj4VarO.u();
                    bj4Var = bj4VarO;
                    ox6Var4 = ox6Var2;
                    oh4Var4 = oh4Var2;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: mg1
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            Block block3 = block;
                            oh4 oh4Var5 = oh4Var4;
                            return CodeBlockKt.CodeBlock$lambda$2(block3, ox6Var4, oh4Var5, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            oh4Var2 = oh4Var;
            if ((i3 & 147) == 146) {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    bj4VarO.K(1200357345);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new b50(1);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                Spanned spannedFromHtml2 = Html.fromHtml(block2.getText(), 0);
                spannedFromHtml2.getClass();
                bj4Var = bj4VarO;
                mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml2, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), gi0.c(eo7.j(16.0f, 12.0f, ox6Var3), u7d.d(4285098354L), al8.a), uh1.e, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, oh4Var3, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), 0L, 0L, null, qa4.v, 0L, 0L, null, null, 16777183), bj4Var, 384, (i3 << 15) & 29360128, 131064);
                ox6Var4 = ox6Var3;
                oh4Var4 = oh4Var3;
            } else {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    bj4VarO.K(1200357345);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new b50(1);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                Spanned spannedFromHtml3 = Html.fromHtml(block2.getText(), 0);
                spannedFromHtml3.getClass();
                bj4Var = bj4VarO;
                mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml3, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), gi0.c(eo7.j(16.0f, 12.0f, ox6Var3), u7d.d(4285098354L), al8.a), uh1.e, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, oh4Var3, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), 0L, 0L, null, qa4.v, 0L, 0L, null, null, 16777183), bj4Var, 384, (i3 << 15) & 29360128, 131064);
                ox6Var4 = ox6Var3;
                oh4Var4 = oh4Var3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: mg1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        Block block3 = block;
                        oh4 oh4Var5 = oh4Var4;
                        return CodeBlockKt.CodeBlock$lambda$2(block3, ox6Var4, oh4Var5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                oh4Var2 = oh4Var;
                if (bj4VarO.j(oh4Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 147) == 146) {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    bj4VarO.K(1200357345);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new b50(1);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                Spanned spannedFromHtml4 = Html.fromHtml(block2.getText(), 0);
                spannedFromHtml4.getClass();
                bj4Var = bj4VarO;
                mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml4, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), gi0.c(eo7.j(16.0f, 12.0f, ox6Var3), u7d.d(4285098354L), al8.a), uh1.e, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, oh4Var3, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), 0L, 0L, null, qa4.v, 0L, 0L, null, null, 16777183), bj4Var, 384, (i3 << 15) & 29360128, 131064);
                ox6Var4 = ox6Var3;
                oh4Var4 = oh4Var3;
            } else {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    bj4VarO.K(1200357345);
                    objF = bj4VarO.f();
                    if (objF == jt1.a.a) {
                        objF = new b50(1);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    oh4Var3 = (oh4) objF;
                } else {
                    oh4Var3 = oh4Var2;
                }
                Spanned spannedFromHtml5 = Html.fromHtml(block2.getText(), 0);
                spannedFromHtml5.getClass();
                bj4Var = bj4VarO;
                mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml5, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), gi0.c(eo7.j(16.0f, 12.0f, ox6Var3), u7d.d(4285098354L), al8.a), uh1.e, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, oh4Var3, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), 0L, 0L, null, qa4.v, 0L, 0L, null, null, 16777183), bj4Var, 384, (i3 << 15) & 29360128, 131064);
                ox6Var4 = ox6Var3;
                oh4Var4 = oh4Var3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: mg1
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        Block block3 = block;
                        oh4 oh4Var5 = oh4Var4;
                        return CodeBlockKt.CodeBlock$lambda$2(block3, ox6Var4, oh4Var5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        oh4Var2 = oh4Var;
        if ((i3 & 147) == 146) {
            if (i6 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i4 != 0) {
                bj4VarO.K(1200357345);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = new b50(1);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                oh4Var3 = (oh4) objF;
            } else {
                oh4Var3 = oh4Var2;
            }
            Spanned spannedFromHtml6 = Html.fromHtml(block2.getText(), 0);
            spannedFromHtml6.getClass();
            bj4Var = bj4VarO;
            mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml6, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), gi0.c(eo7.j(16.0f, 12.0f, ox6Var3), u7d.d(4285098354L), al8.a), uh1.e, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, oh4Var3, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), 0L, 0L, null, qa4.v, 0L, 0L, null, null, 16777183), bj4Var, 384, (i3 << 15) & 29360128, 131064);
            ox6Var4 = ox6Var3;
            oh4Var4 = oh4Var3;
        } else {
            if (i6 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i4 != 0) {
                bj4VarO.K(1200357345);
                objF = bj4VarO.f();
                if (objF == jt1.a.a) {
                    objF = new b50(1);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                oh4Var3 = (oh4) objF;
            } else {
                oh4Var3 = oh4Var2;
            }
            Spanned spannedFromHtml7 = Html.fromHtml(block2.getText(), 0);
            spannedFromHtml7.getClass();
            bj4Var = bj4VarO;
            mia.c(BlockExtensionsKt.toAnnotatedString(spannedFromHtml7, (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b), (2 & 2) != 0 ? new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, fda.c, null, 61439) : null), gi0.c(eo7.j(16.0f, 12.0f, ox6Var3), u7d.d(4285098354L), al8.a), uh1.e, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, oh4Var3, wja.a(IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04(), 0L, 0L, null, qa4.v, 0L, 0L, null, null, 16777183), bj4Var, 384, (i3 << 15) & 29360128, 131064);
            ox6Var4 = ox6Var3;
            oh4Var4 = oh4Var3;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: mg1
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    Block block3 = block;
                    oh4 oh4Var5 = oh4Var4;
                    return CodeBlockKt.CodeBlock$lambda$2(block3, ox6Var4, oh4Var5, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CodeBlock$lambda$1$lambda$0(ria riaVar) {
        riaVar.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CodeBlock$lambda$2(Block block, ox6 ox6Var, oh4 oh4Var, int i, int i2, jt1 jt1Var, int i3) {
        CodeBlock(block, ox6Var, oh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void CodeBlockPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1610207419);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CodeBlockKt.INSTANCE.m431getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new lg1(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CodeBlockPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        CodeBlockPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
