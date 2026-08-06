package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import defpackage.dm3;
import defpackage.f5a;
import defpackage.g2b;
import defpackage.k85;
import defpackage.n22;
import defpackage.sk0;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.blocks.lib.interfaces.ConversationRatingBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.lib.models.ConversationRating;
import io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButton;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ConversationRatingCard implements ConversationRatingBlock {
    private static final long ANIMATION_DURATION_MS = 200;
    private static final float DESELECTED_RATING_SCALE = 1.0f;
    private static final float DIALOG_HORIZONTAL_MARGIN = 16.0f;
    private static final float RATING_HORIZONTAL_PADDING = 17.0f;
    private static final float RATING_VERTICAL_PADDING = 14.0f;
    private static final float SELECTED_RATING_SCALE = 1.2f;
    private final Api api;
    private final Provider<AppConfig> appConfigProvider;
    private final String conversationId;
    private ConversationRating conversationRating;
    private LinearLayout rootLayout;
    private final View.OnClickListener ratingClickListener = new View.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iIndexOf = ConversationRatingCard.this.ratingViews.indexOf(view);
            if (iIndexOf == -1 || ConversationRatingCard.this.ratingViews.size() != ConversationRatingCard.this.conversationRating.getOptions().size()) {
                return;
            }
            ConversationRatingCard conversationRatingCard = ConversationRatingCard.this;
            conversationRatingCard.rateConversation(conversationRatingCard.conversationRating, ConversationRatingCard.this.conversationRating.getOptions().get(iIndexOf));
            ConversationRatingCard.this.updateSelectedRating();
        }
    };
    private final List<ImageView> ratingViews = new ArrayList();
    private final ColorFilter deselectedFilter = ColorUtils.newGreyscaleFilter();

    public ConversationRatingCard(Api api, String str, Provider<AppConfig> provider) {
        this.api = api;
        this.conversationId = str;
        this.appConfigProvider = provider;
    }

    private View createConversationRatingBlock(ConversationRating conversationRating, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        this.ratingViews.clear();
        this.conversationRating = conversationRating;
        this.rootLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.intercom_conversation_rating_block, viewGroup, false);
        updateViewVisibility();
        IntercomPrimaryButton intercomPrimaryButton = (IntercomPrimaryButton) this.rootLayout.findViewById(R.id.intercom_rating_tell_us_more_button);
        intercomPrimaryButton.setText(context.getString(R.string.intercom_tell_us_more));
        intercomPrimaryButton.setOnClick(new n22(0, this, context));
        setupRatingsLayout();
        updateSelectedRating();
        return this.rootLayout;
    }

    private void deselectView(ImageView imageView) {
        imageView.animate().setInterpolator(new OvershootInterpolator(0.6f)).scaleX(DESELECTED_RATING_SCALE).scaleY(DESELECTED_RATING_SCALE).setDuration(ANIMATION_DURATION_MS).start();
        imageView.setColorFilter(this.deselectedFilter);
    }

    private ConversationRatingOption findSelectedOption() {
        for (ConversationRatingOption conversationRatingOption : this.conversationRating.getOptions()) {
            if (conversationRatingOption.getIndex() == this.conversationRating.getRatingIndex().intValue()) {
                return conversationRatingOption;
            }
        }
        return null;
    }

    public static int getEmojiDrawableForUnicode(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "1f603":
                return R.drawable.intercom_reaction_happy;
            case "1f610":
                return R.drawable.intercom_reaction_neutral;
            case "1f615":
                return R.drawable.intercom_reaction_sad;
            case "1f620":
                return R.drawable.intercom_reaction_angry;
            case "1f929":
                return R.drawable.intercom_reaction_star_struck;
            default:
                return 0;
        }
    }

    private static String imageUrlForUnicode(String str) {
        return sk0.c("https://js.intercomcdn.com/images/stickers/", str, ".png");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g2b lambda$createConversationRatingBlock$0(Context context) {
        showRemarkDialog(context);
        return null;
    }

    private void loadEmojiWithFallback(Context context, final String str, final ImageView imageView) {
        String strImageUrlForUnicode = imageUrlForUnicode(str);
        k85.a aVar = new k85.a(context);
        aVar.c = strImageUrlForUnicode;
        aVar.f(imageView);
        aVar.e = new k85.b() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.5
            @Override // k85.b
            public void onError(k85 k85Var, dm3 dm3Var) {
                int emojiDrawableForUnicode = ConversationRatingCard.getEmojiDrawableForUnicode(str);
                if (emojiDrawableForUnicode != 0) {
                    imageView.setImageResource(emojiDrawableForUnicode);
                }
            }

            @Override // k85.b
            public void onCancel(k85 k85Var) {
            }

            @Override // k85.b
            public void onStart(k85 k85Var) {
            }

            @Override // k85.b
            public void onSuccess(k85 k85Var, f5a f5aVar) {
            }
        };
        IntercomCoilKt.loadIntercomImage(context, aVar.a());
    }

    private void selectView(float f, ImageView imageView) {
        imageView.animate().setInterpolator(new OvershootInterpolator(2.0f)).scaleX(f).scaleY(f).setDuration(ANIMATION_DURATION_MS).start();
        imageView.clearColorFilter();
    }

    private void setupRatingsLayout() {
        LinearLayout linearLayout = (LinearLayout) this.rootLayout.findViewById(R.id.intercom_rating_options_layout);
        Context context = this.rootLayout.getContext();
        int iDpToPx = ScreenUtils.dpToPx(RATING_VERTICAL_PADDING, context);
        int iDpToPx2 = ScreenUtils.dpToPx(RATING_HORIZONTAL_PADDING, context);
        for (int i = 0; i < this.conversationRating.getOptions().size(); i++) {
            ConversationRatingOption conversationRatingOption = this.conversationRating.getOptions().get(i);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, DESELECTED_RATING_SCALE));
            ImageView imageView = new ImageView(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.intercom_conversation_rating_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
            layoutParams.setMargins(iDpToPx2, iDpToPx, iDpToPx2, iDpToPx);
            imageView.setLayoutParams(layoutParams);
            imageView.setLongClickable(false);
            loadEmojiWithFallback(context, conversationRatingOption.getUnicode(), imageView);
            imageView.setOnClickListener(this.ratingClickListener);
            frameLayout.addView(imageView);
            linearLayout.addView(frameLayout);
            this.ratingViews.add(imageView);
        }
    }

    private void showRemarkDialog(Context context) {
        e.a aVar = new e.a(context);
        aVar.setTitle(R.string.intercom_tell_us_more);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iDpToPx = ScreenUtils.dpToPx(DIALOG_HORIZONTAL_MARGIN, context);
        layoutParams.setMargins(iDpToPx, 0, iDpToPx, 0);
        final EditText editText = new EditText(context);
        if (editText.getBackground() != null) {
            editText.getBackground().mutate().setColorFilter(this.appConfigProvider.get().getPrimaryColor(), PorterDuff.Mode.SRC_ATOP);
        }
        editText.setLayoutParams(layoutParams);
        linearLayout.addView(editText);
        aVar.setView(linearLayout);
        aVar.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String string = editText.getText().toString();
                ConversationRatingCard conversationRatingCard = ConversationRatingCard.this;
                conversationRatingCard.addRemarkToConversation(conversationRatingCard.conversationRating, string);
            }
        });
        aVar.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        final e eVarCreate = aVar.create();
        eVarCreate.show();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: io.intercom.android.sdk.blocks.ConversationRatingCard.4
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (!z || eVarCreate.getWindow() == null) {
                    return;
                }
                eVarCreate.getWindow().setSoftInputMode(5);
            }
        });
        eVarCreate.f(-1).setTextColor(this.appConfigProvider.get().getPrimaryColor());
        eVarCreate.f(-2).setTextColor(this.appConfigProvider.get().getPrimaryColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSelectedRating() {
        if (this.conversationRating.getOptions().size() != this.ratingViews.size()) {
            return;
        }
        for (int i = 0; i < this.conversationRating.getOptions().size(); i++) {
            ConversationRatingOption conversationRatingOption = this.conversationRating.getOptions().get(i);
            ImageView imageView = this.ratingViews.get(i);
            if (this.conversationRating.getRatingIndex().intValue() == -1) {
                selectView(DESELECTED_RATING_SCALE, imageView);
            } else if (this.conversationRating.getRatingIndex().equals(Integer.valueOf(conversationRatingOption.getIndex()))) {
                selectView(SELECTED_RATING_SCALE, imageView);
            } else {
                deselectView(imageView);
            }
        }
    }

    private void updateViewVisibility() {
        if (this.rootLayout == null) {
            return;
        }
        boolean z = this.conversationRating.getRatingIndex().intValue() != -1;
        boolean zIsEmpty = TextUtils.isEmpty(this.conversationRating.getRemark());
        ((TextView) this.rootLayout.findViewById(R.id.rate_your_conversation_text_view)).setVisibility(!zIsEmpty ? 8 : 0);
        ((LinearLayout) this.rootLayout.findViewById(R.id.intercom_rating_options_layout)).setVisibility(!zIsEmpty ? 8 : 0);
        ((IntercomPrimaryButton) this.rootLayout.findViewById(R.id.intercom_rating_tell_us_more_button)).setVisibility((z && zIsEmpty) ? 0 : 8);
        ((LinearLayout) this.rootLayout.findViewById(R.id.intercom_you_rated_layout)).setVisibility(zIsEmpty ? 8 : 0);
        ConversationRatingOption conversationRatingOptionFindSelectedOption = findSelectedOption();
        if (conversationRatingOptionFindSelectedOption != null) {
            ImageView imageView = (ImageView) this.rootLayout.findViewById(R.id.intercom_you_rated_image_view);
            loadEmojiWithFallback(imageView.getContext(), conversationRatingOptionFindSelectedOption.getUnicode(), imageView);
        }
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.ConversationRatingBlock
    public View addConversationRatingBlock(ConversationRating conversationRating, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        return createConversationRatingBlock(conversationRating, viewGroup);
    }

    public void addRemarkToConversation(ConversationRating conversationRating, String str) {
        if (TextUtils.isEmpty(conversationRating.getRemark())) {
            conversationRating.setRemark(str);
            this.api.addConversationRatingRemark(this.conversationId, str);
            updateViewVisibility();
        }
    }

    public void rateConversation(ConversationRating conversationRating, ConversationRatingOption conversationRatingOption) {
        if (conversationRating.getRatingIndex().equals(Integer.valueOf(conversationRatingOption.getIndex()))) {
            return;
        }
        conversationRating.setRatingIndex(conversationRatingOption.getIndex());
        this.api.rateConversation(this.conversationId, conversationRatingOption.getIndex());
        updateViewVisibility();
    }
}
