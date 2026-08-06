package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.jl9;
import defpackage.qq2;
import defpackage.uh1;
import defpackage.vs0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class TypingIndicatorStyle {
    private final vs0 borderStroke;
    private final long color;
    private final jl9 shape;

    private TypingIndicatorStyle(jl9 jl9Var, vs0 vs0Var, long j) {
        jl9Var.getClass();
        this.shape = jl9Var;
        this.borderStroke = vs0Var;
        this.color = j;
    }

    /* JADX INFO: renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ TypingIndicatorStyle m291copymxwnekA$default(TypingIndicatorStyle typingIndicatorStyle, jl9 jl9Var, vs0 vs0Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            jl9Var = typingIndicatorStyle.shape;
        }
        if ((i & 2) != 0) {
            vs0Var = typingIndicatorStyle.borderStroke;
        }
        if ((i & 4) != 0) {
            j = typingIndicatorStyle.color;
        }
        return typingIndicatorStyle.m293copymxwnekA(jl9Var, vs0Var, j);
    }

    public final jl9 component1() {
        return this.shape;
    }

    public final vs0 component2() {
        return this.borderStroke;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m292component30d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: copy-mxwnekA, reason: not valid java name */
    public final TypingIndicatorStyle m293copymxwnekA(jl9 jl9Var, vs0 vs0Var, long j) {
        jl9Var.getClass();
        return new TypingIndicatorStyle(jl9Var, vs0Var, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypingIndicatorStyle)) {
            return false;
        }
        TypingIndicatorStyle typingIndicatorStyle = (TypingIndicatorStyle) obj;
        return xj5.a(this.shape, typingIndicatorStyle.shape) && xj5.a(this.borderStroke, typingIndicatorStyle.borderStroke) && uh1.c(this.color, typingIndicatorStyle.color);
    }

    public final vs0 getBorderStroke() {
        return this.borderStroke;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m294getColor0d7_KjU() {
        return this.color;
    }

    public final jl9 getShape() {
        return this.shape;
    }

    public int hashCode() {
        int iHashCode = this.shape.hashCode() * 31;
        vs0 vs0Var = this.borderStroke;
        int iHashCode2 = (iHashCode + (vs0Var == null ? 0 : vs0Var.hashCode())) * 31;
        long j = this.color;
        int i = uh1.l;
        return Long.hashCode(j) + iHashCode2;
    }

    public String toString() {
        return "TypingIndicatorStyle(shape=" + this.shape + ", borderStroke=" + this.borderStroke + ", color=" + ((Object) uh1.i(this.color)) + ')';
    }

    public /* synthetic */ TypingIndicatorStyle(jl9 jl9Var, vs0 vs0Var, long j, qq2 qq2Var) {
        this(jl9Var, vs0Var, j);
    }
}
