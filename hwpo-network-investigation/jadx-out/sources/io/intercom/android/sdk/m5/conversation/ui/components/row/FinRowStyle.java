package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.a83;
import defpackage.di;
import defpackage.go7;
import defpackage.jl9;
import defpackage.qq2;
import defpackage.uh1;
import defpackage.vs0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FinRowStyle {
    public static final int $stable = 0;
    private final BubbleStyle bubbleStyle;
    private final jl9 contentShape;
    private final di.b rowAlignment;
    private final go7 rowPadding;

    public FinRowStyle(BubbleStyle bubbleStyle, di.b bVar, go7 go7Var, jl9 jl9Var) {
        bubbleStyle.getClass();
        bVar.getClass();
        go7Var.getClass();
        jl9Var.getClass();
        this.bubbleStyle = bubbleStyle;
        this.rowAlignment = bVar;
        this.rowPadding = go7Var;
        this.contentShape = jl9Var;
    }

    public static /* synthetic */ FinRowStyle copy$default(FinRowStyle finRowStyle, BubbleStyle bubbleStyle, di.b bVar, go7 go7Var, jl9 jl9Var, int i, Object obj) {
        if ((i & 1) != 0) {
            bubbleStyle = finRowStyle.bubbleStyle;
        }
        if ((i & 2) != 0) {
            bVar = finRowStyle.rowAlignment;
        }
        if ((i & 4) != 0) {
            go7Var = finRowStyle.rowPadding;
        }
        if ((i & 8) != 0) {
            jl9Var = finRowStyle.contentShape;
        }
        return finRowStyle.copy(bubbleStyle, bVar, go7Var, jl9Var);
    }

    public final BubbleStyle component1() {
        return this.bubbleStyle;
    }

    public final di.b component2() {
        return this.rowAlignment;
    }

    public final go7 component3() {
        return this.rowPadding;
    }

    public final jl9 component4() {
        return this.contentShape;
    }

    public final FinRowStyle copy(BubbleStyle bubbleStyle, di.b bVar, go7 go7Var, jl9 jl9Var) {
        bubbleStyle.getClass();
        bVar.getClass();
        go7Var.getClass();
        jl9Var.getClass();
        return new FinRowStyle(bubbleStyle, bVar, go7Var, jl9Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinRowStyle)) {
            return false;
        }
        FinRowStyle finRowStyle = (FinRowStyle) obj;
        return xj5.a(this.bubbleStyle, finRowStyle.bubbleStyle) && xj5.a(this.rowAlignment, finRowStyle.rowAlignment) && xj5.a(this.rowPadding, finRowStyle.rowPadding) && xj5.a(this.contentShape, finRowStyle.contentShape);
    }

    public final BubbleStyle getBubbleStyle() {
        return this.bubbleStyle;
    }

    public final jl9 getContentShape() {
        return this.contentShape;
    }

    public final di.b getRowAlignment() {
        return this.rowAlignment;
    }

    public final go7 getRowPadding() {
        return this.rowPadding;
    }

    public int hashCode() {
        return this.contentShape.hashCode() + ((this.rowPadding.hashCode() + ((this.rowAlignment.hashCode() + (this.bubbleStyle.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "FinRowStyle(bubbleStyle=" + this.bubbleStyle + ", rowAlignment=" + this.rowAlignment + ", rowPadding=" + this.rowPadding + ", contentShape=" + this.contentShape + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class BubbleStyle {
        public static final int $stable = 0;
        private final vs0 borderStroke;
        private final long color;
        private final go7 padding;
        private final jl9 shape;

        private BubbleStyle(long j, go7 go7Var, jl9 jl9Var, vs0 vs0Var) {
            go7Var.getClass();
            jl9Var.getClass();
            vs0Var.getClass();
            this.color = j;
            this.padding = go7Var;
            this.shape = jl9Var;
            this.borderStroke = vs0Var;
        }

        /* JADX INFO: renamed from: copy-Iv8Zu3U$default, reason: not valid java name */
        public static /* synthetic */ BubbleStyle m280copyIv8Zu3U$default(BubbleStyle bubbleStyle, long j, go7 go7Var, jl9 jl9Var, vs0 vs0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                j = bubbleStyle.color;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                go7Var = bubbleStyle.padding;
            }
            go7 go7Var2 = go7Var;
            if ((i & 4) != 0) {
                jl9Var = bubbleStyle.shape;
            }
            jl9 jl9Var2 = jl9Var;
            if ((i & 8) != 0) {
                vs0Var = bubbleStyle.borderStroke;
            }
            return bubbleStyle.m282copyIv8Zu3U(j2, go7Var2, jl9Var2, vs0Var);
        }

        /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m281component10d7_KjU() {
            return this.color;
        }

        public final go7 component2() {
            return this.padding;
        }

        public final jl9 component3() {
            return this.shape;
        }

        public final vs0 component4() {
            return this.borderStroke;
        }

        /* JADX INFO: renamed from: copy-Iv8Zu3U, reason: not valid java name */
        public final BubbleStyle m282copyIv8Zu3U(long j, go7 go7Var, jl9 jl9Var, vs0 vs0Var) {
            go7Var.getClass();
            jl9Var.getClass();
            vs0Var.getClass();
            return new BubbleStyle(j, go7Var, jl9Var, vs0Var, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BubbleStyle)) {
                return false;
            }
            BubbleStyle bubbleStyle = (BubbleStyle) obj;
            return uh1.c(this.color, bubbleStyle.color) && xj5.a(this.padding, bubbleStyle.padding) && xj5.a(this.shape, bubbleStyle.shape) && xj5.a(this.borderStroke, bubbleStyle.borderStroke);
        }

        public final vs0 getBorderStroke() {
            return this.borderStroke;
        }

        /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
        public final long m283getColor0d7_KjU() {
            return this.color;
        }

        public final go7 getPadding() {
            return this.padding;
        }

        public final jl9 getShape() {
            return this.shape;
        }

        public int hashCode() {
            long j = this.color;
            int i = uh1.l;
            return this.borderStroke.hashCode() + ((this.shape.hashCode() + ((this.padding.hashCode() + (Long.hashCode(j) * 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BubbleStyle(color=");
            a83.b(this.color, ", padding=", sb);
            sb.append(this.padding);
            sb.append(", shape=");
            sb.append(this.shape);
            sb.append(", borderStroke=");
            sb.append(this.borderStroke);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ BubbleStyle(long j, go7 go7Var, jl9 jl9Var, vs0 vs0Var, qq2 qq2Var) {
            this(j, go7Var, jl9Var, vs0Var);
        }
    }
}
