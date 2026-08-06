package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.TtsSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zp9 implements wk2<Long> {
    public static final Parcelable.Creator<zp9> CREATOR = new a();
    public Long t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<zp9> {
        @Override // android.os.Parcelable.Creator
        public final zp9 createFromParcel(Parcel parcel) {
            zp9 zp9Var = new zp9();
            zp9Var.t = (Long) parcel.readValue(Long.class.getClassLoader());
            return zp9Var;
        }

        @Override // android.os.Parcelable.Creator
        public final zp9[] newArray(int i) {
            return new zp9[i];
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    @Override // defpackage.wk2
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup, a21 a21Var, ok6.a aVar) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        Integer numB = g53.b(viewInflate.getContext(), R.attr.colorOnSurfaceVariant);
        if (numB != null) {
            editText.setHintTextColor(numB.intValue());
        }
        String str = Build.MANUFACTURER;
        if ((str != null ? str.toLowerCase(Locale.ENGLISH) : BuildConfig.FLAVOR).equals("lge")) {
            editText.setInputType(17);
        } else {
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : BuildConfig.FLAVOR).equals("samsung")) {
                editText.setInputType(17);
            }
        }
        AtomicReference<poa> atomicReference = f6b.a;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("[^dMy/\\-.]", BuildConfig.FLAVOR).replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", BuildConfig.FLAVOR).replaceAll("My", "M/y"), Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        Resources resources = viewInflate.getResources();
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        String strReplace = pattern.replace("d", string3).replace("M", string2).replace("y", string);
        SpannableString spannableString = new SpannableString(strReplace);
        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), 0, spannableString.length(), 33);
        textInputLayout.setPlaceholderText(spannableString);
        Long l = this.t;
        if (l != null) {
            editText.setText(simpleDateFormat.format(l));
            Editable text = editText.getText();
            if (text != null) {
                editText.setSelection(text.length());
            }
        }
        editText.addTextChangedListener(new yp9(this, strReplace, simpleDateFormat, textInputLayout, a21Var, aVar, textInputLayout));
        AccessibilityManager accessibilityManager = (AccessibilityManager) viewInflate.getContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return viewInflate;
        }
        final EditText[] editTextArr = {editText};
        editTextArr[0].setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: uk2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                for (EditText editText2 : editTextArr) {
                    if (editText2.hasFocus()) {
                        return;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
                if (inputMethodManager != null) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        });
        final EditText editText2 = editTextArr[0];
        editText2.postDelayed(new Runnable() { // from class: vk2
            @Override // java.lang.Runnable
            public final void run() {
                View view = editText2;
                view.requestFocus();
                view.post(new cz(1, view));
            }
        }, 100L);
        return viewInflate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.wk2
    public final String e(Context context) {
        Resources resources = context.getResources();
        Long l = this.t;
        return l == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, xk2.a(l.longValue()));
    }

    @Override // defpackage.wk2
    public final ArrayList i() {
        return new ArrayList();
    }

    @Override // defpackage.wk2
    public final String l(Context context) {
        Resources resources = context.getResources();
        Long l = this.t;
        return resources.getString(R.string.mtrl_picker_announce_current_selection, l == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : xk2.a(l.longValue()));
    }

    @Override // defpackage.wk2
    public final int n(Context context) {
        return bj6.d(context, gk6.class.getCanonicalName(), R.attr.materialCalendarTheme).data;
    }

    @Override // defpackage.wk2
    public final boolean r() {
        return this.t != null;
    }

    @Override // defpackage.wk2
    public final ArrayList t() {
        ArrayList arrayList = new ArrayList();
        Long l = this.t;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // defpackage.wk2
    public final Long u() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.t);
    }

    @Override // defpackage.wk2
    public final void z(long j) {
        this.t = Long.valueOf(j);
    }
}
