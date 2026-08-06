package io.intercom.android.sdk.survey.block;

import defpackage.al;
import defpackage.bka;
import defpackage.cka;
import defpackage.dka;
import defpackage.ob4;
import defpackage.qq2;
import defpackage.uh1;
import defpackage.vaa;
import defpackage.wja;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockRenderTextStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final BlockRenderTextStyle paragraphDefault;
    private final long fontSize;
    private final ob4 fontWeight;
    private final long lineHeight;
    private final uh1 linkTextColor;
    private final vaa textAlign;
    private final uh1 textColor;

    static {
        long jB = cka.b(16);
        ob4 ob4Var = ob4.u;
        paragraphDefault = new BlockRenderTextStyle(jB, ob4.y, 0L, null, null, null, 60, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BlockRenderTextStyle(long j, ob4 ob4Var, long j2, uh1 uh1Var, uh1 uh1Var2, vaa vaaVar, int i, qq2 qq2Var) {
        long j3;
        if ((i & 4) != 0) {
            dka[] dkaVarArr = bka.b;
            j3 = bka.c;
        } else {
            j3 = j2;
        }
        uh1 uh1Var3 = (i & 8) != 0 ? null : uh1Var;
        this(j, ob4Var, j3, uh1Var3, (i & 16) != 0 ? uh1Var3 : uh1Var2, (i & 32) != 0 ? null : vaaVar, null);
    }

    /* JADX INFO: renamed from: copy--ZsBm6Y$default, reason: not valid java name */
    public static /* synthetic */ BlockRenderTextStyle m414copyZsBm6Y$default(BlockRenderTextStyle blockRenderTextStyle, long j, ob4 ob4Var, long j2, uh1 uh1Var, uh1 uh1Var2, vaa vaaVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = blockRenderTextStyle.fontSize;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            ob4Var = blockRenderTextStyle.fontWeight;
        }
        ob4 ob4Var2 = ob4Var;
        if ((i & 4) != 0) {
            j2 = blockRenderTextStyle.lineHeight;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            uh1Var = blockRenderTextStyle.textColor;
        }
        return blockRenderTextStyle.m420copyZsBm6Y(j3, ob4Var2, j4, uh1Var, (i & 16) != 0 ? blockRenderTextStyle.linkTextColor : uh1Var2, (i & 32) != 0 ? blockRenderTextStyle.textAlign : vaaVar);
    }

    /* JADX INFO: renamed from: component1-XSAIIZE, reason: not valid java name */
    public final long m415component1XSAIIZE() {
        return this.fontSize;
    }

    public final ob4 component2() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: component3-XSAIIZE, reason: not valid java name */
    public final long m416component3XSAIIZE() {
        return this.lineHeight;
    }

    /* JADX INFO: renamed from: component4-QN2ZGVo, reason: not valid java name */
    public final uh1 m417component4QN2ZGVo() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component5-QN2ZGVo, reason: not valid java name */
    public final uh1 m418component5QN2ZGVo() {
        return this.linkTextColor;
    }

    /* JADX INFO: renamed from: component6-buA522U, reason: not valid java name */
    public final vaa m419component6buA522U() {
        return this.textAlign;
    }

    /* JADX INFO: renamed from: copy--ZsBm6Y, reason: not valid java name */
    public final BlockRenderTextStyle m420copyZsBm6Y(long j, ob4 ob4Var, long j2, uh1 uh1Var, uh1 uh1Var2, vaa vaaVar) {
        ob4Var.getClass();
        return new BlockRenderTextStyle(j, ob4Var, j2, uh1Var, uh1Var2, vaaVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockRenderTextStyle)) {
            return false;
        }
        BlockRenderTextStyle blockRenderTextStyle = (BlockRenderTextStyle) obj;
        return bka.a(this.fontSize, blockRenderTextStyle.fontSize) && xj5.a(this.fontWeight, blockRenderTextStyle.fontWeight) && bka.a(this.lineHeight, blockRenderTextStyle.lineHeight) && xj5.a(this.textColor, blockRenderTextStyle.textColor) && xj5.a(this.linkTextColor, blockRenderTextStyle.linkTextColor) && xj5.a(this.textAlign, blockRenderTextStyle.textAlign);
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m421getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    public final ob4 getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m422getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    /* JADX INFO: renamed from: getLinkTextColor-QN2ZGVo, reason: not valid java name */
    public final uh1 m423getLinkTextColorQN2ZGVo() {
        return this.linkTextColor;
    }

    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final vaa m424getTextAlignbuA522U() {
        return this.textAlign;
    }

    /* JADX INFO: renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
    public final uh1 m425getTextColorQN2ZGVo() {
        return this.textColor;
    }

    public int hashCode() {
        long j = this.fontSize;
        dka[] dkaVarArr = bka.b;
        int iC = al.c(this.lineHeight, ((Long.hashCode(j) * 31) + this.fontWeight.t) * 31, 31);
        uh1 uh1Var = this.textColor;
        int iHashCode = (iC + (uh1Var == null ? 0 : Long.hashCode(uh1Var.a))) * 31;
        uh1 uh1Var2 = this.linkTextColor;
        int iHashCode2 = (iHashCode + (uh1Var2 == null ? 0 : Long.hashCode(uh1Var2.a))) * 31;
        vaa vaaVar = this.textAlign;
        return iHashCode2 + (vaaVar != null ? Integer.hashCode(vaaVar.a) : 0);
    }

    public String toString() {
        return "BlockRenderTextStyle(fontSize=" + ((Object) bka.d(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", lineHeight=" + ((Object) bka.d(this.lineHeight)) + ", textColor=" + this.textColor + ", linkTextColor=" + this.linkTextColor + ", textAlign=" + this.textAlign + ')';
    }

    public final wja toTextStyle$intercom_sdk_base_release() {
        uh1 uh1Var = this.textColor;
        long j = uh1Var != null ? uh1Var.a : uh1.k;
        long j2 = this.fontSize;
        ob4 ob4Var = this.fontWeight;
        long j3 = this.lineHeight;
        vaa vaaVar = this.textAlign;
        return new wja(j, j2, ob4Var, 0L, vaaVar != null ? vaaVar.a : 5, j3, 16613368);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final BlockRenderTextStyle getParagraphDefault() {
            return BlockRenderTextStyle.paragraphDefault;
        }

        private Companion() {
        }
    }

    private BlockRenderTextStyle(long j, ob4 ob4Var, long j2, uh1 uh1Var, uh1 uh1Var2, vaa vaaVar) {
        ob4Var.getClass();
        this.fontSize = j;
        this.fontWeight = ob4Var;
        this.lineHeight = j2;
        this.textColor = uh1Var;
        this.linkTextColor = uh1Var2;
        this.textAlign = vaaVar;
    }

    public /* synthetic */ BlockRenderTextStyle(long j, ob4 ob4Var, long j2, uh1 uh1Var, uh1 uh1Var2, vaa vaaVar, qq2 qq2Var) {
        this(j, ob4Var, j2, uh1Var, uh1Var2, vaaVar);
    }
}
