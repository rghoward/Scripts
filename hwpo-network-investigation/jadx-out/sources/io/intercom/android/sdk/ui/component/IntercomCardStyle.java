package io.intercom.android.sdk.ui.component;

import defpackage.a83;
import defpackage.ah5;
import defpackage.al;
import defpackage.ay8;
import defpackage.h44;
import defpackage.jl9;
import defpackage.jt1;
import defpackage.qq2;
import defpackage.uh1;
import defpackage.vs0;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.y43;
import defpackage.zg5;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomCardStyle {
    public static final int $stable = 0;
    public static final IntercomCardStyle INSTANCE = new IntercomCardStyle();

    private IntercomCardStyle() {
    }

    /* JADX INFO: renamed from: conversationCardStyle-PEIptTM, reason: not valid java name */
    public final Style m577conversationCardStylePEIptTM(jl9 jl9Var, long j, long j2, float f, vs0 vs0Var, jt1 jt1Var, int i, int i2) {
        jt1Var.K(-1707188824);
        if ((i2 & 1) != 0) {
            jl9Var = ay8.b(20.0f);
        }
        jl9 jl9Var2 = jl9Var;
        if ((i2 & 2) != 0) {
            j = zg5.a(IntercomTheme.INSTANCE, jt1Var, 6);
        }
        Style style = new Style(jl9Var2, j, (i2 & 4) != 0 ? ah5.a(IntercomTheme.INSTANCE, jt1Var, 6) : j2, (i2 & 8) != 0 ? 0.0f : f, (i2 & 16) != 0 ? ws0.b(1.0f, IntercomTheme.INSTANCE.getColors(jt1Var, 6).getBorder().m720getNeutral0d7_KjU()) : vs0Var, null, null);
        jt1Var.B();
        return style;
    }

    /* JADX INFO: renamed from: defaultStyle-qUnfpCA, reason: not valid java name */
    public final Style m578defaultStyleqUnfpCA(jl9 jl9Var, long j, long j2, float f, vs0 vs0Var, long j3, jt1 jt1Var, int i, int i2) {
        jt1Var.K(-952876659);
        if ((i2 & 1) != 0) {
            jl9Var = IntercomTheme.INSTANCE.getShapes(jt1Var, 6).c;
        }
        jl9 jl9Var2 = jl9Var;
        if ((i2 & 2) != 0) {
            j = zg5.a(IntercomTheme.INSTANCE, jt1Var, 6);
        }
        Style style = new Style(jl9Var2, j, (i2 & 4) != 0 ? ah5.a(IntercomTheme.INSTANCE, jt1Var, 6) : j2, (i2 & 8) != 0 ? 6.0f : f, (i2 & 16) != 0 ? ws0.b(1.0f, uh1.b(0.9f, IntercomTheme.INSTANCE.getColors(jt1Var, 6).getBorder().m720getNeutral0d7_KjU())) : vs0Var, new uh1((i2 & 32) != 0 ? IntercomTheme.INSTANCE.getColors(jt1Var, 6).m773getShadow0d7_KjU() : j3), null);
        jt1Var.B();
        return style;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Style {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final vs0 border;
        private final long contentColor;
        private final float elevation;
        private final uh1 shadowColor;
        private final jl9 shape;

        private Style(jl9 jl9Var, long j, long j2, float f, vs0 vs0Var, uh1 uh1Var) {
            jl9Var.getClass();
            vs0Var.getClass();
            this.shape = jl9Var;
            this.backgroundColor = j;
            this.contentColor = j2;
            this.elevation = f;
            this.border = vs0Var;
            this.shadowColor = uh1Var;
        }

        /* JADX INFO: renamed from: copy-UBuVVS8$default, reason: not valid java name */
        public static /* synthetic */ Style m579copyUBuVVS8$default(Style style, jl9 jl9Var, long j, long j2, float f, vs0 vs0Var, uh1 uh1Var, int i, Object obj) {
            if ((i & 1) != 0) {
                jl9Var = style.shape;
            }
            if ((i & 2) != 0) {
                j = style.backgroundColor;
            }
            if ((i & 4) != 0) {
                j2 = style.contentColor;
            }
            if ((i & 8) != 0) {
                f = style.elevation;
            }
            if ((i & 16) != 0) {
                vs0Var = style.border;
            }
            if ((i & 32) != 0) {
                uh1Var = style.shadowColor;
            }
            uh1 uh1Var2 = uh1Var;
            float f2 = f;
            long j3 = j2;
            return style.m584copyUBuVVS8(jl9Var, j, j3, f2, vs0Var, uh1Var2);
        }

        public final jl9 component1() {
            return this.shape;
        }

        /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
        public final long m580component20d7_KjU() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name */
        public final long m581component30d7_KjU() {
            return this.contentColor;
        }

        /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
        public final float m582component4D9Ej5fM() {
            return this.elevation;
        }

        public final vs0 component5() {
            return this.border;
        }

        /* JADX INFO: renamed from: component6-QN2ZGVo, reason: not valid java name */
        public final uh1 m583component6QN2ZGVo() {
            return this.shadowColor;
        }

        /* JADX INFO: renamed from: copy-UBuVVS8, reason: not valid java name */
        public final Style m584copyUBuVVS8(jl9 jl9Var, long j, long j2, float f, vs0 vs0Var, uh1 uh1Var) {
            jl9Var.getClass();
            vs0Var.getClass();
            return new Style(jl9Var, j, j2, f, vs0Var, uh1Var, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            return xj5.a(this.shape, style.shape) && uh1.c(this.backgroundColor, style.backgroundColor) && uh1.c(this.contentColor, style.contentColor) && y43.e(this.elevation, style.elevation) && xj5.a(this.border, style.border) && xj5.a(this.shadowColor, style.shadowColor);
        }

        /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m585getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        public final vs0 getBorder() {
            return this.border;
        }

        /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
        public final long m586getContentColor0d7_KjU() {
            return this.contentColor;
        }

        /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
        public final float m587getElevationD9Ej5fM() {
            return this.elevation;
        }

        /* JADX INFO: renamed from: getShadowColor-QN2ZGVo, reason: not valid java name */
        public final uh1 m588getShadowColorQN2ZGVo() {
            return this.shadowColor;
        }

        public final jl9 getShape() {
            return this.shape;
        }

        public int hashCode() {
            int iHashCode = this.shape.hashCode() * 31;
            long j = this.backgroundColor;
            int i = uh1.l;
            int iHashCode2 = (this.border.hashCode() + h44.a(al.c(this.contentColor, al.c(j, iHashCode, 31), 31), this.elevation, 31)) * 31;
            uh1 uh1Var = this.shadowColor;
            return iHashCode2 + (uh1Var == null ? 0 : Long.hashCode(uh1Var.a));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Style(shape=");
            sb.append(this.shape);
            sb.append(", backgroundColor=");
            a83.b(this.backgroundColor, ", contentColor=", sb);
            a83.b(this.contentColor, ", elevation=", sb);
            sb.append((Object) y43.f(this.elevation));
            sb.append(", border=");
            sb.append(this.border);
            sb.append(", shadowColor=");
            sb.append(this.shadowColor);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ Style(jl9 jl9Var, long j, long j2, float f, vs0 vs0Var, uh1 uh1Var, qq2 qq2Var) {
            this(jl9Var, j, j2, f, vs0Var, uh1Var);
        }
    }
}
