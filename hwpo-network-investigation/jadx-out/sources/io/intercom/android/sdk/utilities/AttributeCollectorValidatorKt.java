package io.intercom.android.sdk.utilities;

import android.content.res.Resources;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AttributeCollectorValidatorKt {
    public static final String getErrorStringFromCode(Resources resources, int i) {
        resources.getClass();
        switch (i) {
            case 1:
                String string = resources.getString(R.string.intercom_string_is_incorrect);
                string.getClass();
                return string;
            case 2:
                String string2 = resources.getString(R.string.intercom_that_email_address_doesnt_look_quite_right);
                string2.getClass();
                return string2;
            case 3:
                String string3 = resources.getString(R.string.intercom_that_number_doesnt_look_quite_right);
                string3.getClass();
                return string3;
            case 4:
                String string4 = resources.getString(R.string.intercom_that_number_needs_a_prefix);
                string4.getClass();
                return string4;
            case 5:
                String string5 = resources.getString(R.string.intercom_that_number_has_too_many_digits);
                string5.getClass();
                return string5;
            case 6:
                String string6 = resources.getString(R.string.intercom_that_country_code_doesnt_look_quite_right);
                string6.getClass();
                return string6;
            case 7:
                String string7 = resources.getString(R.string.intercom_that_number_is_missing_a_few_digits);
                string7.getClass();
                return string7;
            default:
                return BuildConfig.FLAVOR;
        }
    }
}
