/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpoutSpec implements
		org.apache.thrift.TBase<SpoutSpec, SpoutSpec._Fields>,
		java.io.Serializable, Cloneable {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"SpoutSpec");

	private static final org.apache.thrift.protocol.TField SPOUT_OBJECT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"spout_object", org.apache.thrift.protocol.TType.STRUCT, (short) 1);
	private static final org.apache.thrift.protocol.TField COMMON_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"common", org.apache.thrift.protocol.TType.STRUCT, (short) 2);

	private ComponentObject spout_object; // required
	private ComponentCommon common; // required

	/**
	 * The set of fields this struct contains, along with convenience methods
	 * for finding and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		SPOUT_OBJECT((short) 1, "spout_object"), COMMON((short) 2, "common");

		private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

		static {
			for (_Fields field : EnumSet.allOf(_Fields.class)) {
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not
		 * found.
		 */
		public static _Fields findByThriftId(int fieldId) {
			switch (fieldId) {
			case 1: // SPOUT_OBJECT
				return SPOUT_OBJECT;
			case 2: // COMMON
				return COMMON;
			default:
				return null;
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, throwing an exception
		 * if it is not found.
		 */
		public static _Fields findByThriftIdOrThrow(int fieldId) {
			_Fields fields = findByThriftId(fieldId);
			if (fields == null)
				throw new IllegalArgumentException("Field " + fieldId
						+ " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not
		 * found.
		 */
		public static _Fields findByName(String name) {
			return byName.get(name);
		}

		private final short _thriftId;
		private final String _fieldName;

		_Fields(short thriftId, String fieldName) {
			_thriftId = thriftId;
			_fieldName = fieldName;
		}

		public short getThriftFieldId() {
			return _thriftId;
		}

		public String getFieldName() {
			return _fieldName;
		}
	}

	// isset id assignments

	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.SPOUT_OBJECT,
				new org.apache.thrift.meta_data.FieldMetaData("spout_object",
						org.apache.thrift.TFieldRequirementType.REQUIRED,
						new org.apache.thrift.meta_data.StructMetaData(
								org.apache.thrift.protocol.TType.STRUCT,
								ComponentObject.class)));
		tmpMap.put(_Fields.COMMON,
				new org.apache.thrift.meta_data.FieldMetaData("common",
						org.apache.thrift.TFieldRequirementType.REQUIRED,
						new org.apache.thrift.meta_data.StructMetaData(
								org.apache.thrift.protocol.TType.STRUCT,
								ComponentCommon.class)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(
				SpoutSpec.class, metaDataMap);
	}

	public SpoutSpec() {
	}

	public SpoutSpec(ComponentObject spout_object, ComponentCommon common) {
		this();
		this.spout_object = spout_object;
		this.common = common;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public SpoutSpec(SpoutSpec other) {
		if (other.is_set_spout_object()) {
			this.spout_object = new ComponentObject(other.spout_object);
		}
		if (other.is_set_common()) {
			this.common = new ComponentCommon(other.common);
		}
	}

	public SpoutSpec deepCopy() {
		return new SpoutSpec(this);
	}

	@Override
	public void clear() {
		this.spout_object = null;
		this.common = null;
	}

	public ComponentObject get_spout_object() {
		return this.spout_object;
	}

	public void set_spout_object(ComponentObject spout_object) {
		this.spout_object = spout_object;
	}

	public void unset_spout_object() {
		this.spout_object = null;
	}

	/**
	 * Returns true if field spout_object is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean is_set_spout_object() {
		return this.spout_object != null;
	}

	public void set_spout_object_isSet(boolean value) {
		if (!value) {
			this.spout_object = null;
		}
	}

	public ComponentCommon get_common() {
		return this.common;
	}

	public void set_common(ComponentCommon common) {
		this.common = common;
	}

	public void unset_common() {
		this.common = null;
	}

	/**
	 * Returns true if field common is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean is_set_common() {
		return this.common != null;
	}

	public void set_common_isSet(boolean value) {
		if (!value) {
			this.common = null;
		}
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case SPOUT_OBJECT:
			if (value == null) {
				unset_spout_object();
			} else {
				set_spout_object((ComponentObject) value);
			}
			break;

		case COMMON:
			if (value == null) {
				unset_common();
			} else {
				set_common((ComponentCommon) value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case SPOUT_OBJECT:
			return get_spout_object();

		case COMMON:
			return get_common();

		}
		throw new IllegalStateException();
	}

	/**
	 * Returns true if field corresponding to fieldID is set (has been assigned
	 * a value) and false otherwise
	 */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
		case SPOUT_OBJECT:
			return is_set_spout_object();
		case COMMON:
			return is_set_common();
		}
		throw new IllegalStateException();
	}

	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof SpoutSpec)
			return this.equals((SpoutSpec) that);
		return false;
	}

	public boolean equals(SpoutSpec that) {
		if (that == null)
			return false;

		boolean this_present_spout_object = true && this.is_set_spout_object();
		boolean that_present_spout_object = true && that.is_set_spout_object();
		if (this_present_spout_object || that_present_spout_object) {
			if (!(this_present_spout_object && that_present_spout_object))
				return false;
			if (!this.spout_object.equals(that.spout_object))
				return false;
		}

		boolean this_present_common = true && this.is_set_common();
		boolean that_present_common = true && that.is_set_common();
		if (this_present_common || that_present_common) {
			if (!(this_present_common && that_present_common))
				return false;
			if (!this.common.equals(that.common))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();

		boolean present_spout_object = true && (is_set_spout_object());
		builder.append(present_spout_object);
		if (present_spout_object)
			builder.append(spout_object);

		boolean present_common = true && (is_set_common());
		builder.append(present_common);
		if (present_common)
			builder.append(common);

		return builder.toHashCode();
	}

	public int compareTo(SpoutSpec other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;
		SpoutSpec typedOther = (SpoutSpec) other;

		lastComparison = Boolean.valueOf(is_set_spout_object()).compareTo(
				typedOther.is_set_spout_object());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (is_set_spout_object()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(
					this.spout_object, typedOther.spout_object);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(is_set_common()).compareTo(
				typedOther.is_set_common());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (is_set_common()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(
					this.common, typedOther.common);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		return 0;
	}

	public _Fields fieldForId(int fieldId) {
		return _Fields.findByThriftId(fieldId);
	}

	public void read(org.apache.thrift.protocol.TProtocol iprot)
			throws org.apache.thrift.TException {
		org.apache.thrift.protocol.TField field;
		iprot.readStructBegin();
		while (true) {
			field = iprot.readFieldBegin();
			if (field.type == org.apache.thrift.protocol.TType.STOP) {
				break;
			}
			switch (field.id) {
			case 1: // SPOUT_OBJECT
				if (field.type == org.apache.thrift.protocol.TType.STRUCT) {
					this.spout_object = new ComponentObject();
					this.spout_object.read(iprot);
				} else {
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
							field.type);
				}
				break;
			case 2: // COMMON
				if (field.type == org.apache.thrift.protocol.TType.STRUCT) {
					this.common = new ComponentCommon();
					this.common.read(iprot);
				} else {
					org.apache.thrift.protocol.TProtocolUtil.skip(iprot,
							field.type);
				}
				break;
			default:
				org.apache.thrift.protocol.TProtocolUtil
						.skip(iprot, field.type);
			}
			iprot.readFieldEnd();
		}
		iprot.readStructEnd();
		validate();
	}

	public void write(org.apache.thrift.protocol.TProtocol oprot)
			throws org.apache.thrift.TException {
		validate();

		oprot.writeStructBegin(STRUCT_DESC);
		if (this.spout_object != null) {
			oprot.writeFieldBegin(SPOUT_OBJECT_FIELD_DESC);
			this.spout_object.write(oprot);
			oprot.writeFieldEnd();
		}
		if (this.common != null) {
			oprot.writeFieldBegin(COMMON_FIELD_DESC);
			this.common.write(oprot);
			oprot.writeFieldEnd();
		}
		oprot.writeFieldStop();
		oprot.writeStructEnd();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("SpoutSpec(");
		boolean first = true;

		sb.append("spout_object:");
		if (this.spout_object == null) {
			sb.append("null");
		} else {
			sb.append(this.spout_object);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("common:");
		if (this.common == null) {
			sb.append("null");
		} else {
			sb.append(this.common);
		}
		first = false;
		sb.append(")");
		return sb.toString();
	}

	public void validate() throws org.apache.thrift.TException {
		// check for required fields
		if (!is_set_spout_object()) {
			throw new org.apache.thrift.protocol.TProtocolException(
					"Required field 'spout_object' is unset! Struct:"
							+ toString());
		}

		if (!is_set_common()) {
			throw new org.apache.thrift.protocol.TProtocolException(
					"Required field 'common' is unset! Struct:" + toString());
		}

	}

	private void writeObject(java.io.ObjectOutputStream out)
			throws java.io.IOException {
		try {
			write(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(out)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in)
			throws java.io.IOException, ClassNotFoundException {
		try {
			read(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

}
