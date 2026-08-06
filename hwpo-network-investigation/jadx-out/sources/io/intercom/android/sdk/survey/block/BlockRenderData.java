package io.intercom.android.sdk.survey.block;

import defpackage.cka;
import defpackage.ob4;
import defpackage.qq2;
import defpackage.uh1;
import defpackage.xj5;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockRenderData {
    public static final int $stable = 8;
    private final Block block;
    private final BlockRenderTextStyle headingTextStyle;
    private final BlockRenderTextStyle paragraphTextStyle;
    private final BlockRenderTextStyle subHeadingTextStyle;
    private final uh1 textColor;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.HEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BlockRenderData(Block block, uh1 uh1Var, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, int i, qq2 qq2Var) {
        BlockRenderTextStyle blockRenderTextStyle4;
        BlockRenderTextStyle blockRenderTextStyle5;
        uh1 uh1Var2 = (i & 2) != 0 ? null : uh1Var;
        if ((i & 4) != 0) {
            long jB = cka.b(48);
            ob4 ob4Var = ob4.u;
            blockRenderTextStyle4 = new BlockRenderTextStyle(jB, ob4.B, cka.b(56), null, null, null, 56, null);
        } else {
            blockRenderTextStyle4 = blockRenderTextStyle;
        }
        if ((i & 8) != 0) {
            long jB2 = cka.b(36);
            ob4 ob4Var2 = ob4.u;
            blockRenderTextStyle5 = new BlockRenderTextStyle(jB2, ob4.A, cka.b(44), null, null, null, 56, null);
        } else {
            blockRenderTextStyle5 = blockRenderTextStyle2;
        }
        this(block, uh1Var2, blockRenderTextStyle4, blockRenderTextStyle5, (i & 16) != 0 ? BlockRenderTextStyle.Companion.getParagraphDefault() : blockRenderTextStyle3, null);
    }

    /* JADX INFO: renamed from: copy-ZLcQsz0$default, reason: not valid java name */
    public static /* synthetic */ BlockRenderData m410copyZLcQsz0$default(BlockRenderData blockRenderData, Block block, uh1 uh1Var, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, int i, Object obj) {
        if ((i & 1) != 0) {
            block = blockRenderData.block;
        }
        if ((i & 2) != 0) {
            uh1Var = blockRenderData.textColor;
        }
        if ((i & 4) != 0) {
            blockRenderTextStyle = blockRenderData.headingTextStyle;
        }
        if ((i & 8) != 0) {
            blockRenderTextStyle2 = blockRenderData.subHeadingTextStyle;
        }
        if ((i & 16) != 0) {
            blockRenderTextStyle3 = blockRenderData.paragraphTextStyle;
        }
        BlockRenderTextStyle blockRenderTextStyle4 = blockRenderTextStyle3;
        BlockRenderTextStyle blockRenderTextStyle5 = blockRenderTextStyle;
        return blockRenderData.m412copyZLcQsz0(block, uh1Var, blockRenderTextStyle5, blockRenderTextStyle2, blockRenderTextStyle4);
    }

    public final Block component1() {
        return this.block;
    }

    /* JADX INFO: renamed from: component2-QN2ZGVo, reason: not valid java name */
    public final uh1 m411component2QN2ZGVo() {
        return this.textColor;
    }

    public final BlockRenderTextStyle component3() {
        return this.headingTextStyle;
    }

    public final BlockRenderTextStyle component4() {
        return this.subHeadingTextStyle;
    }

    public final BlockRenderTextStyle component5() {
        return this.paragraphTextStyle;
    }

    /* JADX INFO: renamed from: copy-ZLcQsz0, reason: not valid java name */
    public final BlockRenderData m412copyZLcQsz0(Block block, uh1 uh1Var, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3) {
        block.getClass();
        blockRenderTextStyle.getClass();
        blockRenderTextStyle2.getClass();
        blockRenderTextStyle3.getClass();
        return new BlockRenderData(block, uh1Var, blockRenderTextStyle, blockRenderTextStyle2, blockRenderTextStyle3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockRenderData)) {
            return false;
        }
        BlockRenderData blockRenderData = (BlockRenderData) obj;
        return xj5.a(this.block, blockRenderData.block) && xj5.a(this.textColor, blockRenderData.textColor) && xj5.a(this.headingTextStyle, blockRenderData.headingTextStyle) && xj5.a(this.subHeadingTextStyle, blockRenderData.subHeadingTextStyle) && xj5.a(this.paragraphTextStyle, blockRenderData.paragraphTextStyle);
    }

    public final Block getBlock() {
        return this.block;
    }

    public final BlockRenderTextStyle getHeadingTextStyle() {
        return this.headingTextStyle;
    }

    public final BlockRenderTextStyle getParagraphTextStyle() {
        return this.paragraphTextStyle;
    }

    public final BlockRenderTextStyle getSubHeadingTextStyle() {
        return this.subHeadingTextStyle;
    }

    /* JADX INFO: renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
    public final uh1 m413getTextColorQN2ZGVo() {
        return this.textColor;
    }

    public final BlockRenderTextStyle getTextStyle() {
        BlockType type = this.block.getType();
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return this.headingTextStyle;
        }
        if (i != 2) {
            return i != 3 ? BlockRenderTextStyle.Companion.getParagraphDefault() : this.paragraphTextStyle;
        }
        return this.subHeadingTextStyle;
    }

    public int hashCode() {
        int iHashCode = this.block.hashCode() * 31;
        uh1 uh1Var = this.textColor;
        return this.paragraphTextStyle.hashCode() + ((this.subHeadingTextStyle.hashCode() + ((this.headingTextStyle.hashCode() + ((iHashCode + (uh1Var == null ? 0 : Long.hashCode(uh1Var.a))) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "BlockRenderData(block=" + this.block + ", textColor=" + this.textColor + ", headingTextStyle=" + this.headingTextStyle + ", subHeadingTextStyle=" + this.subHeadingTextStyle + ", paragraphTextStyle=" + this.paragraphTextStyle + ')';
    }

    private BlockRenderData(Block block, uh1 uh1Var, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3) {
        block.getClass();
        blockRenderTextStyle.getClass();
        blockRenderTextStyle2.getClass();
        blockRenderTextStyle3.getClass();
        this.block = block;
        this.textColor = uh1Var;
        this.headingTextStyle = blockRenderTextStyle;
        this.subHeadingTextStyle = blockRenderTextStyle2;
        this.paragraphTextStyle = blockRenderTextStyle3;
    }

    public /* synthetic */ BlockRenderData(Block block, uh1 uh1Var, BlockRenderTextStyle blockRenderTextStyle, BlockRenderTextStyle blockRenderTextStyle2, BlockRenderTextStyle blockRenderTextStyle3, qq2 qq2Var) {
        this(block, uh1Var, blockRenderTextStyle, blockRenderTextStyle2, blockRenderTextStyle3);
    }
}
