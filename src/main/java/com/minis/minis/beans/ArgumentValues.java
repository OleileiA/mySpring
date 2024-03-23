package com.minis.minis.beans;

import com.minis.beans.ArgumentValue;

import java.util.ArrayList;
import java.util.List;

public class ArgumentValues {
		private final List<com.minis.beans.ArgumentValue> argumentValueList = new ArrayList<com.minis.beans.ArgumentValue>();

		public ArgumentValues() {
		}

		public void addArgumentValue(com.minis.beans.ArgumentValue argumentValue) {
			this.argumentValueList.add(argumentValue);
		}

		public com.minis.beans.ArgumentValue getIndexedArgumentValue(int index) {
			ArgumentValue argumentValue = this.argumentValueList.get(index);
			return argumentValue;
		}

		public int getArgumentCount() {
			return (this.argumentValueList.size());
		}

		public boolean isEmpty() {
			return (this.argumentValueList.isEmpty());
		}
	}
