package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.e44;
import defpackage.qq2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
abstract class RowLayout {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Grid extends RowLayout {
        public static final int $stable = 0;
        private final int columns;

        public Grid(int i) {
            super(null);
            this.columns = i;
        }

        public static /* synthetic */ Grid copy$default(Grid grid, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = grid.columns;
            }
            return grid.copy(i);
        }

        public final int component1() {
            return this.columns;
        }

        public final Grid copy(int i) {
            return new Grid(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Grid) && this.columns == ((Grid) obj).columns;
        }

        public final int getColumns() {
            return this.columns;
        }

        public int hashCode() {
            return Integer.hashCode(this.columns);
        }

        public String toString() {
            return e44.a(new StringBuilder("Grid(columns="), this.columns, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SingleFullWidth extends RowLayout {
        public static final int $stable = 0;
        public static final SingleFullWidth INSTANCE = new SingleFullWidth();

        private SingleFullWidth() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SingleFullWidth);
        }

        public int hashCode() {
            return 390836826;
        }

        public String toString() {
            return "SingleFullWidth";
        }
    }

    public /* synthetic */ RowLayout(qq2 qq2Var) {
        this();
    }

    private RowLayout() {
    }
}
