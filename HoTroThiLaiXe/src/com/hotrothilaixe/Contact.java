package com.hotrothilaixe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Contact extends Activity implements OnClickListener {

	Button btn_Send;
	EditText content;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact);
		btn_Send = (Button) findViewById(R.id.btn_Send);
		content = (EditText) findViewById(R.id.content);

		btn_Send.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		Intent email = new Intent(Intent.ACTION_SEND);
		String to = "hungtd_58@vnu.edu.vn";
		String subject = "Phản hồi sản phẩm";
		String message = content.getText().toString();
		email.putExtra(Intent.EXTRA_EMAIL, new String[] { to });
		// email.putExtra(Intent.EXTRA_CC, new String[]{ to});
		// email.putExtra(Intent.EXTRA_BCC, new String[]{to});
		email.putExtra(Intent.EXTRA_SUBJECT, subject);
		email.putExtra(Intent.EXTRA_TEXT, message);

		// need this to prompts email client only
		email.setType("message/rfc822");

		startActivity(Intent.createChooser(email, "Choose an Email client :"));
		Toast.makeText(
				this,
				"Cảm ơn bạn đã đóng góp ý kiến để chúng tôi hoàn thiện sản phẩm ngày một hoàn thiện hơn!",
				Toast.LENGTH_LONG).show();
	}
}
