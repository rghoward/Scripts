package io.intercom.android.sdk.m5.preview.util;

import android.os.ParcelFileDescriptor;
import defpackage.qq2;
import defpackage.xj5;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PdfOpenResult {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Error extends PdfOpenResult {
        public static final int $stable = 8;
        private final Exception exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Exception exc) {
            super(null);
            exc.getClass();
            this.exception = exc;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            return error.copy(exc);
        }

        public final Exception component1() {
            return this.exception;
        }

        public final Error copy(Exception exc) {
            exc.getClass();
            return new Error(exc);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && xj5.a(this.exception, ((Error) obj).exception);
        }

        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.exception + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class PasswordProtected extends PdfOpenResult {
        public static final int $stable = 0;
        public static final PasswordProtected INSTANCE = new PasswordProtected();

        private PasswordProtected() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PasswordProtected);
        }

        public int hashCode() {
            return -1303244278;
        }

        public String toString() {
            return "PasswordProtected";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Success extends PdfOpenResult {
        public static final int $stable = 8;
        private final ParcelFileDescriptor fileDescriptor;
        private final File tempFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ParcelFileDescriptor parcelFileDescriptor, File file) {
            super(null);
            parcelFileDescriptor.getClass();
            this.fileDescriptor = parcelFileDescriptor;
            this.tempFile = file;
        }

        public static /* synthetic */ Success copy$default(Success success, ParcelFileDescriptor parcelFileDescriptor, File file, int i, Object obj) {
            if ((i & 1) != 0) {
                parcelFileDescriptor = success.fileDescriptor;
            }
            if ((i & 2) != 0) {
                file = success.tempFile;
            }
            return success.copy(parcelFileDescriptor, file);
        }

        public final ParcelFileDescriptor component1() {
            return this.fileDescriptor;
        }

        public final File component2() {
            return this.tempFile;
        }

        public final Success copy(ParcelFileDescriptor parcelFileDescriptor, File file) {
            parcelFileDescriptor.getClass();
            return new Success(parcelFileDescriptor, file);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return xj5.a(this.fileDescriptor, success.fileDescriptor) && xj5.a(this.tempFile, success.tempFile);
        }

        public final ParcelFileDescriptor getFileDescriptor() {
            return this.fileDescriptor;
        }

        public final File getTempFile() {
            return this.tempFile;
        }

        public int hashCode() {
            int iHashCode = this.fileDescriptor.hashCode() * 31;
            File file = this.tempFile;
            return iHashCode + (file == null ? 0 : file.hashCode());
        }

        public String toString() {
            return "Success(fileDescriptor=" + this.fileDescriptor + ", tempFile=" + this.tempFile + ')';
        }
    }

    public /* synthetic */ PdfOpenResult(qq2 qq2Var) {
        this();
    }

    private PdfOpenResult() {
    }
}
