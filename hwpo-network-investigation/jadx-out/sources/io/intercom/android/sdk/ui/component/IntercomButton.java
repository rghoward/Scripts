package io.intercom.android.sdk.ui.component;

import defpackage.a83;
import defpackage.ah5;
import defpackage.al;
import defpackage.jt1;
import defpackage.qq2;
import defpackage.uh1;
import defpackage.vs0;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.zg5;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomButton {
    public static final int $stable = 0;
    public static final IntercomButton INSTANCE = new IntercomButton();

    private IntercomButton() {
    }

    /* JADX INFO: renamed from: outlinedStyle-Klgx-Pg, reason: not valid java name */
    public final Style m569outlinedStyleKlgxPg(long j, long j2, vs0 vs0Var, jt1 jt1Var, int i, int i2) {
        jt1Var.K(-1228695891);
        if ((i2 & 1) != 0) {
            j = zg5.a(IntercomTheme.INSTANCE, jt1Var, 6);
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = ah5.a(IntercomTheme.INSTANCE, jt1Var, 6);
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            vs0Var = ws0.b(1.0f, IntercomTheme.INSTANCE.getColors(jt1Var, 6).getBorder().m720getNeutral0d7_KjU());
        }
        Style style = new Style(j3, j4, vs0Var, null);
        jt1Var.B();
        return style;
    }

    /* JADX INFO: renamed from: primaryStyle-Klgx-Pg, reason: not valid java name */
    public final Style m570primaryStyleKlgxPg(long j, long j2, vs0 vs0Var, jt1 jt1Var, int i, int i2) {
        jt1Var.K(-155594647);
        if ((i2 & 1) != 0) {
            j = zg5.a(IntercomTheme.INSTANCE, jt1Var, 6);
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = ah5.a(IntercomTheme.INSTANCE, jt1Var, 6);
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            vs0Var = ws0.b(1.0f, IntercomTheme.INSTANCE.getColors(jt1Var, 6).getBorder().m720getNeutral0d7_KjU());
        }
        Style style = new Style(j3, j4, vs0Var, null);
        jt1Var.B();
        return style;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Style {
        public static final int $stable = 0;
        private final long backgroundColor;
        private final vs0 border;
        private final long contentColor;

        private Style(long j, long j2, vs0 vs0Var) {
            vs0Var.getClass();
            this.backgroundColor = j;
            this.contentColor = j2;
            this.border = vs0Var;
        }

        /* JADX INFO: renamed from: copy-jxsXWHM$default, reason: not valid java name */
        public static /* synthetic */ Style m571copyjxsXWHM$default(Style style, long j, long j2, vs0 vs0Var, int i, Object obj) {
            if ((i & 1) != 0) {
                j = style.backgroundColor;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = style.contentColor;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                vs0Var = style.border;
            }
            return style.m574copyjxsXWHM(j3, j4, vs0Var);
        }

        /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
        public final long m572component10d7_KjU() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
        public final long m573component20d7_KjU() {
            return this.contentColor;
        }

        public final vs0 component3() {
            return this.border;
        }

        /* JADX INFO: renamed from: copy-jxsXWHM, reason: not valid java name */
        public final Style m574copyjxsXWHM(long j, long j2, vs0 vs0Var) {
            vs0Var.getClass();
            return new Style(j, j2, vs0Var, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            return uh1.c(this.backgroundColor, style.backgroundColor) && uh1.c(this.contentColor, style.contentColor) && xj5.a(this.border, style.border);
        }

        /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
        public final long m575getBackgroundColor0d7_KjU() {
            return this.backgroundColor;
        }

        public final vs0 getBorder() {
            return this.border;
        }

        /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name */
        public final long m576getContentColor0d7_KjU() {
            return this.contentColor;
        }

        public int hashCode() {
            long j = this.backgroundColor;
            int i = uh1.l;
            return this.border.hashCode() + al.c(this.contentColor, Long.hashCode(j) * 31, 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Style(backgroundColor=");
            a83.b(this.backgroundColor, ", contentColor=", sb);
            a83.b(this.contentColor, ", border=", sb);
            sb.append(this.border);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ Style(long j, long j2, vs0 vs0Var, qq2 qq2Var) {
            this(j, j2, vs0Var);
        }
    }
}
