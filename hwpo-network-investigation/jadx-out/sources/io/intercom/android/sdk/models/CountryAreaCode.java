package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.hf3;
import defpackage.qq2;
import defpackage.th1;
import defpackage.xj5;
import defpackage.zc6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CountryAreaCode {

    @SerializedName("areaCodes")
    private final List<String> _areaCodes;

    @SerializedName("code")
    private final String _code;

    @SerializedName("dialCode")
    private final String _dialCode;

    @SerializedName("emoji")
    private final String _emoji;

    @SerializedName("priority")
    private final Integer _priority;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final CountryAreaCode UNKNOWN = new CountryAreaCode(null, null, null, null, null, 31, null);

    public /* synthetic */ CountryAreaCode(String str, String str2, String str3, Integer num, List list, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list);
    }

    private final String component1() {
        return this._code;
    }

    private final String component2() {
        return this._dialCode;
    }

    private final String component3() {
        return this._emoji;
    }

    private final Integer component4() {
        return this._priority;
    }

    private final List<String> component5() {
        return this._areaCodes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CountryAreaCode copy$default(CountryAreaCode countryAreaCode, String str, String str2, String str3, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = countryAreaCode._code;
        }
        if ((i & 2) != 0) {
            str2 = countryAreaCode._dialCode;
        }
        if ((i & 4) != 0) {
            str3 = countryAreaCode._emoji;
        }
        if ((i & 8) != 0) {
            num = countryAreaCode._priority;
        }
        if ((i & 16) != 0) {
            list = countryAreaCode._areaCodes;
        }
        List list2 = list;
        String str4 = str3;
        return countryAreaCode.copy(str, str2, str4, num, list2);
    }

    public final CountryAreaCode copy(String str, String str2, String str3, Integer num, List<String> list) {
        return new CountryAreaCode(str, str2, str3, num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryAreaCode)) {
            return false;
        }
        CountryAreaCode countryAreaCode = (CountryAreaCode) obj;
        return xj5.a(this._code, countryAreaCode._code) && xj5.a(this._dialCode, countryAreaCode._dialCode) && xj5.a(this._emoji, countryAreaCode._emoji) && xj5.a(this._priority, countryAreaCode._priority) && xj5.a(this._areaCodes, countryAreaCode._areaCodes);
    }

    public final List<String> getAreaCodes() {
        List<String> list = this._areaCodes;
        return list != null ? th1.w(list) : hf3.t;
    }

    public final String getCode() {
        String str = this._code;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String getDialCode() {
        String str = this._dialCode;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String getEmoji() {
        String str = this._emoji;
        return str == null ? "🌎" : str;
    }

    public final int getPriority() {
        Integer num = this._priority;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int hashCode() {
        String str = this._code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this._dialCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this._emoji;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this._priority;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this._areaCodes;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CountryAreaCode(_code=");
        sb.append(this._code);
        sb.append(", _dialCode=");
        sb.append(this._dialCode);
        sb.append(", _emoji=");
        sb.append(this._emoji);
        sb.append(", _priority=");
        sb.append(this._priority);
        sb.append(", _areaCodes=");
        return zc6.a(sb, this._areaCodes, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        private Companion() {
        }
    }

    public CountryAreaCode(String str, String str2, String str3, Integer num, List<String> list) {
        this._code = str;
        this._dialCode = str2;
        this._emoji = str3;
        this._priority = num;
        this._areaCodes = list;
    }

    public CountryAreaCode() {
        this(null, null, null, null, null, 31, null);
    }
}
