package io.intercom.android.sdk.ui.common;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.hf3;
import defpackage.js7;
import defpackage.jt1;
import defpackage.qq2;
import defpackage.u;
import defpackage.wu0;
import defpackage.xj5;
import defpackage.zc6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class StringProvider {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class ActualString extends StringProvider {
        public static final int $stable = 0;
        private final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActualString(String str) {
            super(null);
            str.getClass();
            this.string = str;
        }

        public static /* synthetic */ ActualString copy$default(ActualString actualString, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actualString.string;
            }
            return actualString.copy(str);
        }

        public final String component1() {
            return this.string;
        }

        public final ActualString copy(String str) {
            str.getClass();
            return new ActualString(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActualString) && xj5.a(this.string, ((ActualString) obj).string);
        }

        public final String getString() {
            return this.string;
        }

        public int hashCode() {
            return this.string.hashCode();
        }

        public String toString() {
            return wu0.a(new StringBuilder("ActualString(string="), this.string, ')');
        }
    }

    public /* synthetic */ StringProvider(qq2 qq2Var) {
        this();
    }

    public final String getText(jt1 jt1Var, int i) {
        String string;
        jt1Var.K(-1160503525);
        if (this instanceof ActualString) {
            string = ((ActualString) this).getString();
        } else {
            if (!(this instanceof StringRes)) {
                u.b();
                return null;
            }
            StringRes stringRes = (StringRes) this;
            string = ActualStringOrResKt.parseString((Context) jt1Var.F(AndroidCompositionLocals_androidKt.b), stringRes.getStringRes(), stringRes.getParams());
        }
        jt1Var.B();
        return string;
    }

    private StringProvider() {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class StringRes extends StringProvider {
        public static final int $stable = 8;
        private final List<js7<String, String>> params;
        private final int stringRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringRes(int i, List<js7<String, String>> list) {
            super(null);
            list.getClass();
            this.stringRes = i;
            this.params = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StringRes copy$default(StringRes stringRes, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stringRes.stringRes;
            }
            if ((i2 & 2) != 0) {
                list = stringRes.params;
            }
            return stringRes.copy(i, list);
        }

        public final int component1() {
            return this.stringRes;
        }

        public final List<js7<String, String>> component2() {
            return this.params;
        }

        public final StringRes copy(int i, List<js7<String, String>> list) {
            list.getClass();
            return new StringRes(i, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringRes)) {
                return false;
            }
            StringRes stringRes = (StringRes) obj;
            return this.stringRes == stringRes.stringRes && xj5.a(this.params, stringRes.params);
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
            StringBuilder sb = new StringBuilder("StringRes(stringRes=");
            sb.append(this.stringRes);
            sb.append(", params=");
            return zc6.a(sb, this.params, ')');
        }

        public /* synthetic */ StringRes(int i, List list, int i2, qq2 qq2Var) {
            this(i, (i2 & 2) != 0 ? hf3.t : list);
        }
    }
}
