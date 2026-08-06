package io.intercom.android.sdk.survey;

import defpackage.hf3;
import defpackage.js7;
import defpackage.qq2;
import defpackage.xj5;
import defpackage.zc6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ValidationError {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NoValidationError extends ValidationError {
        public static final int $stable = 0;
        public static final NoValidationError INSTANCE = new NoValidationError();

        private NoValidationError() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Unchecked extends ValidationError {
        public static final int $stable = 0;
        public static final Unchecked INSTANCE = new Unchecked();

        private Unchecked() {
            super(null);
        }
    }

    public /* synthetic */ ValidationError(qq2 qq2Var) {
        this();
    }

    private ValidationError() {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ValidationStringError extends ValidationError {
        public static final int $stable = 8;
        private final List<js7<String, String>> params;
        private final int stringRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationStringError(int i, List<js7<String, String>> list) {
            super(null);
            list.getClass();
            this.stringRes = i;
            this.params = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidationStringError copy$default(ValidationStringError validationStringError, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = validationStringError.stringRes;
            }
            if ((i2 & 2) != 0) {
                list = validationStringError.params;
            }
            return validationStringError.copy(i, list);
        }

        public final int component1() {
            return this.stringRes;
        }

        public final List<js7<String, String>> component2() {
            return this.params;
        }

        public final ValidationStringError copy(int i, List<js7<String, String>> list) {
            list.getClass();
            return new ValidationStringError(i, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationStringError)) {
                return false;
            }
            ValidationStringError validationStringError = (ValidationStringError) obj;
            return this.stringRes == validationStringError.stringRes && xj5.a(this.params, validationStringError.params);
        }

        public final List<js7<String, String>> getParams() {
            return this.params;
        }

        public final int getStringRes() {
            return this.stringRes;
        }

        public int hashCode() {
            return this.params.hashCode() + (Integer.hashCode(this.stringRes) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ValidationStringError(stringRes=");
            sb.append(this.stringRes);
            sb.append(", params=");
            return zc6.a(sb, this.params, ')');
        }

        public /* synthetic */ ValidationStringError(int i, List list, int i2, qq2 qq2Var) {
            this(i, (i2 & 2) != 0 ? hf3.t : list);
        }
    }
}
