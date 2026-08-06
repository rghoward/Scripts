package io.intercom.android.sdk.m5.preview.ui;

import android.graphics.Bitmap;
import defpackage.qq2;
import defpackage.xj5;
import defpackage.zc6;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PdfLoadState {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Error extends PdfLoadState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public int hashCode() {
            return 692191477;
        }

        public String toString() {
            return "Error";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Loading extends PdfLoadState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return 1291716841;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Success extends PdfLoadState {
        public static final int $stable = 8;
        private final List<Bitmap> bitmaps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(List<Bitmap> list) {
            super(null);
            list.getClass();
            this.bitmaps = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = success.bitmaps;
            }
            return success.copy(list);
        }

        public final List<Bitmap> component1() {
            return this.bitmaps;
        }

        public final Success copy(List<Bitmap> list) {
            list.getClass();
            return new Success(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && xj5.a(this.bitmaps, ((Success) obj).bitmaps);
        }

        public final List<Bitmap> getBitmaps() {
            return this.bitmaps;
        }

        public int hashCode() {
            return this.bitmaps.hashCode();
        }

        public String toString() {
            return zc6.a(new StringBuilder("Success(bitmaps="), this.bitmaps, ')');
        }
    }

    public /* synthetic */ PdfLoadState(qq2 qq2Var) {
        this();
    }

    private PdfLoadState() {
    }
}
